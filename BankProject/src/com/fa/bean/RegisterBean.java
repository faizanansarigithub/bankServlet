package com.fa.bean;

public class RegisterBean {
	private static String name;
	private static long mobile;
	private static String gender;
	private static String email;
	private static String city;
	private static String state;
	private static int zip;
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		RegisterBean.name = name;
	}
	public static long getMobile() {
		return mobile;
	}
	public static void setMobile(long mobile) {
		RegisterBean.mobile = mobile;
	}
	public static String getGender() {
		return gender;
	}
	public static void setGender(String gender) {
		RegisterBean.gender = gender;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		RegisterBean.email = email;
	}
	public static String getCity() {
		return city;
	}
	public static void setCity(String city) {
		RegisterBean.city = city;
	}
	public static String getState() {
		return state;
	}
	public static void setState(String state) {
		RegisterBean.state = state;
	}
	public static int getZip() {
		return zip;
	}
	public static void setZip(int zip) {
		RegisterBean.zip = zip;
	}
	
	
}
