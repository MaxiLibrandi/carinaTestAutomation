package com.solvd.CarinaTest.gui.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.CarinaTest.gui.components.FooterLinks;
import com.solvd.CarinaTest.gui.components.FooterMenu;
import com.solvd.CarinaTest.gui.components.FooterPanel;
import com.solvd.CarinaTest.gui.components.Header;

public class StudiesPage extends AbstractPage{

    private static final Logger LOGGER = Logger.getLogger(StudiesPage.class);
    
    @FindBy(xpath = "//div[@class='header-wrapper']")
    private Header header;

    @FindBy(xpath = "//div[@class='panel-pane pane-views pane-carrousel']")
    private FooterPanel footerPanel;
    
    @FindBy(xpath = "//footer")
    private FooterMenu footerMenu;
    
	@FindBy(xpath = "//div[contains(@class,'pane-noticias')]//td//div[contains(@class,'field-title')]//a")
	private List<ExtendedWebElement> newsList; 
	
	public StudiesPage(WebDriver driver) {
		super(driver);
	}
	
	public List<String> getNewsTitles() {
		List<String> newsTitles = new ArrayList<String>();
        for (ExtendedWebElement titlesLink : newsList) {
            String currentNew = titlesLink.getText();
            LOGGER.info("current new title: " + currentNew);
            newsTitles.add(currentNew);
        }
        return newsTitles;
    }
	
	public void clickUniversityLinkFooterMenu() {
		footerMenu.clickLink(FooterLinks.UNIVERSITY.getLinkName());
	}
}
