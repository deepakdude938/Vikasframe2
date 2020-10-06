package com.newkeyword;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fekeyword.testcases.Constant;
import com.sun.jna.platform.unix.X11.Window;

import bsh.org.objectweb.asm.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;

public class KeywordFE {
	public static WebDriver driver;
	private static Logger log = Logger.getLogger(KeywordFE.class);

	public static void openBrowser(String browsername) {
		switch (browsername) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.info("Opening" + browsername + "browser");
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
			log.info("Opening" + browsername + "browser");
			break;
		case "InternetExplorer":
			WebDriverManager.iedriver().setup();
			driver = new ChromeDriver();
			log.info("Opening" + browsername + "browser");
			break;

		case "Headless":
			// HtmlUnitDriver driver=new HtmlUnitDriver();
			// driver = new HtmlUnitDriver();
			log.info("Opening" + browsername + "browser");
			break;

		default:
			log.error("Invalid browser name");
			break;
		}

	}

	public static WebElement getWebelement(String locatorType, String locatorValue) {
		WebElement element = null;
		switch (locatorType) {
		case "XPATH":
			element = driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			element = driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":
			element = driver.findElement(By.id(locatorValue));
			break;
		case "LINK_TEXT":
			element = driver.findElement(By.linkText(locatorValue));
			break;
		case "PARTIAL_LINK_TEXT":
			element = driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "CLASS":
			element = driver.findElement(By.className(locatorValue));
			break;
		default:
			break;
		}
		return element;

	}

	public static List<WebElement> getWebelements(String locatorType, String locatorValue) {
		List<WebElement> element = null;
		switch (locatorType) {
		case "XPATH":
			driver.findElements(By.xpath(locatorValue));
			break;

		case "CSS":
			driver.findElements(By.xpath(locatorValue));
			break;

		case "ID":
			driver.findElements(By.xpath(locatorValue));
			break;

		case "LINKTEXT":
			driver.findElements(By.xpath(locatorValue));
			break;

		case "PARTIALLINKTEXT":
			driver.findElements(By.xpath(locatorValue));
			break;

		case "CLASS":
			driver.findElements(By.xpath(locatorValue));
			break;

		case "NAME":
			driver.findElements(By.xpath(locatorValue));
			break;

		case "TAGNAME":
			driver.findElements(By.xpath(locatorValue));
			break;

		default:
			log.error("Invalid Locator Type");
			break;
		}

		return element;

	}

	public static void openUrl(String url) {
		driver.get(url);
	}

	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public static WebElement isLogoVisible(String locatorType, String locatorValue) {
		WebElement element = getWebelement(locatorType, locatorValue);
		return element;

	}

	public static void clickOnElement(String locatorType, String locatorValue) {
		getWebelement(locatorType, locatorValue).click();

	}

	public static void enterText(String locatorType, String locatorValue, String text) {
		getWebelement(locatorType, locatorValue).sendKeys(text);

	}

	public static WebElement mouseHover(String locatorType, String locatorValue) {
		WebElement element = getWebelement(locatorType, locatorValue);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		return element;

	}

	public static String getText(String locatorType, String locatorValue) {
		WebElement element = getWebelement(locatorType, locatorValue);
		return element.getText();

	}

	public static String waitForElementTovisible(String locatorType, String locatorValue) {
		WebElement element = getWebelement(locatorType, locatorValue);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Constant.text = wait.until(ExpectedConditions.visibilityOf(element)).getText();
		return Constant.text;

	}

	public static int displayListOfElement(String locatorType, String locatorValue) {
		List<WebElement> elements = getWebelements(locatorType, locatorValue);
		for (WebElement ele : elements) {
			ele.getSize();
			Constant.count++;

		}
		return Constant.count;
	}

	public static String getWindowHandleOfPage() {
		Constant.text = driver.getWindowHandle();
		return Constant.text;

	}

	public static String getTitleofPage() {
		Constant.text = driver.getTitle();
		return Constant.text;

	}

	public static void switchToMainWindow() {
		driver.switchTo().window(Constant.text);

	}

	public static void navigateBack() {
		driver.navigate().back();

	}

	public static void navigateForword() {
		driver.navigate().forward();

	}

	public static String getCurrentUrlOfPage() {
		Constant.text = driver.getCurrentUrl();
		return Constant.text;

	}

	public static void pageScrollDown() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeAsyncScript("Window.scrollBy(0,25000)");

	}

	public static void pageScrollUp() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeAsyncScript("Window.scrollBy(25000,0)");

	}

	public static void closeBrowser() {
		driver.close();

	}

	public static void testCaseSnapShot(String testcasename) {
		AShot ashot=new AShot();

		try {
			Robot robo = new Robot();
			Rectangle rect = new Rectangle();
			rect.setRect(0, 0, 1500, 100);
			BufferedImage img = robo.createScreenCapture(rect);
			ImageIO.write(img, "PNG", new File("D:\\TestingShastra\\Framework\\src\\test\\resources\\Reports/"+testcasename+"_"+System.currentTimeMillis()+".PNG"));

		} catch (FileNotFoundException f) {
			System.out.println(f);

		} catch (IOException e) {

			e.printStackTrace();
		} catch (AWTException e) {

			e.printStackTrace();
		}

	}

}
