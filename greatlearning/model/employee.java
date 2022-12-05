package com.greatlearning.model;
import java.util.*;



public class employee<Scanner> {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private int defaultPasswordLength=8;
	private Object math;
	
	
	public employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.email = generateEmailAddress(this.firstName,this.lastName);
		String generatepassword = null;
		this.password = generatepassword;
		System.out.printf("Dear"+ this.firstName,this.lastName);
		
		
		
	}


	private String generateEmailAddress(String firstName2, String lastName2) {
		// TODO Auto-generated method stub
		return null;}
	
		public String department() 
		{
			Scanner i=new Scanner(System.in);
			String Tech;
			String Admin;
			String HumenResource;
			String legal;
			System.out.println("Please enter the department from following:"+Tech +Admin +HumenResource +legal);
		
			int choice=(i).nextInt();
			if(choice==1)
			{
				return "Tech";
			}
			else if(choice==2)
			{
				return "Admin";
			}
			else if(choice==3)
			{
				return "HR";
			}
			else if(choice==4)
			{
				return "legal";
			}
			else 
			{
				return "";
			}
		
		
	}
public String generatePassword()
{
	String set = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%^&*";
	char[] password=new char[defaultPasswordLength];
	for(defaultPasswordLength=0;defaultPasswordLength<defaultPasswordLength;defaultPasswordLength++)
	{
		
		int rand=(int) (Math.random()*set.length());
		password[defaultPasswordLength]=set.charAt(rand);
	}
	return new String(password);
	
}

public String generateEmail(String firstName,String lastName)
{
email=firstName.toLowerCase()+""+lastName.toLowerCase()+"@" +department;
return email;

}
public String showCredentials()
{
return "Email---->"+email+
		"Password----->"+password;



		
		}


	
	
    
    	
    }

	
		
	
	
	


