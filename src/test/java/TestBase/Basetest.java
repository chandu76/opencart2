package TestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Basetest {


	public static WebDriver driver;
	public Logger logger;
	public Properties p;

	@BeforeClass(groups={"smoke","sanity","retest","regression","DataDriven"})
	@Parameters({ "browser","os"})    // from now im going to remove os pert in the parameter
	public void setup (String br, String os) throws IOException
	{
		FileReader file =new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);

		logger=LogManager.getLogger(this.getClass());


		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities dc=new DesiredCapabilities();

			//os

			if(os.equalsIgnoreCase("windows"))
			{
				dc.setPlatform(Platform.WIN11);

			}
			else if(os.equalsIgnoreCase("mac"))
			{
				dc.setPlatform(Platform.MAC);
			}
			else 
			{
				System.out.println("os not maching");
				return;
			}

			//browser

			switch(br.toLowerCase())
			{
			case "chrome": dc.setBrowserName("chrome"); break;
			case "edge":dc.setBrowserName("MicrosoftEdge"); break;
			default: System.out.println("os is not maching");
			return;
			}
			driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		}
		else if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{


		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default :System.out.println("non of the browsers");return;
		}
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(p.getProperty("application_url"));
		driver.manage().window().maximize();
	}
	@AfterClass(groups={"smoke","sanity","retest","regression","DataDriven"})
	public void teardown()
	{
		driver.quit();
	}
	public String randomsting()
	{
		String genaratednewstring=RandomStringUtils.randomAlphabetic(5);
		return genaratednewstring;
	}
	public String capturescreen(String tname) throws IOException 
	{
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File sourcefile = takescreenshot.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(".\\screenshots\\" + tname + "_" + timestamp + ".png");
		sourcefile.renameTo(targetFile);
		return targetFile.getAbsolutePath();
	}

}
