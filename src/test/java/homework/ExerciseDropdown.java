package homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.Hooks;

public class ExerciseDropdown extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement registerLink = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(1) > a"));
		registerLink.click();
		Thread.sleep(1000);
		
		if(driver.getTitle().contains("nopCommerce demo store. Register")) {
			System.out.println("Page Title is : " + driver.getTitle());
		}else {
			System.out.println("Page  Title isn't : " + driver.getTitle());
		}
			
		WebElement gender = driver.findElement(By.id("gender-male"));
		gender.click();
		Thread.sleep(1000);
		
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Paolo");
		Thread.sleep(1000);
		
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Verastegui");
		Thread.sleep(1000);
		
		WebElement dayDropdown = driver.findElement(By.name("DateOfBirthDay"));
		
		Select selectObj = new Select(dayDropdown);
		
		List<WebElement> dayList = selectObj.getOptions();
		
		for(WebElement day : dayList) {
			
			String dayStr = day.getText();
			
			if(dayStr.equals("12")) { 
				day.click();
				break;
				
			}
			
		}
		
	
		Thread.sleep(1000);
		
		WebElement monthDropwdown = driver.findElement(By.name("DateOfBirthMonth"));
		
		Select selectObj1 = new Select(monthDropwdown);
		
		List<WebElement> monthName = selectObj1.getOptions();
		
		for(WebElement month : monthName) {
			
			String monthStr = month.getText();
			
			if(monthStr.equals("January")) {
				month.click();
				break;
			}
		}
		Thread.sleep(1000);
		
		WebElement yearDropdown = driver.findElement(By.name("DateOfBirthYear"));
		
		Select selectObj2 = new Select(yearDropdown);
		
		List<WebElement> yearName = selectObj2.getOptions();
		
		for(WebElement year : yearName) {
			
		String yearStr = year.getText();
		if(yearStr.equals("1998")) {
			year.click();
			break;
		  }
		}
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("ciao123@gmail.com");
		Thread.sleep(1000);
		
		WebElement companyName = driver.findElement(By.id("Company"));
		companyName.sendKeys("VerasteguiFlorenttini.Inc");
		Thread.sleep(1000);
		
		WebElement boxCheck = driver.findElement(By.id("Newsletter"));
		boxCheck.click();
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("12345678");
		Thread.sleep(1000);
		
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("12345678");
		Thread.sleep(1000);
		
		WebElement register = driver.findElement(By.id("register-button"));
		register.click();
		Thread.sleep(1000);
		
		WebElement confirmText = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
		
		String text = confirmText.getText();
		
		if(text.equals("Your registration completed!!!")) {
			System.out.println("TESTCASE PASSED");
			
		}else {
			System.out.println("TESTCASE FAILED");
		}
		
		
		driver.close();
		
		tearDown();
		
	}

}
