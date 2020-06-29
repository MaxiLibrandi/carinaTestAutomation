package com.solvd.CarinaTest.api.workout;

import java.util.Properties;
import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetWorkoutMethod extends AbstractApiMethodV2{
	
	public GetWorkoutMethod() {
		super(null,"api/workout/_get/rs.json",new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
