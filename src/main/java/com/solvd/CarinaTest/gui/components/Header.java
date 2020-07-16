package com.solvd.CarinaTest.gui.components;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.CarinaTest.gui.pages.HomePage;

public class Header extends AbstractUIObject {
	
	private static final Logger LOGGER = Logger.getLogger(Header.class);
	
	@FindBy(xpath = ".//div[@class='header__botonera']//a")
	private List<ExtendedWebElement> buttons; 
	
	@FindBy(xpath = ".//div[contains(@class,'header__region')]//a")
	private List<ExtendedWebElement> links;
	
	@FindBy(xpath = ".//div[@class='header__logo']//img")
	private ExtendedWebElement homeLogo; 
	
	@FindBy(xpath = ".//div[@class='header__botonera']//input[@name='search_block_form']")
	private ExtendedWebElement searchTextField;
	
	@FindBy(xpath =".//div[@class='header__botonera']//input[@name='op']")
	private ExtendedWebElement searchButton;
	
	public Header(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public void clickButton(String buttonText) {
		for(ExtendedWebElement button : buttons) {
			String currentButtonText = button.getText(); 
			LOGGER.info("Current button " + currentButtonText); 
			if(currentButtonText.contains(buttonText)) {
				button.click();
				return;
			}
		}
	}
	
	public void clickLink(String linkText) {
		for(ExtendedWebElement link : links) {
			String currentLinkText = link.getText(); 
			LOGGER.info("Current link " + currentLinkText); 
			if(currentLinkText.equals(linkText)) {
				link.click();
				return;
			}
		}
	}
	
	public HomePage clickLogoHomePage() {
		homeLogo.click();
		return new HomePage(driver);
	}
	
	public void search(String searchString) {
		searchTextField.type(searchString);
		searchButton.click();
	}
}
