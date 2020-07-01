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
import com.solvd.CarinaTest.api.login.PostSignInMethod;
import com.solvd.CarinaTest.api.workout.DeleteWorkoutMethod;
import com.solvd.CarinaTest.api.workout.GetWorkoutMethod;
import com.solvd.CarinaTest.api.workout.PostWorkoutMethod;
import com.solvd.CarinaTest.api.workout.PutWorkoutMethod;

import io.restassured.path.json.JsonPath;

public class APISampleTest {
	
	@Test(description = "Test GET Device User")
    @MethodOwner(owner = "Maxi")
    public void testGetDeviceUser() {
		//Login as Device User to get a token 
		PostSignInMethod postSignInMethod = new PostSignInMethod("api/login/user_login.properties");
		postSignInMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = postSignInMethod.callAPI().asString();
        postSignInMethod.validateResponse();
        
        //Get token from response
        String token = JsonPath.from(rs).getString("token");
        
        //Test GET Device User method
        GetDeviceUserMethod getDeviceUserMethod = new GetDeviceUserMethod();
        getDeviceUserMethod.setHeaders("x-access-token=" + token);
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
    
	@Test(description = "Test Workout Methods")
    @MethodOwner(owner = "Maxi")
    public void testWorkout() {
		//Login as Medical to get a token 
		PostSignInMethod postSignInMethod = new PostSignInMethod("api/login/medical_login.properties");
		postSignInMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rsSignIn = postSignInMethod.callAPI().asString();
        postSignInMethod.validateResponse();
        
        //Get token from response
        String token = JsonPath.from(rsSignIn).getString("token");
        
        //Test POST Workout 
        PostWorkoutMethod postWorkoutMethod = new PostWorkoutMethod();
        postWorkoutMethod.setHeaders("x-access-token=" + token);
        postWorkoutMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rsPostWorkout = postWorkoutMethod.callAPI().asString();
        postWorkoutMethod.validateResponse();
        
        //Get id of inserted Workout
        Integer workoutId = JsonPath.from(rsPostWorkout).getInt("insertId");
        
        //Test GET Workout
        GetWorkoutMethod getWorkoutMethod = new GetWorkoutMethod();
        getWorkoutMethod.replaceUrlPlaceholder("workout_id", workoutId.toString());
        getWorkoutMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWorkoutMethod.callAPI();
        getWorkoutMethod.validateResponse();
        
        //Test PUT Workout
        PutWorkoutMethod putWorkoutMethod = new PutWorkoutMethod();
        putWorkoutMethod.setHeaders("x-access-token=" + token);
        putWorkoutMethod.replaceUrlPlaceholder("workout_id", workoutId.toString());
        putWorkoutMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        putWorkoutMethod.callAPI();
        putWorkoutMethod.validateResponse();
        
        //Test DELETE Workout
        DeleteWorkoutMethod deleteWorkoutMethod = new DeleteWorkoutMethod();
        deleteWorkoutMethod.replaceUrlPlaceholder("workout_id", workoutId.toString());
        deleteWorkoutMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteWorkoutMethod.callAPI();
    }

	@Test(description = "Test EmergencyContact Methods")
    @MethodOwner(owner = "Maxi")
    public void testEmergencyContact() {
		//Login as User to get a token 
		PostSignInMethod postSignInMethod = new PostSignInMethod("api/login/user_login.properties");
		postSignInMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rsSignIn = postSignInMethod.callAPI().asString();
        postSignInMethod.validateResponse();
        
        //Get token from response
        String token = JsonPath.from(rsSignIn).getString("token");
        
        //Test POST EmergencyContact
        PostEmergencyContactMethod postEmergencyContactMethod = new PostEmergencyContactMethod();
        postEmergencyContactMethod.setHeaders("x-access-token=" + token);
        postEmergencyContactMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rsPostEmergencyContact = postEmergencyContactMethod.callAPI().asString();
        postEmergencyContactMethod.validateResponse();
        
        //Get id of inserted Emergency Contact
        Integer emergencyContactId = JsonPath.from(rsPostEmergencyContact).getInt("insertId");
        
        //Test GET EmergencyContact
        GetEmergencyContactMethod getEmergencyContactMethod= new GetEmergencyContactMethod();
        getEmergencyContactMethod.replaceUrlPlaceholder("emergency_contact_id", emergencyContactId.toString());
        getEmergencyContactMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getEmergencyContactMethod.callAPI();
        getEmergencyContactMethod.validateResponse();
        
        //Test PUT EmergencyContact        
        PutEmergencyContactMethod putEmergencyContactMethod = new PutEmergencyContactMethod();
        putEmergencyContactMethod.setHeaders("x-access-token=" + token);
        putEmergencyContactMethod.replaceUrlPlaceholder("emergency_contact_id", emergencyContactId.toString());
        putEmergencyContactMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        putEmergencyContactMethod.callAPI();
        putEmergencyContactMethod.validateResponse();
        
        //Test DELETE EmergencyContact
        DeleteEmergencyContactMethod deleteEmergencyContactMethod = new DeleteEmergencyContactMethod();
        deleteEmergencyContactMethod.replaceUrlPlaceholder("emergency_contact_id", emergencyContactId.toString());
        deleteEmergencyContactMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteEmergencyContactMethod.callAPI();
    }
}
