/* File: Methods.java
 * Author: Tim Holdsworth and Henry Quevedo
 * Date: October 27, 2016
 * Description: Using multiple methods to find instances of a character in a string
 * and merge two sorted strings into one, keeping them in lexicographical order
 */
import java.util.Scanner;
public class Methods 
{
  public static void main (String [] args)
  {
    //Read in a string to search and get a character to search for
    Scanner input = new Scanner(System.in);
    String s = input.next();
    String strang = input.next();
    char ch = strang.charAt(0);
    
    //using the characterCount method, print the result
    int reslt = characterCount(s, ch);
    System.out.println(reslt);
    
    //Get a sorted string from the user
    System.out.println("String1: ");
    String str1 = input.next();
   
    //Check to see if the string is in lexicographical order
    boolean validStr = validString(str1);
    if (validStr == false) {
      System.out.println("String 1: ");
      str1 = input.next();
      validStr = validString(str1);
      
    }
    if (validStr == true) {
      //Get and check another sorted string from user
      System.out.println("String2: ");
      String str2 = input.next();
      validStr2 = validString(str2);
      if (validStr2 == false) {
      System.out.println("String 2: ");
      str2 = input.next(); 
      validStr2 = validString(str2);
      }
    }
    
    
    //using the mergeString method, print the result
    String reslt2 = mergeStrings(str1, str2);
    System.out.println(reslt2);
    }
  
  // Method that returns the number of occurrences of the character c in the String s
public static int characterCount(String s, char c) {
    int occurrences = 0;
    for (int i = 0; i < s.length(); i++)
    {
      if (s.charAt(i) == c)
      {
        occurrences++;
      }
    }
    return occurrences;    
  }

/* Method that takes in two sorted strings and merges them into the new string
 * that is returned, which is also in lexicographical order.*/
  public static String mergeStrings (String str1, String str2)
  {
    //Create a new string that will be the merger of the previous two strings
    String theString = " ";
    //create variables i and j to track the indices of str1 and str2 respectively
    int i = 0;
    int j = 0;
    
    //iterate through the characrers in each string, stopping at the shorter string
    while((i < str1.length()) && (j < str2.length())) {
      //compare the character at a given index of one string to character at given index of other string
      if ((str1.charAt(i) < str2.charAt(j))) {
        theString = theString + str1.charAt(i);
        i++;
      }
      else if ((str1.charAt(i) > str2.charAt(j)))  { 
       theString = theString + str2.charAt(j);
       j++;
      }
      else if((str1.charAt(i)) == (str2.charAt(j))) {
        theString = theString + str1.charAt(i) + str2.charAt(j);
        i++;
        j++;
      }
    }
    if (str1.length() < str2.length()) {
      theString = theString + str2.substring(str1.length(), str2.length());
    }
    if (str2.length() < str1.length()) {
      theString = theString + str1.substring(str2.length(), str1.length());
    }
     
   return theString;                  
  }

  /*Method to check if a given string str is in lexicographical order, 
   * returning a boolean value corresponding to whether or not it is in order */
  public static boolean validString(String str) {
    boolean tracker = false;
    //Empty strings and strings with one item are in order, meaning tracker will be set to true
    if (str.length() == 0) {
      tracker = true;
    }
    //For strings with more than one element, check if the elements are in order and if all elements are in order, set tracker to true
    else {
      int i= 0;
      
      while (i < str.length() - 1) {
        
        if (str.charAt(i) <= str.charAt(i+1)) {
          i++;
            
        }
        else if (str.charAt(i) >= str.charAt(i+1))
          break;
        if (i == str.length() -1 )
        tracker = true;
      }  
    }
    return tracker;
  }  
 }