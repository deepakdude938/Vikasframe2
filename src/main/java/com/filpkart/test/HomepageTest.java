package com.filpkart.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fekeyword.testcases.Constant;
import com.flipkart.pages.Homepage;
import com.newkeyword.KeywordFE;
import com.utility.FileUtil;

public class HomepageTest extends KeywordFE {
	public static String[] parts;
	Homepage hp = PageFactory.initElements(driver, Homepage.class);

	@BeforeTest
	public void launchBrowser() {
		KeywordFE.openBrowser("Chrome");
		KeywordFE.maximizeBrowser();
		KeywordFE.openUrl("https://www.flipkart.com/");
		parts = FileUtil.getLocator("cancel");
		KeywordFE.clickOnElement(parts[0], parts[1]);
	}

	@Test(priority = 1)
	public void verifyLogo() {

		if (hp.isLogoVisible()) {
			System.out.println("Brand logo is visible");
		} else {
			System.err.println("Brand logo is not  visible");
		}
		Assert.assertTrue(hp.isLogoVisible(), "logo is not visible");

	}

	@Test(priority = 2,groups="smoke")
	public void verifySuccessfullLogin() {
		hp.clickOnLogin();
		hp.enterMobNo();
		hp.enterPwd();
		hp.clickOnLoginBtn();
		Constant.text=hp.verifyLoginName();
		Assert.assertEquals(Constant.text, "Vikas");
		

	}

}
