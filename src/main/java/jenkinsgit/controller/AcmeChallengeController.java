package jenkinsgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Jason MK on 2019-03-28 at 5:35 PM
 */
@RestController
public class AcmeChallengeController {

    @GetMapping(value = "/.well-known/acme-challenge/**")
    public String get(HttpServletRequest request) {
        String url = request.getRequestURL().toString();

        int indexOfSplitter = url.lastIndexOf("/");

        if (indexOfSplitter != -1) {
            url = url.substring(indexOfSplitter + 1);
        }
        Path file = Paths.get("src", "main", "resources", "templates", ".well-known", "acme-challenge", url);

        if (Files.exists(file)) {
            try {
                return Files.readAllLines(file).stream().findFirst().orElseThrow(NullPointerException::new);
            } catch (IOException | NullPointerException npe) {
                throw new IllegalStateException("Error while processing file.", npe);
            }
        }
        throw new IllegalStateException("Cannot find file.");
    }

}
