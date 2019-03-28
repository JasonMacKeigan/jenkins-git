package jenkinsgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jason MK on 2019-03-28 at 5:35 PM
 */
@RestController
public class AcmeController {

    @GetMapping("/.well-known/acme-challenge/v86nYz6cPZyPX-4Nde_ERQN0M1dmTjpdkxphmPJx5oU")
    public String get() {
        return "someValue";
    }

}
