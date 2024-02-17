package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.Hooks;

public class ExerciseLocators extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(1000);
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("ntk-admin");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		Thread.sleep(1000);
		
		WebElement headerText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		
		String header = headerText.getText();
		
		if(header.contains("Dashboard")) {
			System.out.println("Verifying the Header : Dashboard");
			
		}else {
			System.out.println("Dashboard isn't the header");
			
		}
		
		
		driver.close();
		
		
		tearDown();
	}

}
