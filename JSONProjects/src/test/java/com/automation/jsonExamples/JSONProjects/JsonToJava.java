package com.automation.jsonExamples.JSONProjects;

import com.automation.jsonExamples.JSONProjects.javapojoobjects.Organization;
import com.google.gson.Gson;

public class JsonToJava {

	public static void main(String[] args) {
		
		Organization org = new Organization();
		org = getOrganizationObject();
		System.out.println(org);

	}
	
	private static Organization getOrganizationObject()
	{
		
		String OrganisationJson = "{"
				+ "\"organization_Name\" : \"GeekforGeeks\","
				+ "\"description\":\"Json Exmaples\","
				+ "\"Employees\":200}";
		
		Gson gson = new Gson();
		Organization organization = gson.fromJson(OrganisationJson, Organization.class);
		return organization;
 
	}
}
	
