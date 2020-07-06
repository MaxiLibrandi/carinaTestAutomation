package com.solvd.CarinaTest;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.CarinaTest.gui.pages.AcademicCalendarPage;
import com.solvd.CarinaTest.gui.pages.DegreeCareersPage;
import com.solvd.CarinaTest.gui.pages.HomePage;

public class WebSampleTest extends AbstractTest{
	
    private static final Logger LOGGER = Logger.getLogger(WebSampleTest.class);
    
	@Test(description = "Test HomePage")
    @MethodOwner(owner = "Maxi")
    public void testHomePage() {
        // Open Exactas home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        // Select new title
        homePage = new HomePage(getDriver());
        homePage.selectTitle("Exactas Dialoga");
        
        // Test footer menu
        homePage.selectFacultyLinkFooterMenu();
    }
	
	@Test(description = "Test AcademicCalendarPage")
    @MethodOwner(owner = "Maxi")
    public void testAcademicCalendarPage() {
		// Open Exactas home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        // Open Academic calendar page and verify page is opened
        AcademicCalendarPage academicCalendarPage = homePage.openAcademicCalendarPage();
        academicCalendarPage.open();
        Assert.assertTrue(academicCalendarPage.isPageOpened(), "Academic calendar page is not opened");
        
        //Get info from academic calendar
        LOGGER.info(academicCalendarPage.getAcademicCalendarInfo());
        
        //Test footer panel
        academicCalendarPage.selectMoodleLinkFooterPanel();
    }
    
	@Test(description = "Test Degree careers page")
    @MethodOwner(owner = "Maxi")
    public void testDegreeCareersPage() {
        // Open degree careers page and verify page is opened
        DegreeCareersPage degreeCareersPage = new DegreeCareersPage(getDriver());
        degreeCareersPage.open();
        Assert.assertTrue(degreeCareersPage.isPageOpened(), "Degree careers page is not opened");
        
        //Select career 
        degreeCareersPage.selectCareer("Analista Programador Universitario");
        
        //Test header button 
        degreeCareersPage.selectGuaraniButtonHeaderButtons();
    }
}
