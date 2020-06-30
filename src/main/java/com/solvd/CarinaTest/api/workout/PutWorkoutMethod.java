package com.solvd.CarinaTest.api.workout;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PutWorkoutMethod extends AbstractApiMethodV2{

	public PutWorkoutMethod() {
		super("api/workout/_put/rq.json","api/workout/_put/rs.json",new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
