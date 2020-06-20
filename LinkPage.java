package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		//Find where am supposed to go without clicking me?
		
        System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
        
        //Verify am I broken? 
        
        String attribute = driver.findElementByLinkText("Verify am I broken?").getAttribute("href");
        if(attribute.contains("error")) {
        	System.out.println("Its broken");
        }
        else {
        	System.out.println("not broken");
        }
        
        //Go to Home Page
        
        driver.findElementByLinkText("Go to Home Page").click();
	  	
		
		
		
		
	}
}
