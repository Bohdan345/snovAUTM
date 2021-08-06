import Pages.LoginPage;
import Pages.ProspectPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.WebDriverRunner.getAndCheckWebDriver;

public class PospectTest {

    @Test
    public void createNewList() {
        new LoginPage()
                .login();

        new ProspectPage()
                .createNewList();

    }


    @Test
    public void createNewFolder() {
        new LoginPage()
                .login();
        new ProspectPage()
                .createNewFolder();


    }

    @Test
    public void deleteFolder() {
        new LoginPage()
                .login();
        new ProspectPage()
                .deleteFolder();
        WebDriver driver = getAndCheckWebDriver();
        System.out.println(driver);
    }

}
