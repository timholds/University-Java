/* Name: Arrays.java
 * Date: 11/3/2016
 * Authors: Tim Holdsworth and Henry Quevedo
 * Description: scale an array and keep track of an array of locker being opened and closed
 * 
 * */

import java.util.Scanner;
public class Arrays {
  public static void main (String [] args) {
    //do the array program, taking in the length of the array, the array values, and the scaling factor
    Scanner input = new Scanner(System.in);
    int lengthOfArray = input.nextInt();
    int [] arr1 = new int[lengthOfArray];
    int n = input.nextInt();
    
    //use the copyIntArray method, passing in the array and scaling factor and printing out the new array
    int [] arrayCity = copyIntArray(arr1, n);
    displayIntArray(arrayCity);
    
    //do the lockers program, taking in the number of students
    int students = input.nextInt();
    
    //create an array to keep track of the status of the lockers for all students
    boolean[] lockers=new boolean[students]; 
   
    //iterate over the number of lockers that a given student may or may not change
    for (int givenLocker = 1; givenLocker <= students; givenLocker++) {
      //iterate over the number of students who may or may not change a locker 
      int studentNumber = givenLocker - 1;
      while (studentNumber < students) {
          lockers[studentNumber] = !lockers[studentNumber];
          studentNumber += givenLocker;
        }  
      }
    
 //Print out the state of each locker, one per line
  for (int i = 0; i < students; i++) {
    if (lockers[i] == false) {
     String lockerState = new String("closed");
    }
    else if (lockers[i] == true) {
     String lockerState = new String("open"); 
    }
  System.out.println("Door" + (i+1) + "is " + lockerState);
  System.out.println();
  }
 }
 
  //create a copy of the int array by taking in an array and the scaling factor and outputting another integer array
  public static int[] copyIntArray (int [] ar, int n) {
    int [] newArray = new int[n * ar.length ];
    int i = 0;
    while (i <= ar.length) {
      int j = 0;
      while (j <= newArray.length) {
        newArray[j] = ar[i];
        if (n % (j + 1) == 0) { 
          i++;
        }
        j++;
      }   
    }
    return newArray;
    }

  //print out the copied array by inputting the copied array
  public static void displayIntArray(int [] ar) {
    System.out.println(ar);
  }
}
                                   