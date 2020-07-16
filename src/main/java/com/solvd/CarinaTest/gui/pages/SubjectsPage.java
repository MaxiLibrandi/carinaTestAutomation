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

public class SubjectsPage extends AbstractPage{

    private static final Logger LOGGER = Logger.getLogger(SubjectsPage.class);
    
    @FindBy(xpath = "//div[@class='header-wrapper']")
    private Header header;

    @FindBy(xpath = "//div[@class='panel-pane pane-views pane-carrousel']")
    private FooterPanel footerPanel;
    
    @FindBy(xpath = "//footer")
    private FooterMenu footerMenu;
    
	@FindBy(xpath = "//div[@class='colgroup-nested__container']//li//a")
	private List<ExtendedWebElement> subjectsList; 
	
	public SubjectsPage(WebDriver driver) {
		super(driver);
	}
	
	public Boolean selectSubject(String subject) {
		LOGGER.info("selecting '" + subject + "' subject...");
        for (ExtendedWebElement subjectLink : subjectsList) {
            String currentSubject = subjectLink.getText();
            LOGGER.info("current subject: " + currentSubject);
            if (subject.equalsIgnoreCase(currentSubject)) {
            	subjectLink.click();
                LOGGER.info("Clicked " + currentSubject);
                return true;
            }
        }
        return false;
	}
	
	public void clickNewStudentsLinkHeader() {
		header.clickLink(HeaderLinks.NEW_STUDENTS.getLinkName());
	}
}
