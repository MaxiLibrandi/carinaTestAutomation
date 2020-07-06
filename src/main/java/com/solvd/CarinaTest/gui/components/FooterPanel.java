package com.solvd.CarinaTest.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class FooterPanel extends AbstractUIObject{
	
	@FindBy(xpath ="./div[1]/div[2]/div/a")
	private ExtendedWebElement guaraniPanel;

	@FindBy(xpath ="./div[2]/div[2]/div/a")
	private ExtendedWebElement moodlePanel;

	@FindBy(xpath ="./div[3]/div[2]/div/a")
	private ExtendedWebElement unicenPanel;

	@FindBy(xpath ="./div[4]/div[2]/div/a")
	private ExtendedWebElement cefcePanel;

	@FindBy(xpath ="./div[5]/div[2]/div/a")
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
