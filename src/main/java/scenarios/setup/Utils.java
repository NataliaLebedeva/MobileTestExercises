package scenarios.setup;

import java.net.MalformedURLException;
import java.net.URL;

public class Utils {
    public static URL createUrl() {
        URL url = null;
        try {
            url = new URL(TestProperties.get().deviceUrl());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }
}
