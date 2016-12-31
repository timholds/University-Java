/* File: Torero.java
 * Author: Tim Holdsworth and Henry Quevedo
 * Date: December 8, 2016
 * Description: Class for the Lion Object */

import java.awt.Color; // Need this to be able to use color
import java.util.Random; // Used to generate a random numbers

public class Tiger extends Critter {
 
 // Instance Variables used throught this class
 private int eats;
 private int moves = 0;
 private Random r;
 private int rand; 
 
 // Constructor for this class using hunger as a parameter
 public Tiger(int hunger) {
  this.eats = hunger;
  this.r = new Random(); 
  this.rand = this.r.nextInt(4);
 }
 
 // instance method that returns true the first hunger times it is called, and false after that
 public boolean eat() {
  if (this.eats > 0) {
   this.eats = this.eats - 1;
   return true;
  } else {
   return false;
  }
 }

  /* instance method with string parameter of opponent
 that Checks if this Tiger is hungry, then scratch or pounce accordingly*/
  public Attack fight(String opponent) {
  if (this.eats > 0) {
   return Attack.SCRATCH;
  } else {
   return Attack.POUNCE;
  }
 }
 
  /*instance method with no parameters Moves 3 steps in a random direction (north, south, east, or west), then 
chooses a new random direction and repeats */
 public Direction getMove() {
  if (this.moves < 3) {
   this.moves++;
   if (this.rand == 0) {
    return Direction.WEST;
   } else if (this.rand == 1) {
    return Direction.NORTH;
   } else if (this.rand == 2) {
    return Direction.EAST;
   } else {
    return Direction.SOUTH;
   }
  } else {
   this.moves = 0;
   this.rand = this.r.nextInt(4);
   if (this.rand == 0) {
    return Direction.WEST;
   } else if (this.rand == 1) {
    return Direction.NORTH;
   } else if (this.rand == 2) {
    return Direction.EAST;
   } else {
    return Direction.SOUTH;
   }
  }
 }

 // Getter method with no explicit parameter to Return the color yellow for tiger
 public Color getColor() {
  return Color.YELLOW;
 }

 /* Instance Method with no explicit parameter to return the 
 number of pieces of food this Tiger still wants to eat, as a String (i.e. "4") */
 public String toString() {
  return Integer.toString(eats);
 }
}