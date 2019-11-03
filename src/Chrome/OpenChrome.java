package Chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class OpenChrome {

	public void OpenUrl() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/users/balaje/chromedriver");

// Initialize browser
        WebDriver driver = new ChromeDriver();

// Open facebook
        driver.get("http://www.cic.gc.ca/");
        driver.navigate().refresh();
        //driver.findElement(By.name("email")).sendKeys("balajiprabakar@gmail.com");
        //driver.findElement(By.name("pass")).sendKeys("Balaji@1989e");
        //driver.findElement(By.id("loginbutton")).click();
        //driver.findElement(By.xpath("//*[@id=\'js_iz\']/form/button/i")).click();


// Maximize browser

        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/section[1]/p/a\n")).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
        driver.findElement(By.xpath("//*[@id=\'wb-auto-6\']/div[1]/section/h3/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\'wb-auto-5\']/div[1]/section/h3/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\'wb-auto-6\']/div[1]/section/div/p[2]/a\n")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\'token1\']")).sendKeys("balajersundaramp");
        driver.findElement(By.xpath("//*[@id=\'token2\']")).sendKeys("Password1!");
        //driver.findElement(By.xpath("//*[@id=\'login\']/div[3]/div/button")).click();
       // driver.findElement(By.cssSelector())


        //driver.findElement(By.xpath("//*[@id=\'userNavigationLabel\']")).click();

        //this.takeSnapShot(driver, "/users/balaje/Downloads/FailedScr/test.png") ;

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        File DestFile=new File("/users/balaje/Screenshots/"+date+".png");

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);
        driver.quit();
        
        var htmlReporter = new ExtentHtmlReporter("/users/balaje/Screenshots/extentreports/reports/");
        var extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        var test = extent.createTest("Extend Test Case");
        test.log(Status.INFO, "Test case starts");
        test.log(Status.PASS, "Test case for pass");
        test.log(Status.FAIL, "Test case for fail");

    }
	
    private boolean IsTrue(boolean b, String string) {
		// TODO Auto-generated method stub
		return false;
	}

	//public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

//        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

  //      File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

    //    File DestFile=new File(fileWithPath);

        //Copy file at destination

      //  FileUtils.copyFile(SrcFile, DestFile);

    //}
    
    
    public static void main(String[] args) throws Exception {
        OpenChrome p1 = new OpenChrome();
p1.OpenUrl();
    }

}



