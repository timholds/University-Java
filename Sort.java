import java.util.Scanner;
public class Sort {
  public static void main (String [] args) {
    //create an array of sized based on user input
    Scanner input = new Scanner(System.in);
    int lengthOfArray = input.nextInt();
    int [] unsortedArray = new int[lengthOfArray];
    
    //read in the elements of the array by creating the array and getting elements row by row
    for(int i = 0; i < unsortedArray.length; i++) { 
      unsortedArray[i] = input.nextInt();
    }
      
    //call the bubbleSort method to sort the array
    bubbleSort(unsortedArray);
    String sortedStringArray = toString(unsortedArray).trim();
    System.out.println(sortedStringArray);
  }
    //write a method to convert the sorted array into a string
    public static String toString(int[] ar) {
      String str = ("Sorted Array: [");
      for (int i = 0; i < ar.length; i++) {
        str = str + ar[i]; 
      }
      str = str + "]";
      return str;
    } 
  
  
 //create a method sort the array passed into it, with a void output since it's changing an array
  public static void bubbleSort(int ar[]) {
    int lastIndex = ar.length;
    while (lastIndex > 0) {
      for (int i = 0; i < lastIndex - 1; i++) {
        if (ar[i] >= ar[i+1]) {
          int biggerTemp = ar[i];
          ar[i] = ar[i+1];
          ar[i+1] = biggerTemp;
        }
      }
      lastIndex--;
    }
    
  } 
}