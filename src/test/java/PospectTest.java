import Pages.LoginPage;
import Pages.ProspectPage;
import org.junit.Test;

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

    }
}
