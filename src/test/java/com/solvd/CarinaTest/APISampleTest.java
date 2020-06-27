package com.solvd.CarinaTest;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.CarinaTest.api.deviceUser.GetDeviceUserMethod;

public class APISampleTest{
	
	@Test(description = "Test GET Device User")
    @MethodOwner(owner = "Maxi")
    public void testGetDeviceUser() {
        GetDeviceUserMethod getDeviceUserMethod = new GetDeviceUserMethod();
        getDeviceUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getDeviceUserMethod.callAPI();
        getDeviceUserMethod.validateResponse();
    }
}
