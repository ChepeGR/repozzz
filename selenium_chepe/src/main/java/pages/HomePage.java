package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.invoke.MethodHandles;

public class HomePage {
    private WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(MethodHandles.lookup().lookupClass());

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id ="coll-create_a_book")
    private WebElement crearLibroButtom;

    @FindBy(className ="vector-search-box-input")
    private WebElement searchBox;

    @FindBy(id = "searchButton")
    private WebElement searchButton;

    public SearchResultPage searchSomething(String something){
        searchBox.sendKeys(something);
        searchButton.click();
        return new SearchResultPage(driver);


    }
    public CrearLibroPage clickCrearLibroButtom(){
        crearLibroButtom.click();
        return new CrearLibroPage(driver);


    }

}
