package com.solvd.CarinaTest;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.CarinaTest.gui.pages.AcademicCalendarPage;
import com.solvd.CarinaTest.gui.pages.DegreeCareersPage;
import com.solvd.CarinaTest.gui.pages.GraduatesPage;
import com.solvd.CarinaTest.gui.pages.HomePage;
import com.solvd.CarinaTest.gui.pages.StudiesPage;
import com.solvd.CarinaTest.gui.pages.SubjectsPage;

public class WebSampleTest extends AbstractTest{
	// SELENOID COMMAND
	//selenoid_windows_amd64.exe -conf ./browsers.json -disable-docker 
    
    @DataProvider(parallel = false, name = "DP1")
    public static Object[][] dataprovider()
    {
        return new Object[][] {
            { "Ingeniería de Sistemas" },
            { "Analista Programador Universitario" },
            { "Licenciatura en Ciencias Físicas" },
            { "Profesorado en Informática" }
        };
    }
    
    @Test(description = "Test HomePage")
    @MethodOwner(owner = "Maxi")
    public void testHomePage() {
        // Open home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        // Select new title
        homePage = new HomePage(getDriver());
        Assert.assertTrue(homePage.selectTitle("Mesas De Exámenes Finales Virtuales"), "Title was not found");
        
        // Come back to home page
        homePage.clickHeaderLogo();
        
        //Select another title
        Assert.assertTrue(homePage.selectTitle("REHTO: Continuamos Acercando Tecnología A Distintas Instituciones"), "Title was not found");
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
        
        // Get info from academic calendar page and throw an assertion error if it is empty
        Assert.assertNotEquals(academicCalendarPage.getAcademicCalendarInfo(), "", "Academic calendar info is not upload");
    }
    
    
    @Test(description = "Test Degree Careers Page", dataProvider = "DP1")
    @MethodOwner(owner = "Maxi")
    public void testDegreeCareersPage(String careerName) {
		// Open home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        // Open degree careers page 
        DegreeCareersPage degreeCareersPage = homePage.openDegreeCareersPage();
        
        // Select career from careers list
        Assert.assertTrue(degreeCareersPage.selectCareer(careerName),"Degree career was not found");
        
        // Click guarani button from header buttons
        degreeCareersPage.clickGuaraniButtonHeaderButtons();
    }
    
    
    @Test(description = "Test Subjects Page", dataProvider = "DataProvider")
    @MethodOwner(owner = "Maxi")
    @XlsDataSourceParameters(path = "xls/data_provider.xlsx", sheet = "Subjects", dsUid = "TUID", dsArgs = "subjectName")
    public void testSubjectsPage(String subjectName) {
		// Open home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        // Open subjects page 
        SubjectsPage subjectsPage = homePage.openSubjectsPage();
        
        // Select subject from subjects list
        Assert.assertTrue(subjectsPage.selectSubject(subjectName),"Subject was not found");
        
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
        List<String> newsTitles = studiesPage.getNewsTitles();
        Assert.assertFalse(newsTitles.isEmpty(), "News not found!");
        Assert.assertTrue(newsTitles.stream().anyMatch(title -> title.equals("Toma Del Campus")),"New title now found");
        
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
        Assert.assertNotNull(graduatesPage.findSocialNetwork("facebook"));
        Assert.assertNotEquals(graduatesPage.findSocialNetwork("twitter"),null);
        Assert.assertNotNull(graduatesPage.findSocialNetwork("linkedin"));
        
        // Click moodle link from footer panel
        graduatesPage.clickMoodleLinkFooterPanel();
    }
}
