package com.solvd.CarinaTest.api.emergencyContact;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetEmergencyContactMethod extends AbstractApiMethodV2{
	
	public GetEmergencyContactMethod() {
		super(null,"api/emergencyContacts/_get/rs.json", new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
