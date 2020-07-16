package com.automation.jsonExamples.JSONProjects;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.automation.jsonExamples.JSONProjects.javapojoobjects.Staff;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;


public class JsonFileToJavaObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
        

            // Convert JSON File to Java Object
            
			try {
			Staff staff = gson.fromJson(new FileReader("/Users/manjunathah/FT-Automation-workspace_Karate/jsonExamples/src/jsonSource/staff.json"), Staff.class);
			// print staff 
            System.out.println(staff);
			} catch (JsonSyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonIOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			


    

	}

}
