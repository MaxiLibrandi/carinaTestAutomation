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

public class AcademicCalendarPage extends AbstractPage{

    private static final Logger LOGGER = Logger.getLogger(AcademicCalendarPage.class);
    
	@FindBy(xpath = "//div[@class='header-wrapper']")
    private Header header;
	
    @FindBy(xpath = "//div[@class='panel-pane pane-views pane-carrousel']")
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
		LOGGER.info(out);
		return out;
	}
	
	public HomePage clickHeaderLogo() {
		return header.clickLogoHomePage();
	}
}
