package com.solvd.CarinaTest.gui.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.CarinaTest.gui.components.HeaderLinks;

public class HomePage extends AbstractPage{

    private static final Logger LOGGER = Logger.getLogger(HomePage.class);
	
    @FindBy(xpath = "//div[contains(@class,'header__region')]")
    private HeaderLinks headerLinks; 
    
	@FindBy(xpath = "//div[contains(@id,'bloque-noticia')]//div[contains(@class, 'views-field-title')]//a")
	private List<ExtendedWebElement> titlesList; 
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void selectTitle(String title) {
        LOGGER.info("selecting '" + title + "' new...");
        for (ExtendedWebElement titlesLink : titlesList) {
            String currentNew = titlesLink.getText();
            LOGGER.info("currentNew: " + currentNew);
            if (title.equalsIgnoreCase(currentNew)) {
            	titlesLink.click();
                LOGGER.info("Clicked");
            }
        }
    }	
}
