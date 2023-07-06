package com.Testng_pro;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoIbibo_BaseClass {

	public static WebDriver driver;
	JavascriptExecutor js;

// BROWSER LAUNCH METHOD
	public static void browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

	}

// LAUNCH URL METHOD
	public static void getUrl(String url) {
		driver.manage().window().maximize();
		driver.get(url);

	}

// CLICK METHOD
	public static void clickElement(WebElement element) {
		element.click();
	}

// SENDKEYS METHOD
	public static void inputValue(WebElement element, String value) {
		element.sendKeys(value);
	}

// TAKES SCREENSHOT METHOD
	public static void screenShot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
//			String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
//			File dest = new File(
//		             "C:\\Users\\vinoth\\eclipse-workspace\\NykaaProject\\target\\Screen Shot" + filename +""+timestamp+".png");
		File dest = new File(
				"C:\\Users\\vinoth\\eclipse-workspace-cucum\\Testng_pro\\target\\ScreenShot" + filename + ".png");
		FileHandler.copy(src, dest);
	}
	
	public void scrollByValue(int x, int y) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	

	
	protected String getCurrentTitle() {
		// TODO Auto-generated method stub
		return null;
	}
}
