package in.testcase;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProdServer {
    public static final String SERVER = "http://site4.nobroker.in/";

    @Test
    public void configurationValidation() {
        assertTrue(Constant.SERVER.equals(SERVER));
    }
}
