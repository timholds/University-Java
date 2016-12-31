import java.awt.Color;
import java.util.Date;

public class Shape {
  //instance variables (private by convention)
  private Color color;
  private boolean filled;
  private Date dateCreated;
  
  //constructors
  public shape (Color c, boolean f) {
    this.color = c;
    this.filled = f;
    this.dateCreated = new Date;
  }
  
  //instance method that returns the color of the calling object
  public Color getColor() {
    return this.color;  
  }
  
  public void setColor(Color c) {
    this.color = c;
  }
  
  public double getArea() {
    return 0.0;
  }
  
  //tostring method 
  public String toString() {
    return this.getClass() + " C: " + this.color.toString() + 
           " F: " + this.filled + 
           " D: " + this.dateCreated.toString();
  }
  
  //create a circle
  Cirlce c1 = new Cirlce(5, 15, 18);
  
  //create an array of shapes
  Shapes [] shapes = new Shapes[10];
  shapes[0] = r;
  shapes[1] = c1;
  //get the area of the rectangle (at runtime rather than compiling, dynamic binding)
  double area = shapes[0].getArea();
  
  for (int i = 0; i < shapes.length; i++) {
    System.out.println("Area of shapes" + i + " is " + shapes[i].getArea());
  }
  
  public String toString() {
    return " C " + this.color.toString() + "F: " + this.filled + 
           " D " + this.dateCreated.toString();
  }
  
  /*this refers to calling object in a method, c
   * alling object and parameter object
   this.fill
   fill property of parameter object a, which we check fill propert with o.filled*/
  pubic boolean equals(Object a) {
    if (!(a instanceOf Shape)) {
      return false;
    }
    else {
      //cast reference to shape so we can use a.filled, since Objects dont have fill property but shapes do
      Shape s = (Shape) a;
      return a.filled == this.filled;
    }
  }
    
  
}