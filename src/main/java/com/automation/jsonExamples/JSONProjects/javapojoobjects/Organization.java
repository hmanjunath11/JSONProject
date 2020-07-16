package com.automation.jsonExamples.JSONProjects.javapojoobjects;

public class Organization {
	
	private String organization_Name;
	private String description;
	private int Employees;

	
	public String getOrganization_Name()

	{
		return organization_Name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getEmployees() {
		return Employees;
	}


	public void setEmployees(int employees) {
		Employees = employees;
	}


	public void setOrganization_Name(String organization_Name) {
		this.organization_Name = organization_Name;
	}
	
	@Override
	public String toString()
	{
		return "Organization [organization_Name="
				+organization_Name
				+",description="
				+description
				+", Employees="
				+Employees+"]";
				}
}
