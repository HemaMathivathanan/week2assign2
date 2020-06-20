package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		//Select the languages that you know
		driver.findElementByXPath("(//input[@type=\"checkbox\"])[1]").click();
		driver.findElementByXPath("(//input[@type=\"checkbox\"])[3]").click();
		
		//Confirm Selenium is checked

		boolean b = driver.findElementByXPath("(//input[@type=\"checkbox\"])[6]").isSelected();
		if ( b == true ) {
		System.out.println("Selenium is checked");
		}
		else
		{
			System.out.println("Se is not checked");
		}
		
		//DeSelect only checked

		driver.findElementByXPath("(//input[@type=\"checkbox\"])[8]").click();
		
		//Select all below checkboxes
		
		driver.findElementByXPath("(//input[@type=\"checkbox\"])[9]").click();
		driver.findElementByXPath("(//input[@type=\"checkbox\"])[10]").click();
		driver.findElementByXPath("(//input[@type=\"checkbox\"])[11]").click();
		driver.findElementByXPath("(//input[@type=\"checkbox\"])[12]").click();
		driver.findElementByXPath("(//input[@type=\"checkbox\"])[13]").click();
		
		System.out.println("all the options are selected");
		
		
		
		
}
}