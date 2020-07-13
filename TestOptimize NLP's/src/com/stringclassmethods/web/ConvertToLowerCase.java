package com.stringclassmethods.web;

import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertToLowerCase {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
		//System.out.println(toLowerCase(input));
		//System.out.println(charAt(input, 0));
		//System.out.println(replaceFirst("R","S"));
		//System.out.println(endsWith("Raghu", "r"));
		//System.out.println(indexOf("raghuprasad", "ra", 1));
//		int[] ar = {10,20,30,40};
//		String str = Arrays.toString(ar);
////		System.out.println(str);
//		String[] testArray = { "Hai", "This", "is", "Ashok" };
//		String str = Arrays. toString(testArray);
//		str = str. substring(1, 4);
//		System. out. println(str);
		
	}
	// String modification methods
	
 public static String toLowerCase(String data) {
	 return	data.toLowerCase();
	}
 public static String toUpperCase(String upperCase) {
	 return	upperCase.toUpperCase();
	}
 
 public static char charAt(String input , int i) {
	return input.charAt(i);
 }
 public static int indexOf(String input,String name, int indexValue ) {
	return input.indexOf(name, indexValue);
 }
 public static String concatString(String input, String toBeConcatinated) {
	return input.concat(toBeConcatinated);
 }
 public static String replaceFirst(String getText, String latterToBeReplaced, String replaceFirst) {
	
	return getText.replaceFirst(latterToBeReplaced, replaceFirst);
 }
 
 public static String replace(String input, char oldValue, char newValue) {
	return input.replace(oldValue, newValue);
 }
 
 public static String replaceAll(String input, String oldValue, String newValue) {
	return  input.replaceAll(oldValue, newValue);
 }
 
 public static String trim(String input) {
	 return input.trim();
 }
 public static String[] split(String input, String split) {
	return input.split(split);
 }
 
 public static int lengthOfString(String input) {
	 return input.length();
 }
 
 public static String subString(String input,int startIndex, int endIndex) {
	 return input.substring(startIndex, endIndex);
 }
 
 //String Verification Methods
 
 public static boolean equals(String expected, String actual) {
	 if (expected.equals(actual)) {
		return true;
	}
	 else {
		return false;
	 }
 }
 public static boolean equalIgnoreCase(String expected, String actual) {
	 if (expected.equalsIgnoreCase(actual)) {
		return true;
	}
	 else {
		return false;
	 }
 }
 public static boolean contains(String expected, String actual) {
	 if (expected.contains(actual)) {
		return true;
	}
	 else {
		return false;
		
	 }
 }
 public static boolean endsWith(String expected, String actual) {
	 if (expected.endsWith(actual)) {
		return true;
	}
	 else {
		return false;
		
	 }
 }
 public static boolean startsWith(String expected, String actual) {
	 if (expected.startsWith(actual)) {
		return true;
	}
	 else {
		return false;
		
	 }
 }
 	
 
 }


