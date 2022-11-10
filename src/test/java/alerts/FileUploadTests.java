package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile(Paths.get("D:\\21-22 Bahar\\Kafein-Staj" +
                "\\seleniumWebDriverWithJava\\webdriver_java\\resources\\chromedriver.exe").toString());
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver", "Uploaded files incorrect");
    }
}
