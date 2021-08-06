package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static Utils.RandomData.getRandomInt;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getAndCheckWebDriver;

public class ProspectPage {


    SelenideElement createFolderButton = $x("//div[@data-test='aside-create-folder']");
    SelenideElement createFolderModalTitle = $x("//p[text()='Create a new folder']");

    SelenideElement addNewList = $x("//button[@data-test='aside-create-new-lists']");
    SelenideElement myListsDropDow = $x("//span[@class='name']");
    SelenideElement createOrImportButton = $x("//div[@data-test='add-human']");
    SelenideElement importFromFileButton = $x("//ul[@data-test='add-human-list']//li[1]");
    SelenideElement customFieldButton = $x("//div[@data-test='add-custom-fields']");
    SelenideElement exportButton = $x("//div[@data-test='export-prospects-button']");
    SelenideElement dublicateButton = $x("//div[@data-test='filter-duplicates']");
    SelenideElement createButton = $x("//span[text()='Create']");
    SelenideElement nameField = $x("//input[@id='createNewList']");
    SelenideElement createListModalTitle = $x("//p[text()='Create a new prospects list']");

    ElementsCollection listElements = $$x("//li[@class='aside__item-relative']");
    ElementsCollection folderElements = $$x("//li[@class='folder-box']");
    ElementsCollection folderContextMenu = $$(".folder-box >* .control");
    ElementsCollection dropDownElements = $$(".folder-box >* .control__drop li");
    WebDriver d;

    public void createNewList() {
        addNewList.click();
        createListModalTitle.shouldBe(Condition.visible);
        nameField.sendKeys(Keys.BACK_SPACE);
        String listNameText = "List " + getRandomInt(1, 9999);
        nameField.setValue(listNameText);
        createButton.click();
        listElements.findBy(Condition.text(listNameText)).scrollIntoView(true).click();
    }


    public void createNewFolder() {
        createFolderButton.click();
        createFolderModalTitle.shouldBe(Condition.visible);
        nameField.clear();
        String folderNameText = "Folder " + getRandomInt(1, 9999);
        nameField.setValue(folderNameText);
        createButton.click();
        folderElements.findBy(Condition.text(folderNameText)).scrollIntoView(true).click();

        Selenide.sleep(3000);

    }


    public void deleteFolder() {
        if (folderElements.size() > 0)
            folderContextMenu.first().click();
        dropDownElements.filterBy(Condition.exactText("Delete folder")).first().click();
        d = webdriver().driver().getWebDriver();
        Selenide.sleep(3000);


    }


}
