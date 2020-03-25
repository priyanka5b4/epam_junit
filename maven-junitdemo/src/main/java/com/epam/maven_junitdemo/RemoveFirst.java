package com.epam.maven_junitdemo;

public class RemoveFirst {

	public String Remove(String string) {
		// TODO Auto-generated method stub
		
 if(string.charAt(0)=='A' && string.charAt(1)=='A')
	        string=string.substring(2);
   else if(string.charAt(1)=='A')
	             string=string.substring(0,1)+string.substring(2);

   else if(string.charAt(0)=='A')
       string=string.substring(1);
	
		
		return   string;
	}

}
