package ltd.xiaomizha.utils;

import ltd.xiaomizha.oauth.AuthConfig;
import ltd.xiaomizha.oauth.AuthConfigs;
import me.zhyd.oauth.enums.scope.AuthGiteeScope;
import me.zhyd.oauth.enums.scope.AuthHuaweiScope;
import me.zhyd.oauth.exception.AuthException;
import me.zhyd.oauth.request.AuthAlipayRequest;
import me.zhyd.oauth.request.AuthGiteeRequest;
import me.zhyd.oauth.request.AuthHuaweiRequest;
import me.zhyd.oauth.request.AuthRequest;
import me.zhyd.oauth.utils.AuthScopeUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

public final class UserUtil {

    private UserUtil() {
    }

    /**
     * 检查session中是否存在用户的登录状态标志
     *
     * @param request HttpServletRequest
     * @return boolean
     */
    public static boolean userLoggedIn(HttpServletRequest request) {
        return request.getSession().getAttribute("users") != null;
    }

    /**
     * 保存原始请求URI
     *
     * @param request         HttpServletRequest
     * @param originalRequest String
     */
    public static void setOriginalRequest(HttpServletRequest request, String originalRequest) {
        request.getSession().setAttribute("originalRequest", originalRequest);
    }

    /**
     * 获取原始请求URI
     *
     * @param request HttpServletRequest
     * @return String
     */
    public static String getOriginalRequest(HttpServletRequest request) {
        return (String) request.getSession().getAttribute("originalRequest");
    }

    /**
     * 读取Auth配置
     *
     * @param source String
     * @return me.zhyd.oauth.request.AuthRequest
     */
    public static AuthRequest getAuthRequest(String source) {
        AuthConfigs authConfigs = AuthConfigUtil.readAuthConfigsFromXml("user/auth-config.xml");

        if (authConfigs == null) {
            throw new AuthException("未获取到有效的Auth配置");
        }

        List<AuthConfig> configs = authConfigs.getConfigs();

        return configs.stream()
                .filter(c -> c.getId().equalsIgnoreCase(source))
                .map(config -> createAuthRequest(source, config))
                .findFirst()  // OR .findAny()
                .orElseThrow(() -> new AuthException("未找到匹配的Auth配置: " + source));
    }

    /**
     * Auth配置
     *
     * @param source String
     * @param config ltd.xiaomizha.oauth.AuthConfig
     * @return me.zhyd.oauth.request.AuthRequest
     */
    public static AuthRequest createAuthRequest(String source, ltd.xiaomizha.oauth.AuthConfig config) {
        switch (source.toLowerCase()) {
            case "huawei":
                return new AuthHuaweiRequest(me.zhyd.oauth.config.AuthConfig.builder()
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
                return new AuthGiteeRequest(me.zhyd.oauth.config.AuthConfig.builder()
                        .clientId(config.getClientId())
                        .clientSecret(config.getClientSecret())
                        .redirectUri(config.getRedirectUri())
                        .scopes(AuthScopeUtils.getScopes(AuthGiteeScope.values()))
                        .build());
            case "alipay":
                return new AuthAlipayRequest(me.zhyd.oauth.config.AuthConfig.builder()
                        .clientId(config.getClientId())
                        .clientSecret(config.getClientSecret())
                        .redirectUri(config.getRedirectUri())
                        .build(), config.getAlipayPublicKey());
            default:
                throw new IllegalArgumentException("暂不支持的三方登录: " + source);
        }
    }
}
