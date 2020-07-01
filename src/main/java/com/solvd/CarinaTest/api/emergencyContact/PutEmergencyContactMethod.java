package com.solvd.CarinaTest.api.emergencyContact;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PutEmergencyContactMethod extends AbstractApiMethodV2{
	
	public PutEmergencyContactMethod() {
		super("api/emergencyContacts/_put/rq.json","api/emergencyContacts/_put/rs.json",new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
