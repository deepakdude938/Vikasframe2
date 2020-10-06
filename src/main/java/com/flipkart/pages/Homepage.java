package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
	@FindBy(css = "[class=\"_2AkmmA _29YdH8\"]")
	private WebElement logo;

	@FindBy(how = How.CSS, using = "[class=\"_3Ep39l\"]")
	private WebElement login;

	@FindBy(css = "[class=\"_2zrpKA _1dBPDZ\"]")
	private WebElement entermobno;

	@FindBy(css = "[class=\"_2zrpKA _3v41xv _1dBPDZ\"]")
	private WebElement pwd;

	@FindBy(xpath = "//div[@class=\"_1avdGP\"]/button")
	private WebElement clickonloginbtn;

	@FindBy(xpath = "//div[text()=\"Vikas\"]")
	private WebElement verifynm;

	public boolean isLogoVisible() {
		return logo.isDisplayed();

	}

	public void clickOnLogin() {
		login.click();
	}

	public void enterMobNo() {
		entermobno.sendKeys("9921194982");

	}

	public void enterPwd() {
		pwd.sendKeys("Vikas@1216");

	}

	public void clickOnLoginBtn() {
		clickonloginbtn.click();

	}

	public String verifyLoginName() {
		String name = verifynm.getText();
		verifynm.getText();
		return name;

	}

}
