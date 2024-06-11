package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadPicture {

    public WebDriver driver;
    public WebDriverWait wait;

    WebElement uploadPictureLink;
    WebElement chooseFile;
    WebElement uploadButton;
    WebElement actualUpload;

    public UploadPicture(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }

    public WebElement getUploadPictureLink(){
        return  driver.findElement(By.linkText("File Upload"));
    }
    public WebElement getChooseFile(){
        return  driver.findElement(By.id("file-upload"));
    }
    public WebElement getUploadButton(){
        return driver.findElement(By.id("file-submit"));
    }
    public WebElement getActualUpload(){
        return  driver.findElement(By.id("uploaded-files"));
    }



    public void uploadPictureLinkClick(){
        getUploadPictureLink().click();
    }
    public void pictureUploadPath(){
        String pictureLocation = "C:\\Users\\milos\\Desktop\\test-upload.jpg";
        getChooseFile().sendKeys(pictureLocation);
    }

    public void uploadButtonClick(){
        getUploadButton().click();
    }

    public String expectedUpload(){
        return getActualUpload().getText();
    }
}
