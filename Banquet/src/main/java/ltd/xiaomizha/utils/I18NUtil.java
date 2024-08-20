package ltd.xiaomizha.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

public class I18NUtil {

    private static final String DEFAULT_LANGUAGE = LanguagesUtil.DEFAULT_LANGUAGE;
    private static final Locale DEFAULT_LOCALE = LanguagesUtil.DEFAULT_LOCALE;

    /**
     * 基于会话设置语言环境
     *
     * @param code    地区代码
     * @param request
     * @return Locale
     */
    public static Locale setLocaleInSession(String code, HttpServletRequest request) {
        Locale locale = LanguagesUtil.getLocaleForCode(code);
        saveLocaleInSession(locale, request);
        return locale;
    }

    /**
     * 基于Cookie设置语言环境
     *
     * @param code     地区代码
     * @param response
     * @return Locale
     */
    public static Locale setLocaleInCookie(String code, HttpServletResponse response) {
        Locale locale = LanguagesUtil.getLocaleForCode(code);
        saveLocaleInCookie(locale, response);
        return locale;
    }


    /**
     * 从浏览器获取首选语言环境
     *
     * @return Locale
     */
    public static Locale getLocaleFromBrowser() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        Locale[] supportedLocales = LanguagesUtil.getSupportedLanguages().values().toArray(new Locale[0]);

        // 获取浏览器首选语言列表
        Enumeration<Locale> preferredLocalesEnum = request.getLocales();
        // 将 Enumeration 转换为 Locale[] 数组
        List<Locale> preferredLocalesList = new ArrayList<>();
        while (preferredLocalesEnum.hasMoreElements()) {
            preferredLocalesList.add(preferredLocalesEnum.nextElement());
        }
        Locale[] preferredLocales = preferredLocalesList.toArray(new Locale[0]);

        // 尝试找到匹配的支持语言
        for (Locale preferred : preferredLocales) {
            for (Locale supported : supportedLocales) {
                if (supported.equals(preferred)) {
                    return supported;
                }
            }
        }

        return DEFAULT_LOCALE;
    }

    /**
     * 从会话获取语言环境
     *
     * @param request
     * @return Locale
     */
    public static Locale getLocaleFromSession(HttpServletRequest request) {
        return (Locale) request.getSession().getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
    }

    /**
     * 从会话获取语言环境
     *
     * @param request
     * @return Optional<Locale>
     */
    public static Optional<Locale> getLocaleFromSessionWithOptional(HttpServletRequest request) {
        return Optional.ofNullable((Locale) request.getSession().getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME));
    }

    /**
     * 从Cookie获取语言环境
     *
     * @param request
     * @return Locale
     */
    public static Locale getLocaleFromCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (CookieLocaleResolver.LOCALE_REQUEST_ATTRIBUTE_NAME.equals(cookie.getName())) {
                    String localeString = cookie.getValue();
                    return Locale.forLanguageTag(localeString);
                }
            }
        }
        return null;
    }

    /**
     * 从Cookie获取语言环境
     *
     * @param request
     * @return Optional<Locale>
     */
    public static Optional<Locale> getLocaleFromCookieWithOptional(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (CookieLocaleResolver.LOCALE_REQUEST_ATTRIBUTE_NAME.equals(cookie.getName())) {
                    String localeString = cookie.getValue();
                    return Optional.of(Locale.forLanguageTag(localeString));
                }
            }
        }
        return Optional.empty();
    }


    /**
     * 保存语言环境到会话中
     *
     * @param locale
     */
    public static void saveLocaleInSession(Locale locale, HttpServletRequest request) {
        request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
    }

    /**
     * 保存语言环境到Cookie中
     *
     * @param locale
     */
    public static void saveLocaleInCookie(Locale locale, HttpServletResponse response) {
        Cookie cookie = new Cookie(CookieLocaleResolver.LOCALE_REQUEST_ATTRIBUTE_NAME, locale.toString());
        cookie.setPath("/");  // 设置Cookie路径, 整个应用范围内可用
        // cookie.setSecure(true);  // HTTPS传输
        cookie.setHttpOnly(true);  // 防JS读Cookie
        cookie.setMaxAge(60 * 60 * 24 * 30);  // 有效期30天
        response.addCookie(cookie);
    }


    /**
     * 删除会话中的语言环境
     *
     * @param request
     */
    public static void removeLocaleFromSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.removeAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
        }
    }

    /**
     * 删除Cookie中的语言环境
     *
     * @param response
     */
    public static void removeLocaleFromCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie(CookieLocaleResolver.LOCALE_REQUEST_ATTRIBUTE_NAME, "");
        cookie.setPath("/");
        cookie.setSecure(true);
        cookie.setHttpOnly(true);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }


    /**
     * 更新会话中的语言环境
     *
     * @param locale
     * @param request
     */
    public static void updateLocaleInSession(Locale locale, HttpServletRequest request) {
        saveLocaleInSession(locale, request);
    }

    /**
     * 更新Cookie中的语言环境
     *
     * @param locale
     * @param response
     */
    public static void updateLocaleInCookie(Locale locale, HttpServletResponse response) {
        saveLocaleInCookie(locale, response);
    }
}
