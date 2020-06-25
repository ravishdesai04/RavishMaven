import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System. setProperty("webdriver.chrome.driver", "src\\resource\\chromedriver.exe");
			// Initialize browser.
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.testandquiz.com/selenium/testing.html");
			
			WebElement Female = driver.findElement(By.id("female"));
			System.out.println(Female.isSelected());
			WebElement Male = driver.findElement(By.id("male"));
			System.out.println(Male.isSelected());
			Female.click();
			System.out.println(Female.isSelected());
			System.out.println(Male.isSelected());
			Male.click();
			System.out.println(Female.isSelected());
			System.out.println(Male.isSelected());
			List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
			for(WebElement checkbox:checkboxes) {
				if(!checkbox.isSelected()) {
				checkbox.click();
				}
				}
			for(WebElement checkbox:checkboxes) {
				if(checkbox.getAttribute("value").equals("Automation")) {
						checkbox.click();
				}
			}
		
			Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
			dropdown.selectByValue("Performance");
			List<WebElement> dropdowns = dropdown.getOptions();
			for(WebElement e:dropdowns) {
				System.out.println(e.getText());
			}
			
			//driver.findElement(By.xpath("//button[text() = 'Generate Alert Box']")).click();
			//driver.switchTo().alert().accept();
			
			}

		}

