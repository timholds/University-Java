/* File: Torero.java
 * Author: Tim Holdsworth and Henry Quevedo
 * Date: December 8, 2016
 * Description: Class for the Bear Object */

mport java.awt.Color; // need this to be able to use Color

public class Bear extends Critter {
 private boolean isNorth = true;
 private boolean isGrizz;
 
 //Constructor for the bear object using the boolean parameter grizzly
 public Bear(boolean grizzly) {
  this.isGrizz = grizzly;
 }
 
 // A bear is always hungry, and thus we return true for the eat instance method 
 public boolean eat() {
  return true;
 }
 
 // A bear always goes for scratch in a fight
 public Attack fight(String opponent) {
  return Attack.SCRATCH;
 }
 
//return a brownish color if the parameter grizzly bear is true, white if it is false
 public Color getColor() {
  if (this.isGrizz) {
   return new Color(190,110,50);
  } else {
   return Color.WHITE;
  }
 }
 
 // instance method that moves the bear north and west in zigzag pattern
 public Direction getMove() {
  if (this.isNorth) {
   this.isNorth = !this.isNorth;
   return Direction.NORTH;
  } else {
   this.isNorth = !this.isNorth;
   return Direction.WEST;
  }
 }

 // toString method that returns "B"
 public String toString() {
  return "B";
 }
}