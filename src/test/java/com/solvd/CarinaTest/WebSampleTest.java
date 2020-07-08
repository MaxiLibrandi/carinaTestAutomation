package com.solvd.CarinaTest;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.CarinaTest.gui.pages.AcademicCalendarPage;
import com.solvd.CarinaTest.gui.pages.DegreeCareersPage;
import com.solvd.CarinaTest.gui.pages.GraduatesPage;
import com.solvd.CarinaTest.gui.pages.HomePage;
import com.solvd.CarinaTest.gui.pages.StudiesPage;
import com.solvd.CarinaTest.gui.pages.SubjectsPage;

public class WebSampleTest extends AbstractTest{
	
    private static final Logger LOGGER = Logger.getLogger(WebSampleTest.class);
    
    @Test(description = "Test HomePage")
    @MethodOwner(owner = "Maxi")
    public void testHomePage() {
        // Open home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        // Select new title
        homePage = new HomePage(getDriver());
        homePage.selectTitle("REHTO: Más De 800 Computadoras Recuperadas Ya Fueron Entregadas A Organismos E Instituciones De La Ciudad");
        
        // Come back to home page
        homePage.clickHeaderLogo();
        
        // Search in search box
        homePage.searchHeaderSearch("Argentina");
    }
    
    @Test(description = "Test Academic Calendar Page")
    @MethodOwner(owner = "Maxi")
    public void testAcademicCalendarPage() {
		// Open home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        // Open academic calendar page 
        AcademicCalendarPage academicCalendarPage = homePage.openAcademicCalendarPage();
        
        // Get info from academic calendar page
        LOGGER.info("Getting academic calendar info");
        LOGGER.info(academicCalendarPage.getAcademicCalendarInfo());
        
        // Come back to home page using header logo
        academicCalendarPage.clickHeaderLogo();
    }
    
    @Test(description = "Test Degree Careers Page")
    @MethodOwner(owner = "Maxi")
    public void testDegreeCareersPage() {
		// Open home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        // Open degree careers page 
        DegreeCareersPage degreeCareersPage = homePage.openDegreeCareersPage();
        
        // Select career from careers list
        degreeCareersPage.selectCareer("Analista Programador Universitario");
        
        // Click guarani button from header buttons
        degreeCareersPage.clickGuaraniButtonHeaderButtons();
    }

    @Test(description = "Test Subjects Page")
    @MethodOwner(owner = "Maxi")
    public void testSubjectsPage() {
		// Open home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        // Open subjects page 
        SubjectsPage subjectsPage = homePage.openSubjectsPage();
        
        // Select subject from subjects list
        subjectsPage.selectSubject("Bases de Datos I");
        
        // Click new students link from header links
        subjectsPage.clickNewStudentsLinkHeaderLinks();
    }
    
    @Test(description = "Test Studies Page")
    @MethodOwner(owner = "Maxi")
    public void testStudiesPage() {
		// Open home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        // Open studies page 
        StudiesPage studiesPage = homePage.openStudiesPage();
        
        // Select studies new from news list
        studiesPage.selectNewTitle("Toma Del Campus");
        
        // Click university link from footer menu
        studiesPage.clickUniversityLinkFooterMenu();
    }
    
    @Test(description = "Test Graduates Page")
    @MethodOwner(owner = "Maxi")
    public void testGraduatesPage() {
		// Open home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        // Open graduates page 
        GraduatesPage graduatesPage = homePage.openGraduatesPage();
        
        // Select social network from social networks list
        graduatesPage.selectSocialNetwork("https://www.facebook.com/groups/graduados.exa.unicen/");
        
        // Click moodle link from footer panel
        graduatesPage.clickMoodleLinkFooterPanel();
    }
    
}
