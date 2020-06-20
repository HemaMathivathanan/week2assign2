package week2.day1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPage {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Find position of button (x,y)

		driver.get("http://leafground.com/pages/Button.html");
		Point location = driver.findElementById("position").getLocation();
		System.out.println("The Location is : " +location);
		
		//Find button color

		System.out.println(" The color is : " +driver.findElementById("color").getCssValue("background-color"));

		//Find the height and width

		System.out.println(" The size of the button is " +driver.findElementByXPath("//button[text()='What is my size?']").getSize());
		
		//Click button to travel home page
		
		driver.findElementById("home").click();
		System.out.println(driver.getCurrentUrl());		
		if(driver.getCurrentUrl().contains("home")) {
			System.out.println("Link is correct");
			
		}
		else {
			System.out.println("link is incorect");
		}
		
		
	}
}
