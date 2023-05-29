package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		    WebDriver driver=new ChromeDriver();
		    
		    driver.get("https://artoftesting.com/samplesiteforselenium");
		    driver.manage().window().maximize();
		    Select sel=new Select(driver.findElement(By.id("testingDropdown")));
		    List<WebElement>elements=sel.getOptions();
		    for(Object x:elements)
		    {
		    	System.out.println(x.toString());
		    }
		    if(sel.isMultiple())
		    {
		    	System.out.println("Is multiple");
		    }
		    else
		    {
		    	System.out.println("Not multiple");
		    }
	}

}
