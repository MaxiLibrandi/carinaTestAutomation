package com.solvd.CarinaTest.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class FooterMenu extends AbstractUIObject{
	
	@FindBy(xpath = "//footer//strong//a[1]")
	private ExtendedWebElement facultyLink;

	@FindBy(xpath = "//footer//strong//a[2]")
	private ExtendedWebElement universityLink;

	@FindBy(xpath = "//footer//strong//a[3]")
	private ExtendedWebElement locationLink;

	@FindBy(xpath = "//footer//p/a")
	private ExtendedWebElement webmasterLink;
	
	public FooterMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public void openFacultyPage() {
		facultyLink.click();
	}
	
	public void openUniversityPage() {
		universityLink.click();
	}
	
	public void openLocationPage() {
		locationLink.click();
	}
	
	public void openWebmasterPage() {
		webmasterLink.click();
	}

	
}
