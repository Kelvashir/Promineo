//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.*;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String? Strings are immutable while StringBuilders are mutable.
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		
		System.out.println("Strings are immutable while StringBuilders are mutable.");
		
		StringBuilder word = new StringBuilder("");
		
		for(int i = 0; i < 10; i++) {
		word.append(i + "-");
		}
		word.deleteCharAt(word.length()-1);
		System.out.println(word.toString());
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List<String> foods = new ArrayList<String>();
		foods.add("beans");
		foods.add("cheese");
		foods.add("lettuce");
		foods.add("jalepeno");
		foods.add("taco");
		System.out.println(foods);
			
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		System.out.println(getShortestString(foods));

		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		System.out.println(switchFirstLast(foods));
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.println(concatElements(foods));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		List<String> months = new ArrayList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		System.out.println(searchList(months, "ber"));
		
		
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(11);
		intList.add(22);
		intList.add(33);
		intList.add(44);
		intList.add(55);
		intList.add(66);
		
		System.out.println(checkList(intList));
		
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.println(stringLength(foods));

		
		// 9. Create a set of strings and add 5 values
		Set<String> sports = new HashSet<String>();
		sports.add("Baseball");
		sports.add("Basketball");
		sports.add("Soccer");
		sports.add("Football");
		sports.add("Wrestling");
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		System.out.println(firstCharMatch(sports, 'B'));

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		System.out.println(setToList(sports));
			

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		
		System.out.println(evenOnly(numbers));

		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String,String> stringDefs = new HashMap<String,String>();
		stringDefs.put("sun", "the star around which the earth orbits");
		stringDefs.put("moon", "the natural satellite of the earth, visible (chiefly at night) by reflected light from the sun");
		stringDefs.put("star", "a fixed luminous point in the night sky which is a large, remote incandescent body like the sun");
		
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println(getDefinition(stringDefs, "sun"));

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		System.out.println(countString(months));
		

	}
	
	
	// Method 15:
	public static Map<Character,Integer> countString(List<String> stringList){
		Map<Character,Integer> charCount = new HashMap<Character,Integer>();
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int[] letterCount = new int[26];
		for(String string : stringList) {
			for (int i = 0; i < alphabet.length; i++) {
				if(string.charAt(0) == alphabet[i]) {
					letterCount[i] += 1;
					charCount.put(alphabet[i], letterCount[i]);
					}
			}
		}
		return charCount;
	}

	
	// Method 14:
	public static String getDefinition(Map<String,String> mapString , String string){
		return mapString.get(string);
	}

	
	// Method 12:
	public static Set<Integer> evenOnly(Set<Integer> integerSet){
		Set<Integer> evenSet = new HashSet<Integer>();
		
		for(int integer : integerSet) {
			if(integer % 2 == 0) {
				evenSet.add(integer);
			}
		}
		return evenSet;
	}
	

	
	// Method 11:
	public static List<String> setToList(Set<String> stringSet){
		List<String> newList = new ArrayList<String>();
		
		for(String string : stringSet) {
			newList.add(string);
		}
		return newList;
	}


	// Method 10:
	public static Set<String> firstCharMatch(Set<String> stringSet, char a){
		Set<String> newSet = new HashSet<String>();
		
			for(String string : stringSet) {
				if(string.charAt(0) == a) {
					newSet.add(string);
				}
			}
		return newSet;
	}
	
	// Method 8:
	public static List<Integer> stringLength(List<String> stringList){
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < stringList.size(); i++) {
			intList.add(stringList.get(i).length());
		}
		return intList;
	}
	
	// Method 7:
	public static List<List<Integer>> checkList(List<Integer> integerList){

		List<Integer> div2List = new ArrayList<Integer>();
		List<Integer> div3List = new ArrayList<Integer>();
		List<Integer> div5List = new ArrayList<Integer>();
		List<Integer> notDiv2_3_5List = new ArrayList<Integer>();
		List<List<Integer>> newList = new ArrayList<List<Integer>>();
		
		for (int i = 0; i < integerList.size(); i++) {
			if(integerList.get(i) % 2 == 0) {
				div2List.add(integerList.get(i));
			} else if (integerList.get(i) % 3 == 0) {
				div3List.add(integerList.get(i));
			} else if(integerList.get(i) % 5 == 0) {
				div5List.add(integerList.get(i));
			} else {
				notDiv2_3_5List.add(integerList.get(i));
			}			
		}
		newList.add(div2List);
		newList.add(div3List);
		newList.add(div5List);
		newList.add(notDiv2_3_5List);
		
		return newList;
	}
	
	// Method 6:
	public static List<String> searchList(List<String> stringList, String str){
		List<String> newList = new ArrayList<String>();
		
		for(int i = 0; i < stringList.size(); i++) {
			if(stringList.get(i).contains(str)) {
				newList.add(stringList.get(i));
			}
		}
		return newList;
	}
	
	// Method 5:
	public static String concatElements(List<String> stringList) {
		
		StringBuilder concatedString = new StringBuilder("");
		
		for(int i = 0; i < stringList.size(); i++) {
		concatedString.append(stringList.get(i) + ",");
		}
		concatedString.deleteCharAt(concatedString.length()-1);
		return concatedString.toString();
}	
	
	// Method 4:
	public static List<String> switchFirstLast(List<String> stringList) {
		String firstElement = stringList.get(0);
		String lastElement = stringList.get(stringList.size()-1);
		
		List<String> changedList = new ArrayList(stringList);
		
		changedList.set(0, lastElement);
		changedList.set(stringList.size()-1, firstElement);

		return changedList;
	}
	
	// Method 3:
	public static String getShortestString(List<String> stringList) {
		int counter = stringList.get(0).length();
		for(int i = 0; i < stringList.size(); i++) {
		if(stringList.get(i).length() < counter) {
			counter = stringList.get(i).length();
			}	
		}
		return stringList.get(counter).toString();
}
}