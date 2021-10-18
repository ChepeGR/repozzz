package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.invoke.MethodHandles;

public class CrearLibroPage {
    private WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(MethodHandles.lookup().lookupClass());


    public CrearLibroPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);}

    @FindBy(css ="h5.collection-box-heading.collection-icon-warning")
    private WebElement resultTitle;

    public String getResultTitle(){
        return resultTitle.getText();
    }







}
