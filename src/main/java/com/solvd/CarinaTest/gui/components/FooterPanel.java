package com.solvd.CarinaTest.gui.components;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class FooterPanel extends AbstractUIObject{

	private static final Logger LOGGER = Logger.getLogger(FooterPanel.class);
	
	@FindBy(xpath ="./div//div[2]/div/a")
	private List<ExtendedWebElement> panels;
	
	public FooterPanel(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public void clickPanel(String panelHref) {
		for(ExtendedWebElement panel : panels) {
			String currentPanelHref = panel.getAttribute("href"); 
			LOGGER.info("Current panel " + currentPanelHref); 
			if(currentPanelHref.contains(panelHref)) {
				panel.click();
				return;
			}
		}
	}
}
