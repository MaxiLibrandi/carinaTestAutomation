package com.solvd.CarinaTest.gui.components;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class FooterMenu extends AbstractUIObject{

	private static final Logger LOGGER = Logger.getLogger(FooterMenu.class);
	
	@FindBy(xpath = "./div[@id='block-block-1']//a")
	private List<ExtendedWebElement> links;
	
	public FooterMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public void clickLink(String linkHref) {
		for(ExtendedWebElement link : links) {
			String currentLinkHref = link.getAttribute("href");
			LOGGER.info("Current footer link href " + currentLinkHref); 
			if(currentLinkHref.contains(linkHref)) {
				link.click();
				return;
			}
		}
	}
}
