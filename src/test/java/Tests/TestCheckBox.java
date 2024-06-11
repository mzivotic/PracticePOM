package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCheckBox extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

    }

    @Test
    public void checkBox(){

        checkBox.checkboxClick();
        checkBox.checkbox1Click();
        checkBox.checkbox2Click();
        Assert.assertTrue(checkBox.getCheckbox1().isSelected());
        Assert.assertFalse(checkBox.getCheckbox2().isSelected());
        driver.navigate().back();

    }
}
