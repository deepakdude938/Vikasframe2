package com.fekeyword.testcases;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import com.newkeyword.KeywordFE;
import com.utility.FileUtil;

public class Keywordtestcases {
	public static String[] parts;
	private static Logger log = Logger.getLogger(Keywordtestcases.class);

	@BeforeTest
	public void launchBrowser() {
		KeywordFE.openBrowser("Chrome");
		KeywordFE.maximizeBrowser();
		KeywordFE.openUrl("https://www.flipkart.com/");
		// log.info("Browser is open");
		parts = FileUtil.getLocator("cancel");
		KeywordFE.clickOnElement(parts[0], parts[1]);
		KeywordFE.getTitleofPage();
	}

	@Test(priority = 1, groups = "regression", enabled = true)
	public void verifyLogoVisibility() {

		// WebElement element=KeywordFE.getWebElement("CSS",Locator.getLogoImage());
		// WebElement
		// element=KeywordFE.getWebelement("CSS",FileUtil.getProperty("logoimage1"));
		// System.out.println(element);
		// Assert.assertTrue(element.isDisplayed(),"logo is displayed");
		parts = FileUtil.getLocator("imglogo");

		WebElement webelement = KeywordFE.isLogoVisible(parts[0], parts[1]);
		if (webelement.isDisplayed()) {
			log.info("Brand logo is visible");
		} else {
			log.info("Brand logo is not visible");
		}
		KeywordFE.testCaseSnapShot("verifyLogoVisibility");
		Assert.assertTrue(webelement.isDisplayed(), "Brand logo is visible");

	}

	@Test(priority = 2, groups = "smoke")
	public void verifyLogin() {
		parts = FileUtil.getLocator("login");
		KeywordFE.clickOnElement(parts[0], parts[1]);
		parts = FileUtil.getLocator("entermobno");
		KeywordFE.enterText(parts[0], parts[1], "9921194982");
		parts = FileUtil.getLocator("pwd");
		KeywordFE.enterText(parts[0], parts[1], "Vikas@1216");
		parts = FileUtil.getLocator("clickonlogin");
		KeywordFE.clickOnElement(parts[0], parts[1]);
		parts = FileUtil.getLocator("verifynm");
		Constant.webeletxt = KeywordFE.waitForElementTovisible(parts[0], parts[1]);
		Assert.assertEquals(Constant.webeletxt, "Vikas");
	}

	/* @Test(priority = 3, groups = "regression")
	public static void verifyPlaceholder() {
		parts = FileUtil.getLocator("placeholder");
		KeywordFE.enterText(parts[0], parts[1], "T-shirts");
		parts = FileUtil.getLocator("clickonmagnifier");
		KeywordFE.clickOnElement(parts[0], parts[1]);
		parts = FileUtil.getLocator("tshirtsresult");
		Constant.webeletxt = KeywordFE.waitForElementTovisible(parts[0], parts[1]);
		Assert.assertEquals(Constant.webeletxt, "Showing 1 – 40 of 28,87,503 results for \"");

	}

	@Test(priority = 4, groups = "regression")
	public static void verifyElectroniclink() {
		parts = FileUtil.getLocator("electronic");
		Constant.element = KeywordFE.mouseHover(parts[0], parts[1]);
		KeywordFE.navigateBack();
		Assert.assertTrue(Constant.element.isDisplayed(), "Electronics Link is Visible and clickable");

	}

	@Test(priority = 5, groups = "regression")
	public static void verifyTVsLink() {
		parts = FileUtil.getLocator("tvs&app");
		Constant.element = KeywordFE.mouseHover(parts[0], parts[1]);
		Assert.assertTrue(Constant.element.isDisplayed(), "TVs and Appliances Link is Visible and clickable");

	}

	@Test(priority = 6, groups = "regression")
	public static void verifyMenLink() {
		parts = FileUtil.getLocator("men");
		Constant.element = KeywordFE.mouseHover(parts[0], parts[1]);
		Assert.assertTrue(Constant.element.isDisplayed(), "Men Link is Visible and clickable");

	}

	@Test(priority = 7, groups = "regression")
	public static void verifyWomenLink() {
		parts = FileUtil.getLocator("women");
		Constant.element = KeywordFE.mouseHover(parts[0], parts[1]);
		Assert.assertTrue(Constant.element.isDisplayed(), "Women Link is Visible and clickable");

	}

	@Test(priority = 8, groups = "regression")
	public static void verifyBabyandKidLink() {
		parts = FileUtil.getLocator("babykid");
		Constant.element = KeywordFE.mouseHover(parts[0], parts[1]);
		Assert.assertTrue(Constant.element.isDisplayed(), "Baby and Kids Link is Visible and clickable");

	}

	@Test(priority = 9, groups = "regression")
	public static void verifyHomeandFurnitureLink() {
		parts = FileUtil.getLocator("homeandfurniture");
		Constant.element = KeywordFE.mouseHover(parts[0], parts[1]);
		Assert.assertTrue(Constant.element.isDisplayed(), "Home and Furniture Link is Visible and clickable");

	}

	@Test(priority = 10, groups = "regression")
	public static void verifySportsLink() {
		parts = FileUtil.getLocator("sports");
		Constant.element = KeywordFE.mouseHover(parts[0], parts[1]);
		Assert.assertTrue(Constant.element.isDisplayed(), "Sports Link is Visible and clickable");

	}

	@Test(priority = 11, groups = "regression")
	public static void verifyFlightLink() {
		parts = FileUtil.getLocator("flights");
		KeywordFE.clickOnElement(parts[0], parts[1]);
		WaitFor.minTime();
		KeywordFE.navigateBack();
		Constant.text = KeywordFE.getCurrentUrlOfPage();
		Assert.assertEquals(Constant.text, "https://www.flipkart.com/", "Sucessfully redirected to HomePage");

	}

	@Test(priority = 12, groups = "regression")
	public static void verifyOfferLink() {
		parts = FileUtil.getLocator("offer");
		Constant.element = KeywordFE.mouseHover(parts[0], parts[1]);
		Assert.assertTrue(Constant.element.isDisplayed(), "Offer Link is Visible and clickable");
	}

	@Test(priority = 13, groups = "regeression")
	public static void verifySortByPopularity() {
		parts = FileUtil.getLocator("placeholder");
		KeywordFE.enterText(parts[0], parts[1], "T-shirts");
		parts = FileUtil.getLocator("clickonmagnifier");
		KeywordFE.clickOnElement(parts[0], parts[1]);
		parts = FileUtil.getLocator("sortbypopularity");
		List<WebElement> ele = SortBy.popularity(parts[0], parts[1]);

		for (WebElement elements : ele) {
			System.out.println(elements.getText());
		}
		Assert.assertEquals(ele, ele);

	}
      */
	@Test(groups = { "sanity" })
	public static void verifySuccessfullyLogOut() {
	  //KeywordFE.testCaseSnapShot("verifySuccessfullyLogOut");
		parts=FileUtil.getLocator("mousehoveronname");
		KeywordFE.mouseHover(parts[0], parts[1]);
		parts=FileUtil.getLocator("clickonmyprofile");
		KeywordFE.clickOnElement(parts[0], parts[1]);
		KeywordFE.pageScrollDown();
		

	}

}
