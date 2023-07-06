package com.DemoSite;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver;

	static Actions a;

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
//		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
//		File dest = new File(
//	             "C:\\Users\\vinoth\\eclipse-workspace\\NykaaProject\\target\\Screen Shot" + filename +""+timestamp+".png");
		File dest = new File(
				"C:\\Users\\vinoth\\eclipse-workspace-cucum\\Testng_pro\\target\\ScreenShot" + filename + ".png");
		FileHandler.copy(src, dest);
	}

// DROP DOWN IN SELECT CLASS
	public static void dropDownKey(WebElement element, String option, String value) {
		Select s = new Select(element);

		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}

	}

// SWITCH TO FRAME METHOD
	public static void switchToByInput(String value, String option) {

		if (option.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			driver.switchTo().frame(index);
		} else if (option.equalsIgnoreCase("id or name")) {
			driver.switchTo().frame(value);
		}
	}

	public static void switchToByElement(WebElement element) {
		driver.switchTo().frame(element);
	}

// CONTEXT CLICK USING ACTION CLASS
	public static void rightClick(WebElement element) {
		a = new Actions(driver);

		a.contextClick(element).build().perform();
	}

	public static void moveTo(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public static void dragDrop(WebElement src, WebElement dest) {
		a = new Actions(driver);
		a.dragAndDrop(src, dest).build().perform();
	}

// IMPLICIT WAIT METHOD

	public static void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}

// EXPLICIT WAIT

	public static void explicitWait(int sec, String condition, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, sec);

		if (condition.equalsIgnoreCase("visibility")) {

			wait.until(ExpectedConditions.visibilityOf(element));
		} else if (condition.equalsIgnoreCase("clickable")) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}

	}

// SENDKEYS METHOD
	public static void inputValues(WebElement element, String text)  {
		element.sendKeys(text);
	}
	
	
	
	public static void valueInputs( String element,String input,String value) {
		if (input.equalsIgnoreCase("id")) {
			driver.findElement(By.id(element)).sendKeys(value);
		} else if (input.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(element)).sendKeys(value);
		} else if (input.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(element)).sendKeys(value);
		} else if (input.equalsIgnoreCase("cssselector")) {
			driver.findElement(By.cssSelector(element)).sendKeys(value);
		}
	}

// ALERT METHOD

	public static void alertCase(String value) {

		if (value.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (value.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		} else if (value.equalsIgnoreCase("value")) {
			driver.switchTo().alert().sendKeys(value);
		} else if (value.equalsIgnoreCase("getText")) {
			System.out.println("alertText: " + driver.switchTo().alert().getText());
		}

	}
// JAVA SCRIPT EXECUTOR

	public static void clickByScript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("element.click()");

	}

	public static void scrollByScript() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

	}

// WINDOW HANDLE

	public static void switchWindow(int index) {
		Set<String> tab = driver.getWindowHandles();
		List<String> listTab = new ArrayList<>(tab);

		driver.switchTo().window(listTab.get(index));

	}

	public static void switchToWindow(String tab_id) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			;
		String id = it.next();
		if (id == tab_id) {
			driver.switchTo().window(id);

		}

	}
	// GET TITLE METHOD	
		public static void getTitle(WebElement element) {
			System.out.println("Title: " + driver.getTitle());

		}
		protected static String gettext(WebElement msgtext) {
			// TODO Auto-generated method stub
			return null;
		}


	// CURRENT URL METHOD	
		public static void getCurrentUrl() {
			System.out.println("CurrentUrl: " + driver.getCurrentUrl());

		}

	// GET TEXT METHOD	
		public static void getText(String input, String WebElement) {
			if (input.equalsIgnoreCase("id")) {
				System.out.println("Text: " + driver.findElement(By.id(WebElement)).getText());
			} else if (input.equalsIgnoreCase("classname")) {
				System.out.println("Text: " + driver.findElement(By.className(WebElement)).getText());
			} else if (input.equalsIgnoreCase("xpath")) {
				System.out.println("Text: " + driver.findElement(By.xpath(WebElement)).getText());
			}

		}

	// WAIT METHODS	
		public static void implicitWait(long time) {

			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

		}

		public static void explicitWait(long time, WebElement element) {

			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOf(element)).click();

		}

	
	protected String getCurrentTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void exit()  {
		driver.close();
		
	}
	// ACTION CLASS METHODS		
		public static void actions(WebElement element, String input) {

			Actions act = new Actions(driver);

			if (input.equalsIgnoreCase("click WebElement")) {
				act.click(element).build().perform();

			} else if (input.equalsIgnoreCase("doubleclick WebElement")) {
				act.doubleClick(element).build().perform();

			} else if (input.equalsIgnoreCase("c&h WebElement")) {
				act.clickAndHold(element).build().perform();

			} else if (input.equalsIgnoreCase("move to WebElement ")) {
				act.moveToElement(element).build().perform();

			}else if (input.equalsIgnoreCase("right Click"))   {
				act.contextClick(element).build().perform();
			}
		}

		public static void action(String input) {

			Actions ac = new Actions(driver);

			if (input.equalsIgnoreCase("click")) {
				ac.click().build().perform();

			} else if (input.equalsIgnoreCase("doubleclick")) {
				ac.doubleClick().build().perform();

			} else if (input.equalsIgnoreCase("click and hold")) {
				ac.clickAndHold().build().perform();

			}
		}

		public static void actionDragAndDrop(WebElement source, WebElement target) {
			Actions a = new Actions(driver);

			a.dragAndDrop(source, target);

		}
	

}

