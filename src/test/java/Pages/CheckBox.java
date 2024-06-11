package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

    public WebDriver driver;
    public WebDriverWait wait;

    WebElement checkbox;
    WebElement checkbox1;
    WebElement checkbox2;

    public CheckBox(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }

    public WebElement getCheckbox(){
        return driver.findElement(By.linkText("Checkboxes"));
    }
    public WebElement getCheckbox1(){
        return driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
    }
    public WebElement getCheckbox2(){
        return driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
    }



    public void checkboxClick(){
        getCheckbox().click();
    }
    public void checkbox1Click(){
        getCheckbox1().click();
    }
    public void checkbox2Click(){
        getCheckbox2().click();
    }



}
