import java.util.Scanner;

public class DisplayGrade 
{
  public static void main (String [] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter score 1 and percent 1: ");
    double score1 = input.nextDouble();
    double percent1 = input.nextDouble();
    System.out.print("Enter score 1 and percent 1: ");
    double score2 = input.nextDouble();
    double percent2 = input.nextDouble();
    System.out.print("Enter score 1 and percent 1: ");
    double score3 = input.nextDouble();
    double percent3 = input.nextDouble();
    
    if (percent1 + percent2 + percent3 != 100) 
    {
      System.out.println("Percents dont add to 100");
    }
    else //percents do add to 100 and compute the grade
    {
     double weightedAvg = (score1 * percent1 + score2 * percent2 + score3 * percent3) / 100;
     
     if (weightedAvg >= 90) 
       {System.out.println("The grade is A");
     }
     else if (weightedAvg >=80 ) 
       {System.out.println("The grade is B");}
     else if (weightedAvg >=65 ) 
       {System.out.println("The grade is C");}
     else if (weightedAvg >=55 ) 
       {System.out.println("The grade is D");}
     else
       {System.out.println("The grade is B");}
    }
  
                           
  
  }
}