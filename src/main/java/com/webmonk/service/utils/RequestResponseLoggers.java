package com.webmonk.service.utils;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
 

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.message.internal.ReaderWriter;

public class RequestResponseLoggers implements ContainerRequestFilter, ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext arg0,
			ContainerResponseContext arg1) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void filter(ContainerRequestContext arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
