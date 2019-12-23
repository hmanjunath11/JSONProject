package com.json.examples.jsonExamples;

import com.google.gson.Gson;
import com.json.javaObjects.Organisation;

public class JsonToJavaObject {

	public static void main(String[] args) {
		
		Organisation org = new Organisation();
		
		org = getOrganisationObject();
		
		System.out.println(org);

	}
	
	private static Organisation getOrganisationObject() 
    { 
		
		String OrganisationJson = "{\"organisation_name\":\"GeeksforGeeks\",\"description\":\"A computer Science portal for Geeks\",\"Employees\":2000}";
  
        // Creating a Gson Object 
        Gson gson = new Gson(); 
  
        // Converting json to object 
        // first parameter should be prpreocessed json 
        // and second should be mapping class 
        Organisation organisation 
            = gson.fromJson(OrganisationJson, 
                            Organisation.class); 
        System.out.println(gson.toJson(organisation));
  
        // return object 
        return organisation; 
    } 

}
