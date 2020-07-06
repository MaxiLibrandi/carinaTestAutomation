package com.solvd.CarinaTest.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class HeaderLinks extends AbstractUIObject{

	@FindBy(xpath = ".//li[contains(@class,'1634')]//a")
	private ExtendedWebElement newStudentsLink;
	
	@FindBy(xpath = ".//li[contains(@class,'1638')]//a")
	private ExtendedWebElement studentsLink;
	
	@FindBy(xpath = ".//li[contains(@class,'1643')]//a")
	private ExtendedWebElement teachersLink;
	
	@FindBy(xpath = ".//li[contains(@class,'1648')]//a")
	private ExtendedWebElement notTeachersLink;
	
	@FindBy(xpath = ".//li[contains(@class,'1653')]//a")
	private ExtendedWebElement graduatesLink;
	
	@FindBy(xpath = ".//li[contains(@class,'1655')]//a")
	private ExtendedWebElement schoolsLink;
	
	@FindBy(xpath = ".//li[contains(@class,'1657')]//a")
	private ExtendedWebElement enterprisesLink;
	
	public HeaderLinks(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public void openNewStudentsPage() {
		newStudentsLink.click();
	}
	
	public void openStudentsPage() {
		studentsLink.click();
	}
	
	public void openTeachersPage() {
		teachersLink.click();
	}
	
	public void openNotTeachersPage() {
		notTeachersLink.click();
	}
	
	public void openGradutesPage() {
		graduatesLink.click();
	}
	
	public void openSchoolsPage() {
		schoolsLink.click();
	}
	
	public void openEnterprisesPage() {
		enterprisesLink.click();
	}
}
