package homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.Hooks;

public class ExerciseAlert extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		if(driver.getTitle().contains("Alerts")) {
			System.out.println("Page title:" + driver.getTitle());
		}else {
			System.out.println("Page title is not : " + driver.getTitle() );
		}
		Thread.sleep(1000);
		
		WebElement alertTextbox = driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li:nth-child(3) > a"));
		alertTextbox.click();
		Thread.sleep(1000);
		
		WebElement buttonClick = driver.findElement(By.cssSelector("#Textbox > button"));
		buttonClick.click();
		Thread.sleep(1000);
		
		Alert alertObj = driver.switchTo().alert();
		
		String text = alertObj.getText();
		
		System.out.println(text);
		
		alertObj.sendKeys("Paolo");
		Thread.sleep(1000);
		
		alertObj.accept();
		Thread.sleep(1000);
		
		WebElement verifyingText = driver.findElement(By.id("demo1"));
		
		String veryfying = verifyingText.getText();
		
		if(veryfying.contains("How are you today")) {
			System.out.println(veryfying);
			
		}else {
			System.out.println("text message doesn't cointains : " + veryfying);
		}
		Thread.sleep(1000);
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		WebElement okCancel = driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li:nth-child(2) > a"));
		okCancel.click();
		Thread.sleep(1000);
		
		WebElement buttonClick1 = driver.findElement(By.cssSelector("#CancelTab > button"));
		buttonClick1.click();
		Thread.sleep(1000);
		
		Alert alertObj1 = driver.switchTo().alert();
		String text1 = alertObj1.getText();
		System.out.println(text1);
		//THERE'S NO ALERT TEXT FIELD TO ENTER MY NAME.
		//alertObj1.sendKeys("Paolo");
		//Thread.sleep(1000);
		
		if(text1.contains("Press a button!")) {
			alertObj.dismiss();
		}else {
			//alertObj.accept();
		}
		
		WebElement messageDisp = driver.findElement(By.id("demo"));
		String messageObj = messageDisp.getText();
		
		if(messageObj.contains("You Pressed")) {
			System.out.println("Message contains : \" + messageDisp.getText()");
		}else {
			System.out.println("Message dosesn't contain You Press");
		}
		
		
		
		Thread.sleep(1000);
		
		
		
		
		
		driver.close();
		
		
		tearDown();
	}
	
	

}
