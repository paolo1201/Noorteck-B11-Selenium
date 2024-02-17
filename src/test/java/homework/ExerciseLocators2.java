package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.Hooks;

public class ExerciseLocators2 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		WebElement registerLink = driver.findElement(By.partialLinkText("here"));
		registerLink.click();
		Thread.sleep(1000);
		
		if(driver.getTitle().contains("Mercury Tours"))
			System.out.println("Page Title :" + driver.getTitle());
		else
			System.out.println("Page Title isnt :" + driver.getTitle());
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Paolo");
		Thread.sleep(1000);
			
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Verastegui");
		Thread.sleep(1000);
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("5711234567");
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("hola123@gmail.com");
		Thread.sleep(1000);
		
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("123 pixie way");
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("woodbridge");
		Thread.sleep(1000);
		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("VA");
		Thread.sleep(1000);
		
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("22192");
		Thread.sleep(1000);
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("hola123@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456789");
		Thread.sleep(1000);
		
		WebElement conPassword = driver.findElement(By.name("confirmPassword"));
		conPassword.sendKeys("123456789");
		Thread.sleep(1000);
		
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		Thread.sleep(1000);
		
		WebElement confirmText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
		
		String text = confirmText.getText();
		
		if(text.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		}else {
			System.out.println("TESTCASE FAILED");
		}
		
		driver.close();
		
		tearDown();
	}
	
	

}
