package jenkinsgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jason MK on 2019-03-28 at 5:35 PM
 */
@RestController
public class AcmeController {

    @GetMapping("/.well-known/acme-challenge/AA1fpCwJqQcXavYtr70Q0PidHPMGkYCTvzNhovur56A")
    public String get() {
        return "someValue";
    }

}
