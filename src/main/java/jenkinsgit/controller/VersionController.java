package jenkinsgit.controller;

import jenkinsgit.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jason MK on 2019-02-15 at 3:31 PM
 */
@Controller
public class VersionController {

    @Autowired
    private VersionService versionService;

    @RequestMapping(value = { "/version", "/version.html" })
    public String get(Model model) {
        model.addAttribute("version", versionService.getVersion());

        return "version.html";
    }
}
