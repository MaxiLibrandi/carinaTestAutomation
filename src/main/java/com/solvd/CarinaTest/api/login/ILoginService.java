package com.solvd.CarinaTest.api.login;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;

import io.restassured.path.json.JsonPath;

public interface ILoginService {

	public default String login(String pathToCredentials) {
		PostSignInMethod postSignInMethod = new PostSignInMethod(pathToCredentials);
		postSignInMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rsSignIn = postSignInMethod.callAPI().asString();
        postSignInMethod.validateResponse();
        return JsonPath.from(rsSignIn).getString("token");
	}
}
