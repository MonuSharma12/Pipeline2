package TrialVersion.TrialVersion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTesting 
{
//	public static void main(String arg[]) throws AWTException
//	{
//		 WebDriverManager.edgedriver().setup();

	        // Initialize the EdgeDriver
//	        WebDriver driver = new EdgeDriver();
	

	@Test
		public void setup() 
		{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();

//		System.setProperty("webdriver.chrome.driver", "D:\\Shivam Download\\Eclipse Workspace\\TrialVersion\\driver\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.get("https://priority.projectalphabet.ai/");

		
		//click on login button
		driver.findElement(By.xpath("//div[text()='Google Login']")).click();
		
		//move on login page
				String origionalWindow=driver.getWindowHandle();
				Set<String> allPages=driver.getWindowHandles();
				for(String page:allPages)
				{
					driver.switchTo().window(page);
				}
				System.out.println("move to new page");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		//find login id
		driver.findElement(By.id("identifierId")).sendKeys("monu@pcplusa.com");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click on first next
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//find user password
		driver.findElement(By.name("Passwd")).sendKeys("Welcome@5151");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//find second next
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		System.out.println("Login successful...");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//move on window on dashboard
		Set<String> allWindowHandles = driver.getWindowHandles();

		// Iterate through the handles and switch to the last one
		for (String windowHandle : allWindowHandles) {
		    driver.switchTo().window(windowHandle);
		}
		System.out.println("Switched to the most recent window. Title: " + driver.getTitle());
		
		//page title verify
		String expectedTitle="M&ANAGER";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("title verify");
		}
		else
		{
			System.out.println("title not verify");
		}
		
		
		//iterate deal Name
/*		List <WebElement> dealsName=driver.findElements(By.xpath("//div[@class='folder_data MuiBox-root css-0']"));
		int ttlWebElemets=dealsName.size();
		System.out.println("Deal Elements List:"+ttlWebElemets);
		
		//find deepsearch 
//		driver.findElement(By.xpath("//div[@class='DeepSearch_toggle']")).click();
		
		//find alpha icon
		driver.findElement(By.xpath("//div[@class='folder_data MuiBox-root css-0']")).click();
		
		//click on financial
		driver.findElement(By.className("text_dropdown")).click();
		System.out.println("click on financial..");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//find upload button
		driver.findElement(By.xpath("//button[contains(@class,'left_upload_btn')]")).click();
		System.out.println("click on upload button");
		
		//file upload
		Robot rb=new Robot();
		rb.delay(2000);
		//copy file to clipboard
		StringSelection ss=new StringSelection("C:\\Users\\Mands\\Downloads\\Sample_10Page.pdf");
		
		String filePath="ss";
		
		
		//Toolkit
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//perform control+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
*/		
		//user icon
		driver.findElement(By.xpath("//div[contains(@class,'MuiAvatar-root')]")).click();
		//setup
		driver.findElement(By.xpath("//li[text()='Setup']")).click();
		//move to new Page
		Set<String> newWindowHandles = driver.getWindowHandles();

		// Iterate through the handles and switch to the last one
		for (String windowHandle1 : newWindowHandles) {
		    driver.switchTo().window(windowHandle1);
		}
		//data icon
		driver.findElement(By.xpath("//span[text()='Data']")).click();
		//add button
		driver.findElement(By.xpath("//span[text()='Add']")).click();
		
		//connection name
		driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")).sendKeys("trialAdd");
		
		//deal dropdown
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//label[@id='deal-label']
		Actions act=new Actions(driver);
		WebElement dropdown=driver.findElement(By.xpath("(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])[1]"));
//		element.click();
//		System.out.println("click on dropdown arrow");
		//ul[@id=':r14:']
		//div[contains(@class,'MuiPaper-root MuiPaper-elevation MuiPaper-rounded')]
		
	//	WebElement option=driver.findElement(By.xpath("//li[contains(@class,'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters menu_item css-1km1ehz')]"));
	//	System.out.println("select value dropdown");
//		Select dropdown=new Select(selectValue);
		
////		Actions act=new Actions(driver);
////		act.click();
//		System.out.println("inside dropdown");
	//	act.moveToElement(dropdown).click().moveToElement(option).click().build().perform();
//		dropdown.selectByVisibleText("Deal2");
//		dropdown.selectByValue("MonuDeal1");
//		dropdown.selectByIndex(1);
		
/*		List<WebElement> options=driver.findElements(By.xpath("//li[contains(@class,'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters menu_item css-1km1ehz')]"));
		
		
		 // Iterate through the options and select the desired one
		for(WebElement option:options)
		{
			System.out.println("List:"+option.getText());
			if(option.getText().equals("MonuDeal1"))
			{
//				System.out.println("List of Deals:"+option);
				option.click();
				break;
			}
		}
	*/	
		//select category
/*		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//label[@id='deal-label']
		WebElement element2=driver.findElement(By.xpath("(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'])[2]"));
		element2.click();
		Select dropdown2=new Select(element2);
//		Actions act=new Actions(driver);
//		act.click();
		System.out.println("inside dropdown 2");
//		dropdown.selectByVisibleText("MonuDeal1");
//		dropdown.selectByValue("MonuDeal1");
		dropdown2.selectByIndex(1);
		*/
		
		driver.quit();
	}

}
