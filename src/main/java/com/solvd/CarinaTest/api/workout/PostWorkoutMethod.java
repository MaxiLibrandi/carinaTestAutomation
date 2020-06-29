package com.solvd.CarinaTest.api.workout;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostWorkoutMethod extends AbstractApiMethodV2{

	public PostWorkoutMethod() {
		super("api/workout/_post/rq.json",null,new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
		setHeaders("x-access-token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6InBydWViYTBAZ21haWwuY29tIiwiaWF0IjoxNTkxODIwMDU0fQ.lzmtddKpUhZ_82kgmgYQjz2T-KgEEEzCQVLwdDBusW4");
	}
}
