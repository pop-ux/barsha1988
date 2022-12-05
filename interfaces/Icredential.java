package com.interfaces;
public interface Icredential<Employee>{
	String generatepassword();
	String generateEmailAddress(String firstName,String lastName,String department);
	public void showCredential(Employee employee);
	
	
}
