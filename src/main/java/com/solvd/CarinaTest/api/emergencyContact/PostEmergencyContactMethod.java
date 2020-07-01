package com.solvd.CarinaTest.api.emergencyContact;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostEmergencyContactMethod extends AbstractApiMethodV2{

	public PostEmergencyContactMethod() {
		super("api/emergencyContacts/_post/rq.json","api/emergencyContacts/_post/rs.json",new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
