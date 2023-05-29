package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://artoftesting.com/samplesiteforselenium");
    WebElement radio=driver.findElement(By.xpath("//input[@id='male'][1]"));
    boolean issalected=radio.isSelected();
    if(issalected==false)
    {
    	radio.click();
    }
	}

}
