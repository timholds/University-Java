/* File: Torero.java
 * Author: Tim Holdsworth and Henry Quevedo
 * Date: December 8, 2016
 * Description: Class for the Torero Object */

import java.awt.Color; // need this to be able to use Color
public class Torero extends Critter {
  //instance variables
  private int moves;
  private Random r;
  private int rand; 
  private boolean eaten;
  //Constructor for the Torero object with no parameter
  public Torero() {
      this.r = new Random(); 
      this.rand = this.r.nextInt(4);
  }
    
  /*instance method that returns a boolean for if the Torero will eat or not 
   *depending how safe it is to eat - eat only if there are no surrounding critters*/
  public boolean eat() {
    //check if surrounding spaces are empty
    if (getNeighbor(Direction.WEST).equals("") && 
        getNeighbor(Direction.NORTH).equals("") &&
        getNeighbor(Direction.EAST).equals("") &&
        getNeighbor(Direction.SOUTH).equals("")) {
      this.eaten = true;
      return true;
    }
    else { //there is a critter in an adjacent square
      return false;
    }
  }
  /*instance method with parameter opponent that 
  returns a variable of type Attack depending on who the opponent is */
  public Attack fight(String opponent) {
    //a bear always goes for scratch in a fight, so we always go for roar
    if (opponent.toString == "B")
      return Attack.ROAR;
    //if opponent is a lion, we use a pounce attack to maximize our probability of winning
    else if (opponent.toString == "L") 
      return Attack.POUNCE;
    //if opponent is a tiger, we greet with a scratch attack to maximize our probability of winning
    else 
      return Attack.SCRATCH;
      
 }
  //method to return the color blue for the torero
  public Color getColor() {
    return Color.BLUE;
  }
  /*instance method with no explicit parameter that moves the Torero by returning
  type direction. Moves torero into squares with other critters to engage in fights */
  public Direction getMove() {
    //if the torero has eaten recently, move in a new, random direction
    if (getNeighbor(Direction.WEST).equals("T") || 
        getNeighbor(Direction.WEST).equals("L") ||
        getNeighbor(Direction.WEST).equals("B"))
      return Direction.WEST;
    else if (getNeighbor(Direction.NORTH).equals("T") || 
        getNeighbor(Direction.NORTH).equals("L") ||
        getNeighbor(Direction.NORTH).equals("B"))
      return Direction.NORTH;
    else if (getNeighbor(Direction.SOUTH).equals("T") || 
        getNeighbor(Direction.SOUTH).equals("L") ||
        getNeighbor(Direction.SOUTH).equals("B"))
      return Direction.SOUTH;
    else if (getNeighbor(Direction.EAST).equals("T") || 
        getNeighbor(Direction.EAST).equals("L") ||
        getNeighbor(Direction.EAST).equals("B"))
      return Direction.EAST;
    else { //there are no neighbors and we pick a direction to walk randomly
      this.rand = this.r.nextInt(4);
      if (this.rand == 0) {
        return Direction.WEST;
      } 
      else if (this.rand == 1) {
        return Direction.NORTH;
      } 
      else if (this.rand == 2) {
        return Direction.EAST;
      }
      else {
        return Direction.SOUTH;
      }
    }
  }
  /*instance method with no explicit parameters that returns a string representation
   * of the torero depending on who the opponent is  */
  public String toString() {
    //If our opponent is a Lion, we maximixe our chance of winning by posing as a Tiger
    if (opponent.toString == "L")
      return "T";
    //If our opponent is a tiger, we maximixe our chance of winning by posing as a lion
    else if (opponent.toString == "T") 
      return "L";
    else { //our opponent is a bear and thus our type will not affect fight strategy
      return "Tor";
    }
  } 
}
