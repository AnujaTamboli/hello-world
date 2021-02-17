/*
Problem Statement: Implement a java program to check if the given string contains all unique characters 
without using the inbuilt functions and without using any extra data structures.

Algorithm Steps:
    1. Get the string and create an boolean array of 256 characters as there are total of 256 characters.
    2. Iterate the string character by character and get the int value of character.
    3. For the int value as index make true in the boolean array.
    4. If for a next character the value is already true then stop the execution and return false.
    5. Else after the complete string is iterated and no duplicate character is found return true.
*/
//Time Complexity - O(n) As the function contains one for loop which needs Big Oh of "n" time.

class checkUniqueCharInStr {

    //function to check if there are all uniue characters in a string
	//Input: String to check
	//Output: true if all unique characters present in string, else false
    public static boolean areStringCharUnique(String str) { //str is the string that has to be checked
        boolean[] boolCharArr = new boolean[256]; //boolean array of 256 characters 
        for (int strItr = 0; strItr < str.length(); strItr++) { //iterating the "str" string
            int charIntVal = str.charAt(strItr); //getting the integer value of the character
            if (boolCharArr[charIntVal]) { //if the character at int val index in bool array
                return false; //return false if duplicate char found
            }                
            boolCharArr[charIntVal] = true; //set the value at char int value index to true
        }
        return true; //return true if no duplicate char found
    }

    //main method - execution starts here
    public static void main(String[] args) {
        if(areStringCharUnique(" ")) { //calling function to check the string contains all unique characters or not.
            System.out.println("String contains all unique chars");
        } else {
            System.out.println("The string not contain all unique chars");
        }
        //Multiple test cases to check the correct working of the code
        String str = "This is just a trial string";
        System.out.println("Is string " + str + " Unique: " + areStringCharUnique(str));
        System.out.println("Is string Unique: " + areStringCharUnique("this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence.this string contains duplicate characters and also duplicate sentence."));
        System.out.println("Is string Unique: " + areStringCharUnique("dermatoglyphics"));
        System.out.println("Is string Unique: " + areStringCharUnique("this      statement      contains    multiple spacesOr noSpaces               in between      the words."));
        System.out.println("Is string Unique: " + areStringCharUnique("uncopyrightable"));
        System.out.println("Is string Unique: " + areStringCharUnique(" "));
    }
}