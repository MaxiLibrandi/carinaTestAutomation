package com.solvd.CarinaTest.login;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostSignInMethod extends AbstractApiMethodV2{
	
	public PostSignInMethod(String propertiesPath) {
		super("api/login/rq.json","api/login/rs.json",propertiesPath);
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
