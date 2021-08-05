package Pages;

import com.codeborne.selenide.Configuration;

import static ReadData.DataFromProperty.BROWSER;
import static ReadData.DataFromProperty.URL;
import static com.codeborne.selenide.Selenide.open;

class BasePage {


    protected void startBrowser() {
        Configuration.browser = BROWSER;
        Configuration.startMaximized = true  ;


        open(URL);

    }
}
