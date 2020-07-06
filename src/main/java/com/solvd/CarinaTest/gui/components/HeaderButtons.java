package com.solvd.CarinaTest.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.CarinaTest.gui.pages.HomePage;

public class HeaderButtons extends AbstractUIObject{
	
	@FindBy(xpath = ".//li[contains(@class,'home')]//a")
	private ExtendedWebElement homeButton; 
	
	@FindBy(xpath = ".//li[contains(@class,'siuguarani')]//a")
	private ExtendedWebElement guaraniButton;
	
	@FindBy(xpath = ".//li[contains(@class,'telefonos')]//a")
	private ExtendedWebElement phonesButton;
	
	@FindBy(xpath = ".//li[contains(@class,'webmailunicen')]//a")
	private ExtendedWebElement teachersButton;
	
	@FindBy(xpath = ".//li[contains(@class,'mailalumnos')]//a")
	private ExtendedWebElement studentsButton;
	
	@FindBy(xpath = ".//li[contains(@class,'documentos')]//a")
	private ExtendedWebElement documentsButton;
	
	public HeaderButtons(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public HomePage openHomePage() {
		homeButton.click();
		return new HomePage(driver);
	}
	
	public void openGuaraniPage() {
		guaraniButton.click();
	}
	
	public void openPhonesPage() {
		phonesButton.click();
	}
	
	public void openTeachersPage() {
		teachersButton.click();
	}
	
	public void openStudentsPage() {
		studentsButton.click();
	}
	
	public void openDocumentsPage() {
		documentsButton.click();
	}
}
