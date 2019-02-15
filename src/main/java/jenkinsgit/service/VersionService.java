package jenkinsgit.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Jason MK on 2019-02-15 at 3:39 PM
 */
@Service
public class VersionService {

    @Value("${version}")
    private double version;

    public double getVersion() {
        return version;
    }
}
