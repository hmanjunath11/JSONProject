package com.automation.jsonExamples.JSONProjects;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.automation.jsonExamples.JSONProjects.javapojoobjects.Staff;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;


public class JavaObjectsToJsonFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		Staff staff =  createStaffObject();
		System.out.println("Hello"+gson.toJson(staff).toString());
		
		
		  try { 
			  FileWriter writer = new FileWriter("/Users/manjunathah/FT-Automation-workspace_Karate/jsonExamples/src/jsonSource/Newstaff.json"); 
			writer.write(gson.toJson(staff).toString());
			  writer.close();
			  
		  }
		  
		  catch(JsonIOException e) {
		  e.printStackTrace(); } 
		  catch (IOException e) {
		  
		  e.printStackTrace(); }
		 
		

	}
	
	private  static Staff createStaffObject()
	{
		Staff staff = new Staff();
		
		staff.setName("MkYoung");
		staff.setAge(45);
		staff.setPosition(new String[] {"Founder","CEO","CTO","CFO","Tester"});
		staff.setSkills(Arrays.asList("Java","Automation","Product"));
		Map<String, BigDecimal> salary = new HashMap<String, BigDecimal>();
		salary.put("2010",new BigDecimal(50000));
		salary.put("2016",new BigDecimal(75000));
		salary.put("2019",new BigDecimal(100000));
				
		staff.setSalary(salary);
		
		return staff;
	}

}
