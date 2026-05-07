package data;

import org.testng.annotations.DataProvider;

public class LoginData {

    @DataProvider(name = "loginData")

    public Object[][] loginTestData() {

        return new Object[][] {

                {"Harikarthik", "HK@07102004s", true},

                {"wronguser", "wrongpass", false}
        };
    }
}
