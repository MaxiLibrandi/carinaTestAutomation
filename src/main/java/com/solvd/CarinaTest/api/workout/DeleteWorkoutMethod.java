package com.solvd.CarinaTest.api.workout;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeleteWorkoutMethod extends AbstractApiMethodV2{

	public DeleteWorkoutMethod() {
		super(null,null,new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
