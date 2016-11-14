import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\yerras\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");

		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://payr.win-group.co.uk/");
		
		driver.manage().window().maximize();
		
		// User selects new account page sign up
		
		driver.findElement(By.xpath(".//*[@id='notice-cookie-block']/div/div/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/header/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='terms']")).click();		
	    driver.findElement(By.xpath(".//*[@id='create']")).click();
	    
	    
		//Creation Page - User enters details in your details section
	    
	    driver.findElement(By.xpath(".//*[@id='firstname']")).sendKeys("chakra");
	    driver.findElement(By.xpath(".//*[@id='lastname']")).sendKeys("thota");
	    driver.findElement(By.xpath(".//*[@id='street_1']")).sendKeys("StreetName");
	    driver.findElement(By.xpath(".//*[@id='city']")).sendKeys("Cambridge");
	    driver.findElement(By.xpath(".//*[@id='region']")).sendKeys("Country Name");
	    driver.findElement(By.xpath(".//*[@id='zip']")).sendKeys("cb4 1rx");
	    driver.findElement(By.xpath(".//*[@id='country']")).sendKeys("United Kingdom");
	    
	    driver.findElement(By.xpath(".//*[@id='telephone']")).sendKeys("7872971204");
	    
	    driver.findElement(By.xpath(".//*[@id='fax']")).sendKeys("7872971204");
	    
	    
	    driver.findElement(By.xpath(".//*[@id='day']")).sendKeys("17");
	    driver.findElement(By.xpath(".//*[@id='month']")).sendKeys("06");
	    driver.findElement(By.xpath(".//*[@id='year']")).sendKeys("1980");
	    
	    driver.findElement(By.xpath(".//*[@id='payr_address']")).sendKeys("Over 3 Years");
	    
	    //  User enter details in  Account details section 
	    
	    driver.findElement(By.xpath(".//*[@id='email_address']")).sendKeys("thota.c@gmail.com");
	    driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("cambridge1234");
	    driver.findElement(By.xpath(".//*[@id='confirmation']")).sendKeys("cambridge1234");
	    driver.findElement(By.xpath(".//*[@id='account_memorableword']")).sendKeys("London");
	    driver.findElement(By.xpath(".//*[@id='is_subscribed']")).click();
	    
	    
	    // Photo ID Information. User selects photo id's from local drive
	    
		WebElement Photoid_Front = driver.findElement(By.xpath(".//*[@id='kyc_photoid']"));
		Photoid_Front.sendKeys("C:\\Photos\\front.jpg");
		
		
		WebElement Photoid_Back = driver.findElement(By.xpath(".//*[@id='kyc_photoidback']"));
		Photoid_Back.sendKeys("C:\\Photos\\back.jpg");
		
		
		WebElement Utility_Bill = driver.findElement(By.xpath(".//*[@id='kyc_utility']"));
		Utility_Bill.sendKeys("C:\\Photos\\u.jpg");
	
		// User selects create button after entering all details.
		
		driver.findElement(By.xpath(".//*[@id='submit']")).click();

	     driver.close();
		
	     driver.quit();
	     
		
	}

}
