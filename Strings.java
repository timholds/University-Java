/* Name: Strings
 * Author: Henry Quevedo and Tim Holdsworth
 * Date: 10/6/2016
 * Description: Creating an ISBN number, Putting things in lexiographic order 
 * */

 String firstLexiWord = firstWord;
 String secondLexiWord = secondWord;
 String thirdLexiWord = thirdWord;
      if (firstWord.compareTo(secondWord) < 0 && firstWord.compareTo(thirdWord) < 0)
      {
        if (secondWord.compareTo(thirdWord) < 0)
          continue;
        else 
        {
          secondLexiWord = thirdWord;
          thirdLexiWord = secondWord;
        }
      }
      else if (firstWord.compareTo(secondWord) < 0) && (firstWord.compareTo(thirdWord) > 0)
      {
        firstLexiWord = thirdWord;
        secondLexiWord = firstWord;
        thirdLexiWord = secondWord;
      }
      else if ((firstWord.compareTo(secondWord) > 0 && (firstWord.compareTo(thirdWord) < 0))
      {
         firstLexiWord = secondWord;
         secondLexiWord = firstWord;
         thirdLexiWord = thirdWord;
       }
      }
       else if (secondWord.compareTo(thirdWord) < 0) && (thirdWord.compareTo(firstWord) > 0) 
       {
         firstLexiWord = secondWord;
         secondLexiWord = thirdWord;
         thirdLexiWord = firstWord;
       }
       else 
       {
         firstLexiWord = thirdWord;
         secondLexiWord = secondWord;
         thirdLexiWord = firstWord; 
       }
       
       
       
       
       
       
       
       if (firstWord.compareTo(thirdWord) < 0)
        {
          String secondLexiWord = secondWord;
          
          if (secondWord.compareTo(thirdWord) < 0)
          {
           String thirdLexiWord = thirdWord;
           
           else {
             secondLexiWord = thirdWord;}
           
          }
          else 
          {
            secondLexi
          }
        }
      }
      System.out.println(result);
      
      result = str2.compareTo( str3 );
      System.out.println(result);


import java.util.Scanner;
public class Strings {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String s = input.nextLine();
    char ch = s.charAt(0);
    System.out.println("The character entered is " + ch);
  }
}

public class Strings
{
     public static void main(String args[])
     {
          java.util.Scanner input = new java.util.Scanner(System.in); 
          //Scanner input= new Scanner(System.in); //for reading 9 digits of ISBN number
          String partialISBN = input.nextLine(); //initial ISBN number with 9 digits
          //int []digits=new int[partialISBN.length()]; // all digits of ISBN
          int d10=0; //tenth digit
          int multiply=1; // to multiple each digit with its corresponding postion

          //read ISBN
          partialISBN = input.next(); 
          String fullISBN = " "; //full ISBN with 10 digits

          //process the string
          for(int i=0;i<=10;i++)
          {
              // the character at 1st and 5th position are not digits(but '-')
              if(i!=1 && i!=5)
              {
                   d10=d10+((Character.getNumericValue(charAt(i)))*multiply);
                   //after multiplying each digit, again append them to another string
                   fullISBN=fullISBN+Character.getNumericValue(charAt(i));
                   multiply++;
              }
              else
              {
                   //if the character is not a digit, just append the symbol '-'
                   fullISBN=fullISBN+"-";
              }
          }
          //calculate the 10th digit
          int tempStore = d10%11;          
          //check whether the 10th digit is 10
          if(tempStore == 10)
          {
              fullISBN=fullISBN+"-";
              //if 10th digit is 10, replace it with X
              fullISBN=fullISBN+"X";
          }
          else
          {
              fullISBN=fullISBN+"-";
              //if 10th digit is not 10, append the number as it is
              fullISBN=fullISBN+Character.getNumericValue(charAt(10));

          }

          System.out.println(fullISBN);

     }

}
*/

  digit = Character.getNumericValue(charAt(10));
  
/* import java.util.Scanner;
public class Strings
{
  public static void main (String [] args) 
  {
     //Create a scanner to get input from the user
    Scanner input = new Scanner(System.in);
    String firstNine = input.next();
    String fullISBN = "";
    firstNine = input.next();
    fullISBN = "";
    int d10 = 0;
    int multiply = 1;

    
    //Create a variable to store sum of ISBN checksum as we iterate
    int iSBNSum = 0;
    
    //iterate to get the first nine digits from the given ISBN 
    for (int i = 0; i < 11; i++)
    {
     if (i != 1 && i!= 5);
     {
      int j = 0;
      char c = firstNine.charAt(i);
      Character.getNumericValue(c);
      iSBNSum = iSBNSum + j*c;
      j++;
       
      }
    }
  }
}
  */    
    

  