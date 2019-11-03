package Excel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main (String [] args) throws IOException, InterruptedException{
        //I have placed an excel file 'Test.xlsx' in my D Driver 
FileInputStream fis = new FileInputStream("/users/balaje/Test.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheetAt(0);
        //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
Row row = sheet.getRow(0);
Cell cell = row.getCell(0);
       	System.out.println(cell);
System.out.println(sheet.getRow(0).getCell(0));
//String cellval = cell.getStringCellValue();
//System.out.println(cellval);
System.setProperty("webdriver.chrome.driver", "/users/balaje/chromedriver");

//Initialize browser
WebDriver driver = new ChromeDriver();

//Open facebook
String website;
String username;
String password;



    website = sheet.getRow(0).getCell(0).toString();
    username = sheet.getRow(1).getCell(0).toString();
    password = sheet.getRow(2).getCell(0).toString();

    driver.navigate().to(website);


var userNameField = driver.findElement(By.id("email"));
var userPasswordField = driver.findElement(By.id("pass"));


// Type user name and password
userNameField.sendKeys(username);
userPasswordField.sendKeys(password);
Thread.sleep(30);
driver.close();
}
}