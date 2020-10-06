package com.fekeyword.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.newkeyword.KeywordFE;

public class SortBy {

	public static void revelance(String locatorType, String locatorValue) {

	}

	public static List<WebElement> popularity(String locatorType, String locatorValue) {
		KeywordFE.getWebelement(locatorType, locatorValue).click();
		List<WebElement> elements = KeywordFE.getWebelements(locatorType, locatorValue);
		for (WebElement ele : elements) {
			ele.getText();
			Constant.count++;

		}
		return elements;

	}

	public static void priceLowToHigh(String locatorType, String locatorValue) {

	}

	public static void priceHighToLow(String locatorType, String locatorValue) {

	}

	public static void newestFirst() {

	}

}
