package Wikipedia;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class Wiki {
	private static final String String = null;


	public void Open() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/users/balaje/chromedriver");

// Initialize browser
        WebDriver driver = new ChromeDriver();

// Open facebook
        driver.get("https://en.wikipedia.org/wiki/Programming_languages_used_in_most_popular_websites");
        driver.navigate().refresh();
        //driver.findElement(By.name("email")).sendKeys("balajiprabakar@gmail.com");
        //driver.findElement(By.name("pass")).sendKeys("Balaji@1989e");
        //driver.findElement(By.id("loginbutton")).click();
        //driver.findElement(By.xpath("//*[@id=\'js_iz\']/form/button/i")).click();

        WebElement elemTable = driver.findElement(By.xpath("//div[@id='mw-content-text']//table[1]"));
        		// Maximize browser
List<WebElement> lstTrElem = driver.findElements(By.tagName("tr"));
String strRowData = "";
for (var elemTr : lstTrElem) {
List<WebElement> lstTdElem = driver.findElements(By.tagName("td"));
if (lstTdElem.size() > 0)
{
	for (var elemTd : lstTdElem) {
		 strRowData = strRowData + elemTd.getText() + "\t\t";
	}
}
else {
 System.out.println("This is Header Row");
}
 System.out.println(strRowData);
strRowData = "";
}
 System.out.println("");
	}

	public static void main(String[] args) throws Exception {
		Wiki p1 = new Wiki();
p1.Open();
    }
}


	

