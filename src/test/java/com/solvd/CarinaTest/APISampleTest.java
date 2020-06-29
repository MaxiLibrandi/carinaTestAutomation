package com.solvd.CarinaTest;

import org.testng.annotations.Test;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.CarinaTest.api.deviceUser.GetDeviceUserMethod;
import com.solvd.CarinaTest.api.deviceUser.PostDeviceUserMethod;
import com.solvd.CarinaTest.api.emergencyContact.DeleteEmergencyContactMethod;
import com.solvd.CarinaTest.api.emergencyContact.GetEmergencyContactMethod;
import com.solvd.CarinaTest.api.emergencyContact.PostEmergencyContactMethod;
import com.solvd.CarinaTest.api.emergencyContact.PutEmergencyContactMethod;
import com.solvd.CarinaTest.api.workout.DeleteWorkoutMethod;
import com.solvd.CarinaTest.api.workout.GetWorkoutMethod;
import com.solvd.CarinaTest.api.workout.PostWorkoutMethod;
import com.solvd.CarinaTest.api.workout.PutWorkoutMethod;

public class APISampleTest extends AbstractTest{
	
	@Test(description = "Test GET Device User")
    @MethodOwner(owner = "Maxi")
    public void testGetDeviceUser() {
        GetDeviceUserMethod getDeviceUserMethod = new GetDeviceUserMethod();
        getDeviceUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getDeviceUserMethod.callAPI();
        getDeviceUserMethod.validateResponse();
    }
	
	@Test(description = "Test POST Device User")
    @MethodOwner(owner = "Maxi")
    public void testPostDeviceUser() {
        PostDeviceUserMethod postDeviceUserMethod = new PostDeviceUserMethod();
        postDeviceUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        postDeviceUserMethod.callAPI();
        postDeviceUserMethod.validateResponse();
    }
	
	@Test(description = "Test GET Workout")
    @MethodOwner(owner = "Maxi")
    public void testGetWorkout() {
        GetWorkoutMethod getWorkoutMethod = new GetWorkoutMethod();
        getWorkoutMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWorkoutMethod.callAPI();
        getWorkoutMethod.validateResponse();
    }
	
	@Test(description = "Test POST Workout")
    @MethodOwner(owner = "Maxi")
    public void testPostWorkout() {
        PostWorkoutMethod postWorkoutMethod = new PostWorkoutMethod();
        postWorkoutMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        postWorkoutMethod.callAPI();
    }
	
	@Test(description = "Test PUT Workout")
    @MethodOwner(owner = "Maxi")
    public void testPutWorkout() {
        PutWorkoutMethod putWorkoutMethod = new PutWorkoutMethod();
        putWorkoutMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        putWorkoutMethod.callAPI();
    }
	
	@Test(description = "Test Delete Workout")
    @MethodOwner(owner = "Maxi")
    public void testDeleteWorkout() {
        DeleteWorkoutMethod deleteWorkoutMethod = new DeleteWorkoutMethod();
        deleteWorkoutMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteWorkoutMethod.callAPI();
    }
	
	@Test(description = "Test GET EmergencyContact")
    @MethodOwner(owner = "Maxi")
    public void testGetEmergencyContact() {
        GetEmergencyContactMethod getEmergencyContactMethod= new GetEmergencyContactMethod();
        getEmergencyContactMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getEmergencyContactMethod.callAPI();
        getEmergencyContactMethod.validateResponse();
    }
	
	@Test(description = "Test POST EmergencyContact")
    @MethodOwner(owner = "Maxi")
    public void testPostEmergencyContact() {
        PostEmergencyContactMethod postEmergencyContactMethod = new PostEmergencyContactMethod();
        postEmergencyContactMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        postEmergencyContactMethod.callAPI();
    }
	
	@Test(description = "Test PUT EmergencyContact")
    @MethodOwner(owner = "Maxi")
    public void testPutEmergencyContact() {
        PutEmergencyContactMethod putEmergencyContactMethod = new PutEmergencyContactMethod();
        putEmergencyContactMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        putEmergencyContactMethod.callAPI();
    }
	
	@Test(description = "Test Delete EmergencyContact")
    @MethodOwner(owner = "Maxi")
    public void testDeleteEmergencyContact() {
        DeleteEmergencyContactMethod deleteEmergencyContactMethod = new DeleteEmergencyContactMethod();
        deleteEmergencyContactMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteEmergencyContactMethod.callAPI();
    }	
}
