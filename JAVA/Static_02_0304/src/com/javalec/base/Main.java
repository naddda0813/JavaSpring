package com.javalec.base;

public class Main {

	public static void main(String[] args) {
	
	String id;
	String password; 
	
	Login login = new Login();
	login.takeId();
	login.takePassword();
	
	System.out.print("±Õ«œ¿« ");
	login.takeId();login.takePassword();


}
}
