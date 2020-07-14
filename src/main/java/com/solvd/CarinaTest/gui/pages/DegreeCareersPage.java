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

public class DegreeCareersPage extends AbstractPage{

    private static final Logger LOGGER = Logger.getLogger(DegreeCareersPage.class);
    
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

	public void clickGuaraniButtonHeaderButtons(){
		headerButtons.openGuaraniPage();
	}
}
