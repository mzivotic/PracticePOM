package Base;


import Pages.AddRemoveElements;
import Pages.CheckBox;
import Pages.DropdownMenu;
import Pages.UploadPicture;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public CheckBox checkBox;
    public AddRemoveElements addRemoveElements;
    public DropdownMenu dropdownMenu;
    public UploadPicture uploadPicture;

@BeforeClass
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    checkBox = new CheckBox(driver, wait);
    addRemoveElements = new AddRemoveElements(driver,wait);
    dropdownMenu = new DropdownMenu(driver,wait);
    uploadPicture = new UploadPicture(driver, wait);

    }

    @AfterClass
    public void tearDown(){
    driver.quit();


    }

}

