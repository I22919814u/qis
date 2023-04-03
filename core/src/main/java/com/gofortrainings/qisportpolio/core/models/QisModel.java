package com.gofortrainings.qisportpolio.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class QisModel {
	@Optional
	@ValueMapValue
	private String  title;
	@Optional
	@ValueMapValue
	
	private String disc;
	@Optional
	@ValueMapValue
	private String pic1;
	@Optional
	@ValueMapValue
	private String disc2;
	@Optional
	@ValueMapValue
	private String pic2;
	
	public String getTitle() {
		return title;
	}
	public String getDisc() {
		return disc;
	}
	public String getPic1() {
		return pic1;
	}
	public String getDisc2() {
		return disc2;
	}
	public String getPic2() {
		return pic2;
	}
	
	
}
