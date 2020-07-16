package com.automation.jsonExamples.JSONProjects;

import com.automation.jsonExamples.JSONProjects.javapojoobjects.Organization;
import com.google.gson.Gson;

public class JavaToJson {

	public static void main(String[] args) {
		
		
		Organization org = new Organization();
	    org = getObjectData(org);
	    System.out.println(new Gson().toJson(org));
		

	}
	
	private static Organization getObjectData(Organization org)
	{
		org.setOrganization_Name("JSON Learning");
		org.setDescription("Converting Java Object into JSON");
		org.setEmployees(400);
		
		return org;
		
	}

}
