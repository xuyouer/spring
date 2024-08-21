package ltd.xiaomizha.utils;

import org.springframework.util.AntPathMatcher;

import java.util.HashMap;
import java.util.Map;

public final class RouterUtil {

    private RouterUtil() {
    }

    private static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();
    private static final Map<String, Boolean> PATH_LOGIN_REQUIRED = new HashMap<>();
    public static final String LOGIN_PATH = "/users/login";

    static {
        // 特定路径
        PATH_LOGIN_REQUIRED.put("/**", false);
        PATH_LOGIN_REQUIRED.put("/users/**", false);
        PATH_LOGIN_REQUIRED.put("/lang/**", false);
        PATH_LOGIN_REQUIRED.put("/captcha/**", false);
        PATH_LOGIN_REQUIRED.put("/QRCode/**", false);
        PATH_LOGIN_REQUIRED.put("/oauth/**", false);

        // 公共资源
        PATH_LOGIN_REQUIRED.put("/css/**", false);
        PATH_LOGIN_REQUIRED.put("/js/**", false);
        PATH_LOGIN_REQUIRED.put("/font/**", false);
        PATH_LOGIN_REQUIRED.put("/icon/**", false);
        PATH_LOGIN_REQUIRED.put("/images/**", false);
    }

    public static boolean loginRequired(String path) {
        return PATH_LOGIN_REQUIRED.entrySet()
                .stream()
                .filter(entry -> PATH_MATCHER.match(entry.getKey(), path))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(true);
    }
}
