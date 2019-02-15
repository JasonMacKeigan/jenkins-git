import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jason MK on 2019-02-15 at 3:12 PM
 */
public class JenkinsAndGit {

    private final ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

    private static final double VERSION = 1.0;

    public static void main(String[] args) {
        JenkinsAndGit jenkinsAndGit = new JenkinsAndGit();

        jenkinsAndGit.service.scheduleAtFixedRate(() -> {
            System.out.println(String.format("version=%s", VERSION));
        }, 0, 10, TimeUnit.SECONDS);
    }
}
