package tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CrearLibroPage;
import pages.SearchResultPage;

import java.lang.invoke.MethodHandles;


public class LoginTest extends BaseTest {

    private static final Logger LOGGER = Logger.getLogger(MethodHandles.lookup().lookupClass());


    @Test
    public void searchSomethingTst(){
        SearchResultPage searchResultPage= homePage.searchSomething("san martin");

        Assert.assertEquals(searchResultPage.getResultTitle(), "San Martín");


    }
    @Test
    public void CrearLibroPg(){
        CrearLibroPage crearLibroPage= homePage.clickCrearLibroButtom();

        Assert.assertEquals(crearLibroPage.getResultTitle(),"El Creador de libros está recibiendo modificaciones");


    }

}
