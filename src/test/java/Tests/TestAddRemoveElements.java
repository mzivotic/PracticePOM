package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAddRemoveElements extends BaseTest {

    @BeforeMethod
    public void PageSetUp() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void addRemoveElements() throws InterruptedException {
        addRemoveElements.addRemoveElementsClick();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[onclick='addElement()']")));
        addRemoveElements.addElementButtonClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".added-manually")));
        Assert.assertTrue(addRemoveElements.getDeleteElementButton().isDisplayed());
        addRemoveElements.deleteElementButtonClick();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".added-manually")));
        Assert.assertTrue(driver.findElements(By.cssSelector(".added-manually")).isEmpty());
        driver.navigate().back();
    }
}
