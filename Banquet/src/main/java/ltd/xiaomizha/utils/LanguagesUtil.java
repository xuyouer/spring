package ltd.xiaomizha.utils;

import java.util.*;
import java.util.stream.Collectors;

public final class LanguagesUtil {

    private LanguagesUtil() {
    }

    private static final Map<String, Locale> SUPPORTED_LANGUAGES = new HashMap<>();

    public static final String DEFAULT_LANGUAGE = "zh_CN";
    public static final Locale DEFAULT_LOCALE = Locale.forLanguageTag("zh-CN");

    static {
        SUPPORTED_LANGUAGES.put("cn", Locale.SIMPLIFIED_CHINESE);
        SUPPORTED_LANGUAGES.put("tw", Locale.TRADITIONAL_CHINESE);
        SUPPORTED_LANGUAGES.put("us", Locale.US);
        SUPPORTED_LANGUAGES.put("ru", new Locale("ru", "RU"));
    }

    public static Locale getLocaleForCode(String code) {
        return SUPPORTED_LANGUAGES.getOrDefault(code.toLowerCase(), DEFAULT_LOCALE);
    }

    public static String getCodeForLocale(Locale locale) {
        return SUPPORTED_LANGUAGES
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(locale))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public static Set<String> getSupportedCodes() {
        return SUPPORTED_LANGUAGES.keySet();
    }

    public static Map<String, Locale> getSupportedLanguages() {
        return Collections.unmodifiableMap(new HashMap<>(SUPPORTED_LANGUAGES));
    }

    public static String getLanguageName(String code, boolean useDisplayLanguage) {
        Locale locale = getLocaleForCode(code);
        return getLanguageName(locale, useDisplayLanguage);
    }

    public static String getCountryName(String code, boolean useDisplayCountry) {
        Locale locale = getLocaleForCode(code);
        return getCountryName(locale, useDisplayCountry);
    }

    public static String getDisplayName(String code, boolean useDisplayName) {
        Locale locale = getLocaleForCode(code);
        return getDisplayName(locale, useDisplayName);
    }

    public static String getLanguageName(Locale locale, boolean useDisplayLanguage) {
        return useDisplayLanguage ? locale.getDisplayLanguage(locale) : locale.getDisplayLanguage();
    }

    public static String getCountryName(Locale locale, boolean useDisplayCountry) {
        return useDisplayCountry ? locale.getDisplayCountry(locale) : locale.getDisplayCountry();
    }

    public static String getDisplayName(Locale locale, boolean useDisplayName) {
        return useDisplayName ? locale.getDisplayName(locale) : locale.getDisplayName();
    }

    public static Map<String, String> getNames(NameType type, boolean useDisplay) {
        return SUPPORTED_LANGUAGES
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> getName(type, entry.getValue(), useDisplay)
                ));
    }

    private static String getName(NameType type, Locale locale, boolean useDisplay) {
        switch (type) {
            case LANGUAGE:
                return getLanguageName(locale, useDisplay);
            case COUNTRY:
                return getCountryName(locale, useDisplay);
            case DISPLAY:
                return getDisplayName(locale, useDisplay);
            default:
                throw new IllegalArgumentException("Unsupported NameType: " + type);
        }
    }

    public enum NameType {
        LANGUAGE,  // 语言名称
        COUNTRY,  // 国家/地区名称
        DISPLAY,  // 语言环境的完整名称
    }
}
