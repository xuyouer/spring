package ltd.xiaomizha.controller;

import ltd.xiaomizha.service.UsersService;
import ltd.xiaomizha.utils.UserUtil;
import me.zhyd.oauth.model.AuthCallback;
import me.zhyd.oauth.model.AuthResponse;
import me.zhyd.oauth.request.AuthRequest;
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
import java.util.Collections;

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
        AuthRequest authRequest = UserUtil.getAuthRequest(source);
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
        AuthRequest authRequest = UserUtil.getAuthRequest(source);
        AuthResponse response = authRequest.login(callback);
        System.out.println("response = " + response.getData());
        // if (response.ok()) {
        //     // AuthUser authUser = usersService.addAuthUser(response.getData());
        //     // return new ModelAndView("redirect:/", Collections.singletonMap("users", authUser));
        //     return new ModelAndView("redirect:/");
        // }
        return new ModelAndView("redirect:/", Collections.singletonMap("error", response.getMsg()));
    }
}
