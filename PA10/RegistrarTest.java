import java.awt.Color; // need this to be able to use Color
public class Bear extends Critter {
  
  //Constructor for the bear object using the boolean parameter grizzly
  public Bear(boolean grizzly) {
     
  }
    
  //a bear is always hungry, and thus we return true for the eat instance method  
  public boolean eat() {
    return true;
  }
  //a bear always goes for scratch in a fight
  public Attack fight(String opponent) {
    return Attack.SCRATCH;
 }

  public Color getColor() {
    if (grizzly == true) {
      return new Color(190,110,50); 
    }
    else if (grizzly == false) { 
      //return white as the color for a polar bear
      return Color.WHITE;
    }
  }
  //instance method that moves the bear north and west in alternating fashion
  public Direction getMove() {
    /*how can we alternate north and west? I think we would have to do north
    if last move was west, and west if last move was north. Can we tell what our 
    last move was? */
    return Direction.WEST;
  }

  public String toString() {
    return "B";
  }
  
}
