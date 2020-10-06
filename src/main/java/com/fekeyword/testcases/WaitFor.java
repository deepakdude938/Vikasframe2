package com.fekeyword.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.newkeyword.KeywordFE;

public class WaitFor {
/**
 * Minimum wait is 5 seconds
 */
	public static void minTime() {
		FluentWait wait = new FluentWait(KeywordFE.driver);
		wait.withTimeout(5, TimeUnit.SECONDS);
		wait.pollingEvery(3000, TimeUnit.MILLISECONDS);

	}
	/**
	 * Moderate time  is 10 seconds
	 */
	public static void moderateTime() {
		FluentWait wait = new FluentWait(KeywordFE.driver);
		wait.withTimeout(10, TimeUnit.SECONDS);
		wait.pollingEvery(3000, TimeUnit.MILLISECONDS);

	}
	/**
	 * Maximum wait is 20 seconds
	 */
	public static void maxTime() {
		FluentWait wait = new FluentWait(KeywordFE.driver);
		wait.withTimeout(20, TimeUnit.SECONDS);
		wait.pollingEvery(3000, TimeUnit.MILLISECONDS);

	}
	/**
	 * Element Visible  wait is 10 seconds
	 */
	public static void elementToVisible(WebElement element) {
		FluentWait wait = new FluentWait(KeywordFE.driver);
		wait.withTimeout(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(element));
		Constant.wait.pollingEvery(3000, TimeUnit.MILLISECONDS);

	}

}
