package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddRemoveElements {

    public WebDriver driver;
    public WebDriverWait wait;
    public WebElement getDeleteElementButton;


    WebElement addRemoveElements;
    WebElement addElementButton;
    WebElement deleteElementButton;

    public AddRemoveElements(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }

    public WebElement getAddRemoveElements(){
        return driver.findElement(By.linkText("Add/Remove Elements"));
    }
    public WebElement getAddElementButton(){
        return driver.findElement(By.cssSelector("button[onclick='addElement()']"));
    }
    public WebElement getDeleteElementButton(){
        return driver.findElement(By.cssSelector(".added-manually"));
    }




    public void addRemoveElementsClick(){
        getAddRemoveElements().click();
    }
    public void addElementButtonClick(){
        getAddElementButton().click();
    }
    public void deleteElementButtonClick(){
        getDeleteElementButton().click();
    }

}
