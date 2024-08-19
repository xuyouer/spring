package ltd.xiaomizha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/{lang}/")
@SessionAttributes({""})
public class LanguageController {

    // @GetMapping("{page}")
    // public String page(@PathVariable(value = "lang", required = false) String lang,
    //                    @PathVariable("page") String page,
    //                    Model model,
    //                    HttpServletRequest request,
    //                    HttpServletResponse response) {
    //     Locale locale = I18NUtil.setLocaleInSession(lang, request);
    //     return page;
    // }
}
