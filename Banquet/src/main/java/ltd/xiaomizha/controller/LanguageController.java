package ltd.xiaomizha.controller;

import ltd.xiaomizha.utils.I18NUtil;
import ltd.xiaomizha.utils.LanguagesUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/lang/")
@SessionAttributes({""})
public class LanguageController {

    /**
     * 语言环境切换
     *
     * @param lang      地区代码
     * @param returnUrl 希望返回的 URL
     * @param request   HttpServletRequest
     * @param response  HttpServletResponse
     */
    @GetMapping("{lang}/")
    public void switchLanguage(@PathVariable(value = "lang", required = false) String lang,
                               @RequestParam(value = "returnUrl", defaultValue = "/") String returnUrl,
                               HttpServletRequest request,
                               HttpServletResponse response) {
        Locale locale = I18NUtil.setLocaleInSession(lang, request);
        try {
            response.sendRedirect(returnUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 受支持的语言环境
     *
     * @return Map<String, Locale>
     */
    @GetMapping("languages")
    @ResponseBody
    public Map<String, Locale> getSupportedLanguages() {
        return LanguagesUtil.getSupportedLanguages();
    }
}
