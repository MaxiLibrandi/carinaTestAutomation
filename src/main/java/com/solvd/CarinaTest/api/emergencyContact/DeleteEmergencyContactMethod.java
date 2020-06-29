package com.solvd.CarinaTest.api.emergencyContact;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeleteEmergencyContactMethod extends AbstractApiMethodV2{
	
	public DeleteEmergencyContactMethod() {
		super(null,null,new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
