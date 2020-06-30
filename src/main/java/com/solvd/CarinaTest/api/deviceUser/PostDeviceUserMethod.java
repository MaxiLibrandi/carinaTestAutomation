package com.solvd.CarinaTest.api.deviceUser;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostDeviceUserMethod extends AbstractApiMethodV2{
	
	public PostDeviceUserMethod() {
		super("api/deviceUsers/_post/rq.json","api/deviceUsers/_post/rs.json","api/deviceUsers/device_user.properties");
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
