import Pages.LoginPage;
import org.junit.Test;

public class LoginTest {


    @Test
    public void login() {
        new LoginPage()
                .login();

    }
}
