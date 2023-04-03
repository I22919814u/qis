package com.gofortrainings.qisportpolio.core.servlets;

import javax.servlet.Servlet;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Servlet.class)
@SlingServletResourceTypes(resourceTypes ="newsportal/components/page" )
public class QisApi extends SlingAllMethodsServlet {

	private static final Logger log =LoggerFactory.getLogger(QisApi.class);
	@Override
	protected void doGet(SlingHttpServletRequest request,SlingHttpServletResponse response) 
	throws  ServletException{
		try {
			ResourceResolver res=request.getResourceResolver();	
			
		
		}
		catch(Exception e) {}
	}
}
