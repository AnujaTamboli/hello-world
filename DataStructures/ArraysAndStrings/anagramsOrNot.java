/*
Problem Statement - Write a method to find if two strings are anagrams or not.

Algorithm: 
1. Accept two strings.
2. Check the length of both arrays, if lenght is less than 0 or both strings have different lengths then return false.
3. Else Convert both the strings into character array.
4. Sort both of the character arrays in ascending order
5. Match every element of both the arrays if they have same characters then return true.
*/ 

/*The Time Complexity of this code is: O(n*(1+logn)) as:
The program contains one for loop whoes time complexity is O(n)
and we use sort method 2 times whoes time complexity is O(n*logn);
*/

import java.util.Arrays;

class anagramsOrNot {
	
	//function to check if the strings are anagrams or not
	//Input: First and Second String
	//Output: true if anagrams, else false
    public static boolean areAnagrams(String str1, String str2) {
        if (((str1.length() < 1) || (str2.length() < 1)) || (str1.length() != str2.length())) {
            return false; //if the strings are null(i.e. length is less than 1) or length of the two strings does not match then return false
        } else {
            char[] str1CharArr = str1.toCharArray(); //converting the first string into character array
            char[] str2CharArr = str2.toCharArray(); //converting the second string into character array

            Arrays.sort(str1CharArr); //sorting the first character array 
            Arrays.sort(str2CharArr); //sorting the second character array

			//for loop to iterate over the arrays to check for common elements
            for (int itr = 0; itr < str1CharArr.length; itr++) {
                if (!(str1CharArr[itr] == (str2CharArr[itr]))) {
                    return false; //if any of the element does not match then return false
                }
            }         
        }
        return true; //if all the elements match then return true
    }

	//main method - start of execution
    public static void main(String[] args) {
        if (areAnagrams("hello","lohel")) { //calling the "areAnagrams" function for checking strings are anagrams or not
            System.out.println("Strings Are anagrams!"); //Printing output if strings are anagrams
        } else {
            System.out.println("are not anagrams!"); //printing output if strings are not anagrams
        }
        //Test cases for checking code quality
        System.out.println(areAnagrams("","hello"));
        System.out.println(areAnagrams("hello",""));
        System.out.println(areAnagrams("",""));
		//strings or more input size to check the code quality to handle large inputs
        System.out.println(areAnagrams("hellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdg","hellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdg"));
        System.out.println(areAnagrams("hellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdg","hellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdghellojhgjlhgnmngljhdgaa");
    }
}