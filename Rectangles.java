import java.util.Scanner;

public class Rectangles
{
  public static void main (String [] args) 
  { 
    //Get user input
    Scanner input = new Scanner(System.in);
    int x1 = input.nextInt();
    int y1 = input.nextInt();
    
    int x2 = input.nextInt();
    int y2 = input.nextInt();
    
    int x3 = input.nextInt();
    int y3 = input.nextInt();
    
    int x4 = input.nextInt();
    int y4 = input.nextInt();
    
    //Determine which points are the upper left and lower right
    int x1UpperLeft = Math.min(x1, x2); 
    int y1UpperLeft = Math.min(y1, y2); 
    int x1LowerRight = Math.max(x1, x2);
    int y1LowerRight = Math.max(y1, y2);
    
    int x2UpperLeft = Math.min(x3, x4); 
    int y2UpperLeft = Math.min(y3, y4);
    int x2LowerRight = Math.max(x3, x4); 
    int y2LowerRight = Math.max(y3, y4); 

    //Determine the upper left and lower right points of the rectangle that results from overlap
    int overLapUpperLeftX = Math.max(x1UpperLeft, x2UpperLeft);
    int overLapUpperLeftY = Math.max(y1UpperLeft, y2UpperLeft);
    int overLapLowerRightX = Math.min(x1LowerRight, x2LowerRight);                                 
    int overLapLowerRightY = Math.min(y1LowerRight, y2LowerRight);
    
    //find the x and y distance of the overlap rectangle 
    int deltaX = (overLapLowerRightX - overLapUpperLeftX);
    int deltaY = (overLapLowerRightY - overLapUpperLeftY);
    
    //find the area if there is an overlap
    int area = deltaX * deltaY;
    
    //determine the relationship between the two squares
    
    if (((x1LowerRight < x2LowerRight) && (x1UpperLeft > x2UpperLeft)) 
      && ((y1LowerRight < y2LowerRight) && (y1UpperLeft > y2UpperLeft)))
    {
      System.out.println("1 is inside 2");
    }
    else if (((x2LowerRight < x1LowerRight) && (x2UpperLeft > x1UpperLeft))
      && ((y2LowerRight < y1LowerRight) && (y2UpperLeft > y1UpperLeft)))
    {
     System.out.println("2 is inside 1"); 
    }
    else if (((x1LowerRight <= x2UpperLeft) || (x2LowerRight <= x1UpperLeft)) 
               || ((y1LowerRight <= y2UpperLeft)|| (y1UpperLeft >= y2LowerRight)))
    {
      System.out.println("disjoint");
    }
    else 
      System.out.println("overlap: area = " + area);
  }
}

