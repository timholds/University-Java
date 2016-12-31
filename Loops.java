/*
 * File: Loops.java
 * Date: 10/12/2016
 * Author: Henry Tran and Tim Holdsworth
 * Description: Program to print out perfect numbers between 0 and an input n, as well as order strings based on lexicographical values
 */
import java.util.Scanner;
public class Loops {
   public static void main(String[] args) {
  
  //Get input from user and declare/initialize import values
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  input.nextLine();
  int divisor = 0;
  int perfectNumber = 0;
  
  //Create a for loop to test each integer between 1 and n for 'perfection'
  for (int i = 1; i <= n; i++) {
   for (int j = 1; j < i; j++) {
    if (i % j == 0) {
     divisor += j;
    }
   }
 
   if (divisor == i) {
    System.out.println(i);
    perfectNumber++;
   }
   //reset the divisor for the next loop
   divisor = 0;
  }
 
   
  //Get input from the user in form of a string   
  String holding = input.nextLine().trim();
  
  //find the space between characters to decide where to split the strings   
     int space = holding.indexOf(" "); 
   
  //Split the input into two strings
     String str1 = holding.substring(0, space).trim();
     String str2 = holding.substring(space + 1 , holding.length()).trim();
     
   //Compare the lexicographic values of each letter in the strings in the different cases
     for (int i = 0; (i < str1.length()) && (i < str2.length()); i++)
     {
       if ((str1.charAt(i)) > (str2.charAt(i)))
       {
         System.out.println("greater"); 
         break;
       }
       
       else if ((str2.charAt(i)) > (str1.charAt(i)))
       {
         System.out.println("less"); 
         break;
       }
       
       else if ((str2.charAt(i)) == (str1.charAt(i)))
       { 
         if ((i == str1.length() - 1) && (i == str2.length() - 1))
         {
           System.out.println("equal");
         }
       
         else if ((i == str1.length() - 1) && (i < str2.length() - 1))
         { 
           System.out.println("less");
         }
         
         else if (i == str1.length() && i > str2.length())
         {
           System.out.println("greater");
         }
       }
     }      
            
   }
}