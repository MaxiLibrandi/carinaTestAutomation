package com.solvd.CarinaTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.CarinaTest.gui.pages.HomePage;

public class WebSampleTest extends AbstractTest{
	
	@Test(description = "Test HomePage")
    @MethodOwner(owner = "Maxi")
    public void testNewTitle() {
        // Open Exactas home page and verify page is opened
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        
        // Select new title
        homePage = new HomePage(getDriver());
        homePage.selectTitle("Exactas Dialoga");
    }
    
}
