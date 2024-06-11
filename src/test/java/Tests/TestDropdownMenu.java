package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDropdownMenu extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");

    }

    // Ovde sam iskopao drugi nacin jer nikako nisam uspeo da ga nateram da radi po principu domaceg od srede
    // Voleo bih kad budes imao vremena da bacis ponovo pogled na taj domaci i das mi smernice ako moze da se koristi
    // isti nacin da se uradi kroz POM

    @Test
    public void dropdownMenu(){
        dropdownMenu.dropdownMenuClick();
        dropdownMenu.selectOption1();
        Assert.assertEquals(dropdownMenu.getOption1().getText(), "Option 1");
        dropdownMenu.selectOption2();
        Assert.assertEquals(dropdownMenu.getOption2().getText(), "Option 2");
        driver.navigate().back();
    }
}
