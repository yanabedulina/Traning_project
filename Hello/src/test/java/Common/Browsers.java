package Common;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Browsers {
	
	public static WebDriver driver;
  
  @BeforeClass
  @Parameters({"url","browser"})
  public void beforeClass(String website, String br)  {
	  
      if(br.equalsIgnoreCase("Chrome")) {
    	  System.setProperty("webdriver.chrome.driver", "/Users/yanabedulina/Desktop/chromedriver");
		  driver = new ChromeDriver();
		  driver.navigate().to(website);
      }else if(br.equalsIgnoreCase("Firefox")) {
    	  System.setProperty("webdriver.gecko.driver", "/Users/yanabedulina/Desktop/geckodriver");
          driver = new FirefoxDriver();
          driver.navigate().to(website);
      }else{
    	  System.out.println("Check name");
      }
      
      }


  @AfterClass
  public void afterClass() {
  }
  public void screenshots() throws IOException {
		 
	  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(shots,new File("/Users/yanabedulina/Desktop/PeopleInTech/"+timestamp()+"screen.png"));
  
  }
  public String timestamp() {
	  return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
  }
}
