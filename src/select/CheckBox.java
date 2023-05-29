package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

driver.get("https://artoftesting.com/samplesiteforselenium");

WebElement checkbox=driver.findElement(By.xpath("//input[@class='Automation'][1]"));

boolean issalected=checkbox.isSelected();
if(issalected==false)
{
	checkbox.click();
	System.out.println("is salected");
}


	}

}
