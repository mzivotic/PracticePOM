package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownMenu {

    public WebDriver driver;
    public WebDriverWait wait;

    // Ovde sam iskopao drugi nacin jer nikako nisam uspeo da ga nateram da radi po principu domaceg od srede
    // Voleo bih kad budes imao vremena da bacis ponovo pogled na taj domaci i das mi smernice ako moze da se koristi
    // isti nacin da se uradi kroz POM


    By dropdownMenu = By.id("dropdown");
    By option1 = By.xpath("//option[@value='1']");
    By option2 = By.xpath("//option[@value='2']");


    public DropdownMenu(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void dropdownMenuClick() {
        driver.findElement(dropdownMenu).click();
    }

    public void selectOption1() {
        Select dropdown = new Select(driver.findElement(dropdownMenu));
        dropdown.selectByValue("1");
    }

    public void selectOption2() {
        Select dropdown = new Select(driver.findElement(dropdownMenu));
        dropdown.selectByValue("2");
    }

    public WebElement getOption1() {
        return driver.findElement(option1);
    }

    public WebElement getOption2() {
        return driver.findElement(option2);
    }
}