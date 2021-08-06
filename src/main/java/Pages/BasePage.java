package Pages;


import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;

import static ReadData.DataFromProperty.BROWSER;
import static ReadData.DataFromProperty.URL;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverRunner.getAndCheckWebDriver;

public class BasePage {


    protected void startBrowser() {

        Configuration.browser = BROWSER;
        Configuration.startMaximized = true;
        open(URL);

    }


    protected void destroy() {


    }

}
