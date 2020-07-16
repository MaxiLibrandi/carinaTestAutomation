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
import com.solvd.CarinaTest.gui.components.HeaderLinks;

public class HomePage extends AbstractPage{

    private static final Logger LOGGER = Logger.getLogger(HomePage.class);
    
    @FindBy(xpath = "//div[@class='header-wrapper']")
    private Header header;

    @FindBy(xpath = "//div[@class='panel-pane pane-views pane-carrousel']")
    private FooterPanel footerPanel;
    
    @FindBy(xpath = "//footer")
    private FooterMenu footerMenu;
	
	@FindBy(xpath = "//ul[contains(@class,'menu')]//li[contains(@class,'menu-mlid-667')]/a")
	private ExtendedWebElement studiesLink;
	
	@FindBy(xpath = "//ul[contains(@class,'menu')]//li[contains(@class,'menu-mlid-2426')]//a")
	private ExtendedWebElement academicCalendarLink;

	@FindBy(xpath = "//ul[contains(@class,'menu')]//li[contains(@class,'menu-mlid-686')]//a")
	private ExtendedWebElement degreeCareersLink;
	
	@FindBy(xpath = "//ul[contains(@class,'menu')]//li[contains(@class,'menu-mlid-1633')]//a")
	private ExtendedWebElement subjectsLink;
    
    @FindBy(xpath = "//div[contains(@id,'bloque-noticia')]//div[contains(@class, 'views-field-title')]//a")
	private List<ExtendedWebElement> titlesList; 
    
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public Boolean selectTitle(String title) {
        LOGGER.info("selecting '" + title + "' new...");
        for (ExtendedWebElement titlesLink : titlesList) {
            String currentNew = titlesLink.getText();
            LOGGER.info("current new: " + currentNew);
            if (title.equalsIgnoreCase(currentNew)) {
            	titlesLink.click();
                LOGGER.info("Clicked " + title);
                return true;
            }
        }
        return false;
    }
	
	public StudiesPage openStudiesPage() {
		studiesLink.click();
		return new StudiesPage(getDriver());
	}
	
	public AcademicCalendarPage openAcademicCalendarPage() {
		academicCalendarLink.click();
		return new AcademicCalendarPage(getDriver());
	}
	
	public DegreeCareersPage openDegreeCareersPage() {
		degreeCareersLink.click();
		return new DegreeCareersPage(getDriver());
	}
	
	public SubjectsPage openSubjectsPage() {
		subjectsLink.click();
		return new SubjectsPage(getDriver());
	}
	
	public GraduatesPage openGraduatesPage() {
		header.clickLink(HeaderLinks.GRADUATES.getLinkName());
		return new GraduatesPage(getDriver());
	}
	
	public HomePage clickHeaderLogo() {
		return header.clickLogoHomePage();
	}
	
	public void searchHeader(String query) {
		header.search(query);
	}
}
