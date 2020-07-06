package com.solvd.CarinaTest.gui.pages;

import java.util.List;

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

public class AcademicCalendarPage extends AbstractPage{
    
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
	
	@FindBy(xpath = "//div[@class='panel-pane pane-token pane-node-body']//*[self::p | self::b]")
	private List<ExtendedWebElement> academicCalendarInfo; 
	
	public AcademicCalendarPage(WebDriver driver) {
		super(driver);
	}
	
	public String getAcademicCalendarInfo() {
		String out = "";
		for(ExtendedWebElement element: academicCalendarInfo) {
			String currentElement = element.getText();
			out += currentElement + "\n";
		}
		return out;
	}
	
	public void selectMoodleLinkFooterPanel() {
		footerPanel.openMoodlePage();
	}
}
