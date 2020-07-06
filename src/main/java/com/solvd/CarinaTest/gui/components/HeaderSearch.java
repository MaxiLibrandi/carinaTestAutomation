package com.solvd.CarinaTest.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class HeaderSearch extends AbstractUIObject{

	@FindBy(xpath = "//div[contains(@class,'header__botonera')]//input[contains(@id,'edit-search-block-form--2')]")
	private ExtendedWebElement searchTextField;
	
	@FindBy(xpath ="//div[contains(@class,'header__botonera')]//input[@id='edit-submit']")
	private ExtendedWebElement searchButton;
	
	public HeaderSearch(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public void search(String searchString) {
		searchTextField.type(searchString);
		searchButton.click();
	}
}
