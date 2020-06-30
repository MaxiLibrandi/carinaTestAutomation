package com.solvd.CarinaTest.api.workout;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostWorkoutMethod extends AbstractApiMethodV2{

	public PostWorkoutMethod() {
		super("api/workout/_post/rq.json","api/workout/_post/rs.json",new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
