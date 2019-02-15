package jenkinsgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Jason MK on 2019-02-15 at 3:12 PM
 */
@SpringBootApplication
@PropertySource("classpath:jenkins-git.properties")
public class JenkinsAndGit {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsAndGit.class, args);
    }

}
