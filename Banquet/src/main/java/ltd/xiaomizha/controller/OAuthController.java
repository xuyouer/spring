package ltd.xiaomizha.controller;

import ltd.xiaomizha.oauth.AuthConfigs;
import ltd.xiaomizha.service.UsersService;
import ltd.xiaomizha.utils.AuthConfigUtil;
import me.zhyd.oauth.config.AuthConfig;
import me.zhyd.oauth.enums.scope.AuthGiteeScope;
import me.zhyd.oauth.enums.scope.AuthHuaweiScope;
import me.zhyd.oauth.exception.AuthException;
import me.zhyd.oauth.model.AuthCallback;
import me.zhyd.oauth.model.AuthResponse;
import me.zhyd.oauth.request.AuthAlipayRequest;
import me.zhyd.oauth.request.AuthGiteeRequest;
import me.zhyd.oauth.request.AuthHuaweiRequest;
import me.zhyd.oauth.request.AuthRequest;
import me.zhyd.oauth.utils.AuthScopeUtils;
import me.zhyd.oauth.utils.AuthStateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/oauth")
@SessionAttributes({"users"})
public class OAuthController {
    @Autowired
    private UsersService usersService;

    /**
     * 创建授权
     *
     * @param source
     * @param response
     * @throws IOException
     */
    @RequestMapping("/render/{source}")
    @ResponseBody
    public void renderAuth(@PathVariable("source") String source, HttpServletResponse response) throws IOException {
        AuthRequest authRequest = getAuthRequest(source);
        response.sendRedirect(authRequest.authorize(AuthStateUtils.createState()));
    }

    /**
     * 回调-保存-登录
     *
     * @param source
     * @param callback
     * @return
     */
    @RequestMapping("/callback/{source}")
    public Object login(@PathVariable("source") String source, AuthCallback callback) {
        AuthRequest authRequest = getAuthRequest(source);
        AuthResponse response = authRequest.login(callback);
        System.out.println("response = " + response.getData());
        // if (response.ok()) {
        //     // AuthUser authUser = usersService.addAuthUser(response.getData());
        //     // return new ModelAndView("redirect:/", Collections.singletonMap("users", authUser));
        //     return new ModelAndView("redirect:/");
        // }
        return new ModelAndView("redirect:/", Collections.singletonMap("error", response.getMsg()));
    }

    private AuthRequest getAuthRequest(String source) {
        AuthConfigs authConfigs = AuthConfigUtil.readAuthConfigsFromXml("auth-config.xml");

        if (authConfigs == null) {
            throw new AuthException("未获取到有效的Auth配置");
        }

        List<ltd.xiaomizha.oauth.AuthConfig> configs = authConfigs.getConfigs();

        return configs.stream()
                .filter(c -> c.getId().equalsIgnoreCase(source))
                .map(config -> createAuthRequest(source, config))
                .findFirst()  // OR .findAny()
                .orElseThrow(() -> new AuthException("未找到匹配的Auth配置: " + source));
    }

    private AuthRequest createAuthRequest(String source, ltd.xiaomizha.oauth.AuthConfig config) {
        switch (source.toLowerCase()) {
            case "huawei":
                return new AuthHuaweiRequest(AuthConfig.builder()
                        .clientId(config.getClientId())
                        .clientSecret(config.getClientSecret())
                        .redirectUri(config.getRedirectUri())
                        .scopes(Arrays.asList(
                                AuthHuaweiScope.BASE_PROFILE.getScope(),
                                AuthHuaweiScope.MOBILE_NUMBER.getScope(),
                                AuthHuaweiScope.ACCOUNTLIST.getScope(),
                                AuthHuaweiScope.SCOPE_DRIVE_FILE.getScope(),
                                AuthHuaweiScope.SCOPE_DRIVE_APPDATA.getScope()
                        ))
                        .build());
            case "gitee":
                return new AuthGiteeRequest(AuthConfig.builder()
                        .clientId(config.getClientId())
                        .clientSecret(config.getClientSecret())
                        .redirectUri(config.getRedirectUri())
                        .scopes(AuthScopeUtils.getScopes(AuthGiteeScope.values()))
                        .build());
            case "alipay":
                return new AuthAlipayRequest(AuthConfig.builder()
                        .clientId(config.getClientId())
                        .clientSecret(config.getClientSecret())
                        .redirectUri(config.getRedirectUri())
                        .build(), config.getAlipayPublicKey());
            default:
                throw new IllegalArgumentException("暂不支持的三方登录: " + source);
        }
    }
}
