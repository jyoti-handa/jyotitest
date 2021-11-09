package seleniumautomation;


public class print {

	public static void main(String[] args) {
		launcher();
	}
	public static void launcher()
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit\\Desktop\\jyoti_training\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/text-box");
			WebElement fullName=driver.findElement(By.id("userName"));
			fullName.sendKeys("Jyoti");
			WebElement sb=driver.findElement(By.xpath("//button[@id='submit']"));
			sb.click();
			
			
			

	}

}
