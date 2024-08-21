package ltd.xiaomizha.interceptor;

import ltd.xiaomizha.utils.I18NUtil;
import ltd.xiaomizha.utils.LanguagesUtil;
import ltd.xiaomizha.utils.RouterUtil;
import ltd.xiaomizha.utils.UserUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

public class RouterInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Locale locale = I18NUtil.getLocaleFromRequest(request);
        I18NUtil.saveLocaleInSession(locale, request);
        setLanguageAttributes(request, locale);

        String path = request.getRequestURI();
        boolean loginRequired = RouterUtil.loginRequired(path);
        System.out.println("Path: " + path + ", Login Required: " + loginRequired);

        return handleLoginCheck(loginRequired, request, response, path);
    }

    private boolean handleLoginCheck(boolean loginRequired, HttpServletRequest request, HttpServletResponse response, String path) throws IOException {
        if (loginRequired && !UserUtil.userLoggedIn(request)) {
            UserUtil.setOriginalRequest(request, path);
            response.sendRedirect(RouterUtil.LOGIN_PATH);
            return false;
        }
        return true;
    }

    private void setLanguageAttributes(HttpServletRequest request, Locale locale) {
        request.getSession().setAttribute("lang", LanguagesUtil.getCodeForLocale(locale));
        request.getSession().setAttribute("langName", LanguagesUtil.getDisplayName(locale, true));
        Map<String, String> languages = LanguagesUtil.getNames(LanguagesUtil.NameType.DISPLAY, true);
        request.getSession().setAttribute("languages", languages);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
