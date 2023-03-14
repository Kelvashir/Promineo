//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

import java.util.Arrays;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
int[] randomNumbers = {1,5,2,8,13,6};

		
		// 2. Print out the first element in the array
System.out.println(randomNumbers[0]);
		
		// 3. Print out the last element in the array without using the number 5
System.out.println(randomNumbers[randomNumbers.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
System.out.println("An out of bounds exception is thrown");
		
		// 5. Print out the element in the array at position -1, what happens?
System.out.println("An out of bounds exception is thrown");
			
		// 6. Write a traditional for loop that prints out each element in the array
	for (int i = 0; i < randomNumbers.length; i++) {
		System.out.println(randomNumbers[i]);
	}
			
		// 7. Write an enhanced for loop that prints out each element in the array
for (int number : randomNumbers) {
	System.out.println(number);
}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
int sum = 0;
	
	for (int number : randomNumbers) {
		sum += number++;
	}
		System.out.println(sum);
	

			
		// 9. Create a new variable called average and assign the average value of the array to it
int average = sum/randomNumbers.length;
System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
for (int number : randomNumbers) {
	if(number%2 != 0) {
	System.out.println(number);	
	}
	
}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
String[] randomNames = {"Sam","Sally","Thomas","Rob"};
System.out.println(randomNames[0]);
		
		// 12. Calculate the sum of all the letters in the new array
int sumChars = 0;
for(String names : randomNames) {
	sumChars += names.length();
}
		System.out.println(sumChars);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		printGreeting("Terry");
		//System.out.println(printGreeting("Terry"));
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		printGreeting2("Tami");
		//System.out.println(printGreeting2("Tami"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods. OK
		System.out.println("OK");
		//		b. What do you find?
		System.out.println("They can do the same thing, just in different ways");
		//		c. How are they different?
		System.out.println("One returns no value (void) and the other returns a value of (String)");
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println(letterCounter("Cheese", 5));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		String[] method16Array = {"Taco", "Burrito", "Pizza", "Lemon"};
		System.out.println(isWordInArray(method16Array, "Pizza"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		int[] array17 = {50,498,165,47,23,159};
		System.out.println(findTheSmallestInt(array17));
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] array18 = {1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9};
		System.out.println(findArrayAverage(array18));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		int[] toPrintArray = arrayOfIntsOfStringCharCount(method16Array);
		for(int number : toPrintArray) {
			System.out.println(number);
		}
	
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println(areMoreStringsEvenThenOdd(randomNames));

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
System.out.println(isPalindrome("neveroddoreven"));
		
		
	}
	

	
	// Method 13:
public static void printGreeting(String name) {
	System.out.println("Greetings " + name);
}

	// Method 14:
public static String printGreeting2(String name) {
	return "Salutations " + name;
}
	
	// Method 15:
public static boolean letterCounter(String x, int y) {
	return (x.length() > y);
}
	
	// Method 16:
public static boolean isWordInArray(String[] array, String word) {
	for (String str : array) {
		if(str.equals(word)) {
			return true;
		}
	}
	return false;
}

	// Method 17:
public static int findTheSmallestInt(int[] x) {
	int count = x[0];
	for(int num : x) {
		if(num < count) {
			count = num;
		}
	}
	return count;
}
	
	// Method 18:
public static double findArrayAverage(double[] x) {
	double sum = 0;
	for (double num : x) {
		sum += num;
	}
	return sum / x.length;
}
	
	// Method 19:
public static int[] arrayOfIntsOfStringCharCount(String[] str) {
	int[] intArray = new int[str.length];
	for (int i=0; i < str.length; i++) {
		intArray[i] = str[i].length();
	}
	return intArray;
}
	
	// Method 20:

	public static boolean areMoreStringsEvenThenOdd(String[] array) {
		int sumOfEvens = 0;
		int sumOfOdds = 0;
		
		for (String string : array) {
			if (string.length() % 2 == 0) {
				sumOfEvens += string.length();
			} else {
				sumOfOdds += string.length();
			}
		}
		return sumOfEvens > sumOfOdds;
}
	
	// Method 21:
	public static boolean isPalindrome(String str) {
	for (int i = 0; i < str.length()/2; i++) {
		if (str.charAt(i) != str.charAt(str.length() -i -1)) {
			return false;
		}
	}
	return true;
}		
}