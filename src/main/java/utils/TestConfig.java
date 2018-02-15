package utils;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:test.properties"
})
public interface TestConfig extends Config {
    String type();

    String domain();

    String deviceUrl();

    String appPath();

    String deviceID();

    String platform();

    String browser();
}
