package com.solvd.CarinaTest.gui.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.CarinaTest.gui.components.FooterMenu;
import com.solvd.CarinaTest.gui.components.FooterPanel;
import com.solvd.CarinaTest.gui.components.Header;
import com.solvd.CarinaTest.gui.components.HeaderButtons;

public class DegreeCareersPage extends AbstractPage{

    private static final Logger LOGGER = Logger.getLogger(DegreeCareersPage.class);
    
    @FindBy(xpath = "//div[@class='header-wrapper']")
    private Header header;
    
    @FindBy(xpath = "//div[@class='panel-pane pane-views pane-carrousel']")
    private FooterPanel footerPanel;
    
    @FindBy(xpath = "//footer")
    private FooterMenu footerMenu;
    
	@FindBy(xpath = "//div[@class='panel-pane pane-token pane-node-body']//li//a")
	private List<ExtendedWebElement> careersList; 
	
	public DegreeCareersPage(WebDriver driver) {
		super(driver);
	}
	
	public Boolean selectCareer(String career) {
		LOGGER.info("selecting '" + career + "' career...");
        for (ExtendedWebElement careerLink : careersList) {
            String currentCareer = careerLink.getText();
            LOGGER.info("Current career: " + currentCareer);
            if (career.equalsIgnoreCase(currentCareer)) {
            	careerLink.click();
                LOGGER.info("Clicked " + career);
                return true;
            }
        }
        return false;
	}

	public void clickGuaraniButtonHeader(){
		header.clickButton(HeaderButtons.GUARANI.getButtonName());
	}
}
