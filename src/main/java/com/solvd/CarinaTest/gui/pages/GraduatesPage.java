package com.solvd.CarinaTest.gui.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.CarinaTest.gui.components.FooterMenu;
import com.solvd.CarinaTest.gui.components.FooterPanel;
import com.solvd.CarinaTest.gui.components.FooterPanels;
import com.solvd.CarinaTest.gui.components.Header;

public class GraduatesPage extends AbstractPage{

    private static final Logger LOGGER = Logger.getLogger(GraduatesPage.class);
    
    @FindBy(xpath = "//div[@class='header-wrapper']")
    private Header header;

    @FindBy(xpath = "//div[@class='panel-pane pane-views pane-carrousel']")
    private FooterPanel footerPanel;
    
    @FindBy(xpath = "//footer")
    private FooterMenu footerMenu;
    
	@FindBy(xpath = "//div[@class='colgroup__cols1-item']//a")
	private List<ExtendedWebElement> socialNetworkList; 
	
	public GraduatesPage(WebDriver driver) {
		super(driver);
	}
	
	public String findSocialNetwork(String socialNetwork) {
        LOGGER.info("looking for '" + socialNetwork + "' social network...");
        for (ExtendedWebElement socialNetworkLink : socialNetworkList) {
            String currentSocialNetwork = socialNetworkLink.getAttribute("href");
            LOGGER.info("current social network: " + currentSocialNetwork);
            if (currentSocialNetwork.contains(socialNetwork)) {
                LOGGER.info("Found " + currentSocialNetwork);
                return currentSocialNetwork;
            }
        }
        return null;
    }

	public void clickMoodleLinkFooterPanel() {
		footerPanel.clickPanel(FooterPanels.MOODLE.getPanelName());
	}
}
