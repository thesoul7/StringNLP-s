package com.stringclassmethods.web;

import java.awt.Toolkit;
import java.util.Scanner;

public class Changes {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
		//System.out.println(toLowerCase(input));
		//System.out.println(charAt(input, 0));
		//System.out.println(replaceFirst("R","S"));
		//System.out.println(endsWith("Raghu", "r"));
		//System.out.println(indexOf("raghuprasad", "ra", 1));
		System.out.println("Raghu".equalsIgnoreCase("Raghu"));
		//String str =  "1200/6457/56899";
//		String[] arr=str.split(" ");
		//str.replaceAll("'", "");
		//System.out.println(str.substring(10, 15));
		//System.out.println(extractSingleDataFromString(str, " "));
		//"There are ' 2500 ' items matched ";//
		//extractSingleDataFromString(str, " ", 5);
	}
//	
	
	// String modification methods
	
 public String toLowerCase(String data) {
	 return	data.toLowerCase(); 
	 
	}
 public String toUpperCase(String data) {
	 return	data.toUpperCase();
	}
 
 public Character charAt(String data , Integer index) { //data // integer
	
	return data.charAt(index);
 }
 public Integer indexOf(String data,String input ) {//
	return data.indexOf(input);
 }
 public  String concatStrings(String data, String to_Be_Concatinated) { //in place of underscore space will come
	return data.concat(to_Be_Concatinated);
 }
 public  String replaceFirst(String data, String replace, String with) {
	
	return data.replaceFirst(replace, with);
 }
 
// public  String replace(String data, Character oldValue, Character newValue) {
//	return data.replace(oldValue, newValue);
// }
 
 public  String replaceAll(String data, String replace, String with) {
	return  data.replaceAll(replace, with);
 }
 
 public  String trim(String data) {
	 return data.trim();
 }
 public  String[] split(String data, String splitLetter, Integer number) { //we cannot able to see string [] value in the return value
	return data.split(splitLetter); // string[] to single string
 } 
 // There are "2500" items matched
 public static String extractSingleDataFromString(String data, String splitLetter, Integer wordNumber) {
	 String[] arr=data.split(splitLetter);
	 return arr[wordNumber-1];
 }
 
 
 public  Integer lengthOfString(String data) {
	 return data.length();
 }
 
 public  String subString(String data,Integer startIndex, Integer endIndex) { //Discuss should give index or number as argument
	 return data.substring(startIndex, endIndex);
 }
 
 //String Verification Methods
 
 public  Boolean equals(String actualData, String expectedData) {
	 return  actualData.equals(expectedData);
	
 }
 public  Boolean equalsIgnoreCase(String actualData, String expectedData) {
	 return  actualData.equalsIgnoreCase(expectedData);
	
 }
 public  Boolean contains(String actualData, String expectedData) {
	 return  actualData.contains(expectedData);
	
 }
 public  Boolean endsWith(String actualData, String expectedData) {
	 return  actualData.endsWith(expectedData);
	
 }
 public  Boolean startsWith(String actualData, String expectedData) {
	 return  actualData.startsWith(expectedData);
	
 }

 //to be discussed with harshith regarding try catch n if check failed
 }


