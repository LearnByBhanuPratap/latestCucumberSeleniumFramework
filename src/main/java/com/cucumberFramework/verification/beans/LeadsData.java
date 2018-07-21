package com.cucumberFramework.verification.beans;

public class LeadsData {
	
	private static String firstName;
	private static String lastName;
	private static String companyName;
	private static String streetAdress;
	private static String email;
	
	public static String getFirstName() {
		return firstName;
	}
	public static void setFirstName(String firstName) {
		LeadsData.firstName = firstName;
	}
	public static String getLastName() {
		return lastName;
	}
	public static void setLastName(String lastName) {
		LeadsData.lastName = lastName;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		LeadsData.companyName = companyName;
	}
	public static String getStreetAdress() {
		return streetAdress;
	}
	public static void setStreetAdress(String streetAdress) {
		LeadsData.streetAdress = streetAdress;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		LeadsData.email = email;
	}

}
