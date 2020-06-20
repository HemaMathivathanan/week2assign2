package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		    driver.get("http://leafground.com/pages/radio.html");

		    //Are you enjoying the classes?
			driver.findElementById("yes").click();
			
			//Find default selected radio button
			String dd = driver.findElementByXPath("//label[@for='Checked']").getText();
			System.out.println("the default selection is:" +dd);
			
			//Select your age group (Only if choice wasn't selected)
			if(driver.findElementByXPath("(//input[@name='age'])[2]").isSelected () )
					{
				System.out.println("age is selected ");
			}
			else {
				driver.findElementByXPath("(//input[@name='age'])[2]").click();
				
				
				
			}
			
			
}

}