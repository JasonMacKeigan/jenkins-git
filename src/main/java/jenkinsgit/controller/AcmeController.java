package jenkinsgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Jason MK on 2019-03-28 at 5:35 PM
 */
@Controller
public class AcmeController {

    @GetMapping("/.well-known/acme-challenge/")
    public String get() {
        return "someValue";
    }

}
