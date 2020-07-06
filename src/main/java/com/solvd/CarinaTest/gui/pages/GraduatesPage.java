package com.solvd.CarinaTest.gui.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.CarinaTest.gui.components.FooterMenu;
import com.solvd.CarinaTest.gui.components.FooterPanel;
import com.solvd.CarinaTest.gui.components.HeaderButtons;
import com.solvd.CarinaTest.gui.components.HeaderLinks;
import com.solvd.CarinaTest.gui.components.HeaderLogo;
import com.solvd.CarinaTest.gui.components.HeaderSearch;

public class GraduatesPage extends AbstractPage{

    private static final Logger LOGGER = Logger.getLogger(GraduatesPage.class);
    
    @FindBy(xpath = "//div[contains(@class,'header__botonera')]")
    private HeaderButtons headerButtons;
    
    @FindBy(xpath = "//div[contains(@class,'header__region')]")
    private HeaderLinks headerLinks;
    
    @FindBy(xpath = "//div[contains(@class,'header__logo')]")
    private HeaderLogo headerLogo;
    
    @FindBy(xpath = "//div[contains(@class,'header__botonera')]")
    private HeaderSearch headerSearch;
    
    @FindBy(xpath = "//div[@id=\"views_slideshow_cycle_div_carrousel-block_0\"]")
    private FooterPanel footerPanel;
    
    @FindBy(xpath = "//footer")
    private FooterMenu footerMenu;
    
	@FindBy(xpath = "//div[@class='colgroup__cols1-item']//a")
	private List<ExtendedWebElement> socialNetworkList; 
	
	public GraduatesPage(WebDriver driver) {
		super(driver);
	}
	
	public void selectSocialNetwork(String socialNetwork) {
        LOGGER.info("selecting '" + socialNetwork + "' social network...");
        for (ExtendedWebElement socialNetworkLink : socialNetworkList) {
            String currentSocialNetwork = socialNetworkLink.getText();
            LOGGER.info("currentNew: " + currentSocialNetwork);
            if (socialNetwork.equalsIgnoreCase(currentSocialNetwork)) {
            	socialNetworkLink.click();
                LOGGER.info("Clicked" + currentSocialNetwork);
            }
        }
    }

}
