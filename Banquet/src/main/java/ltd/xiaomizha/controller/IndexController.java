package ltd.xiaomizha.controller;

import ltd.xiaomizha.utils.I18NUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Controller
@RequestMapping("/")
@SessionAttributes({""})
public class IndexController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping("index")
    public String index(Model model,
                        HttpServletRequest request,
                        HttpServletResponse response) {
        Locale locale = I18NUtil.getLocaleFromCookieWithOptional(request)
                .orElseGet(() -> I18NUtil.getLocaleFromSessionWithOptional(request).orElse(I18NUtil.getLocaleFromBrowser()));
        I18NUtil.saveLocaleInSession(locale, request);
        return "index";
    }
}
