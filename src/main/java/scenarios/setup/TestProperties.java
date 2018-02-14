package scenarios.setup;

import org.aeonbits.owner.ConfigFactory;
import utils.TestConfig;

import java.util.Objects;

public class TestProperties {
    private static TestConfig config = null;

    public static TestConfig get() {
        if(Objects.isNull(config)) {
            config = ConfigFactory.create(TestConfig.class);
        }
        return config;
    }
}
