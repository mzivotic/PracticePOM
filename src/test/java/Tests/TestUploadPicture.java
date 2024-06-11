package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestUploadPicture extends BaseTest {

    @BeforeMethod
    public void PageSetUp(){

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void uploadPicture(){
        uploadPicture.getUploadPictureLink().click();
        uploadPicture.pictureUploadPath();
        uploadPicture.getUploadButton().click();

        String expectedMessage = "test-upload.jpg";
        Assert.assertEquals(uploadPicture.getActualUpload().getText(),expectedMessage);

    }
}
