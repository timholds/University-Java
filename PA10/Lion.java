/* File: Torero.java
 * Author: Tim Holdsworth and Henry Quevedo
 * Date: December 8, 2016
 * Description: Class for the Lion Object */

import java.awt.Color; // need this to be able to use Color
public class Lion extends Critter {
  //constructor for lion object
  public Lion() {
     boolean fought = false; //has not fought recently
     boolean eaten = false; //has not eaten recently
     private int count = 0;
     
  }
    
  //instance method with no parameter that tells us a lion will eat if it has been in a fight recently  
  public boolean eat() {
    // test if the lion has been in a fight and eat if he hasn't eaten since then
    if (this.fought == true) {
      //set fight back to false since he hasn't fought more recenly than eaten
      this.fought = false;
      return true;
    }
    else {
      return false;  
    }
     
  //instance method that tells us a lion will roar against a bear, and pounce on anyone else
  public Attack fight(String opponent) {
    if (opponent.toString == "B") 
      return Attack.ROAR;
    else 
      return Attack.POUNCE;
    this.fought = true;
 }
  //instance method to return red as the color for a lion
  public Color getColor() {
    return Color.RED;
  }
  /*instance method that moves the lion south 5 times, then west 5 times
  then north 5 times, then east 5 times */
  public Direction getMove() {
    if (this.count % 4 == 0)
      count++;
      return Direction.SOUTH;
    else if (this.count % 4 == 1)
      count++;
      return Direction.WEST;
    else if  (this.count % 4 == 2)
      count++;
      return Direction.NORTH;
    else if (this.count % 4 == 3)
      count++;
      return Direction.EAST;     
  }

  //method to return L for the Lion Object
  public String toString() {
    return "L";
  }  
}