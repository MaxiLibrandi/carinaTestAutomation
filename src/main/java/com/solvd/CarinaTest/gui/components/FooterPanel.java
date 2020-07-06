package com.solvd.CarinaTest.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class FooterPanel extends AbstractUIObject{
	
	@FindBy(xpath ="//div[@id=\"views_slideshow_cycle_div_carrousel-block_0\"]//div[1]//div[contains(@class,'field-content')]//a")
	private ExtendedWebElement guaraniPanel;

	@FindBy(xpath ="//div[@id=\"views_slideshow_cycle_div_carrousel-block_0\"]//div[2]//div[contains(@class,'field-content')]//a")
	private ExtendedWebElement moodlePanel;

	@FindBy(xpath ="//div[@id=\"views_slideshow_cycle_div_carrousel-block_0\"]//div[3]//div[contains(@class,'field-content')]//a")
	private ExtendedWebElement unicenPanel;

	@FindBy(xpath ="//div[@id=\"views_slideshow_cycle_div_carrousel-block_0\"]//div[4]//div[contains(@class,'field-content')]//a")
	private ExtendedWebElement cefcePanel;

	@FindBy(xpath ="//div[@id=\"views_slideshow_cycle_div_carrousel-block_0\"]//div[5]//div[contains(@class,'field-content')]//a")
	private ExtendedWebElement libraryPanel;
	
	public FooterPanel(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public void openGuaraniPage() {
		guaraniPanel.click();
	}
	
	public void openMoodlePage() {
		moodlePanel.click();
	}
	
	public void openUnicenPage() {
		unicenPanel.click();
	}
	
	public void openCefcePage() {
		cefcePanel.click();
	}
	
	public void openLibraryPage() {
		libraryPanel.click();
	}

}
