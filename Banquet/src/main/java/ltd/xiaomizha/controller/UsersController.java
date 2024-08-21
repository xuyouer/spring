package ltd.xiaomizha.controller;

import ltd.xiaomizha.bean.UserDetails;
import ltd.xiaomizha.bean.UserRolesRelation;
import ltd.xiaomizha.bean.Users;
import ltd.xiaomizha.service.UsersService;
import ltd.xiaomizha.utils.UserUtil;
import ltd.xiaomizha.vo.UserRoleVo;
import ltd.xiaomizha.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/users/")
@SessionAttributes({"users"})
public class UsersController {
    @Autowired
    private UsersService usersService;

    /**
     * 处理任何 GET 请求, 检查登录状态
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @return String
     */
    @GetMapping("**")
    public String anyGetRequest(HttpServletRequest request, HttpServletResponse response) {
        if (!UserUtil.userLoggedIn(request)) {
            String originalRequest = request.getRequestURI();
            UserUtil.setOriginalRequest(request, originalRequest);
            return "redirect:/users/login";
        }
        return "redirect:/";
    }

    /**
     * 显示登录页
     *
     * @param request HttpServletRequest
     * @param model   Model
     * @return String
     */
    @GetMapping("login")
    public String login(HttpServletRequest request, Model model) {
        String originalRequest = UserUtil.getOriginalRequest(request);
        model.addAttribute("originalRequest", originalRequest);
        return "layout/login";
    }

    /**
     * 显示注册页
     *
     * @param request HttpServletRequest
     * @param model   Model
     * @return String
     */
    @GetMapping("register")
    public String register(HttpServletRequest request, Model model) {
        return "layout/register";
    }

    /**
     * 登录功能
     *
     * @param request  HttpServletRequest
     * @param model    Model
     * @param username 用户名
     * @param password 密码
     * @return String
     */
    @PostMapping("doLogin")
    public String login(HttpServletRequest request, Model model, String username, String password) {
        Users users = usersService.getUserByUsernameAndPassword(username, password);
        if (users != null) {
            model.addAttribute("users", users);

            String originalRequest = UserUtil.getOriginalRequest(request);
            if (originalRequest != null) {
                request.getSession().removeAttribute("originalRequest");
                return "redirect:" + originalRequest;
            } else {
                return "redirect:/";
            }
        } else {
            return "redirect:/users/login";
        }
    }

    /**
     * 注册功能
     *
     * @param model Model
     * @param users Users
     * @return String
     */
    @PostMapping("doRegister")
    public String register(Model model, Users users) {
        UserVo userVo = new UserVo();
        userVo.setUsers(new Users(users.getUsername(), users.getPassword()));
        userVo.setUserDetails(new UserDetails());
        userVo.setUserRoleVo(new UserRoleVo(new UserRolesRelation(null, 1)));
        boolean flag = usersService.addUserVo(userVo);
        if (flag) {
            return "redirect:/";
        } else {
            return "redirect:/users/register";
        }
    }

    /**
     * 注销功能
     *
     * @param session HttpSession
     * @param status  SessionStatus
     * @return String
     */
    @GetMapping("logout")
    public String logout(HttpSession session, SessionStatus status) {
        session.removeAttribute("users");
        status.setComplete();
        return "redirect:/";
    }
}
