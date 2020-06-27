package com.solvd.CarinaTest.api.deviceUser;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetDeviceUserMethod extends AbstractApiMethodV2{
	
	public GetDeviceUserMethod(){
		super(null,"api/deviceUsers/_get/rs.json",new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
		setHeaders("x-access-token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImVzdGFuaUBnbWFpbC5jb20iLCJpYXQiOjE1OTIyNTQ5MjV9.YKrl0V8JzKJ7e_HQINn2JcxQGEHhl_pJkolow4V-Y1o");
	}
}
