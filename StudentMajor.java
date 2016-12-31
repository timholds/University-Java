import java.util.Scanner;

public class StudentMajor
{
  public static void main (String [] args) 
  {
    //Get user input
    Scanner input = new Scanner(System.in);
    System.out.println("Enter major and status: ");
    String str = input.nextLine();
    str = str.trim();
    
    //check from correct inputs
    if (str.length() != 2) 
      System.out.println("Bad input");
    else 
    {
      char major = str.charAt(0);
      char status = str.charAt(1);
      
      major = Character.toUpperCase(major);
      if (major != 'M' && major != 'C' && major != 'I')
      {
        System.out.println("Bad input");
      }
      else if (major == 'M') 
        System.out.println("Math");
      else (major == 'C')
        System.out.println("Computer Science");
    }
    
    if (status < '1' || status > 4)
    {
      System.out.println("Bad input");
    }
    else
    { 
      if (status == 1)
      {
        System.out.println("Freshman")
      }
      else if (status == 2)
      {
        System.out.println("Sophomore")
      }
      else if (status == 3)
      {
        System.out.println("Junior")
      }
    }
      
    
  }
}