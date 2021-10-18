package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.invoke.MethodHandles;

public class SearchResultPage {
    private WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(MethodHandles.lookup().lookupClass());

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstHeading")
    private WebElement resultTitle;

    public String getResultTitle(){
        return resultTitle.getText();
    }


}
