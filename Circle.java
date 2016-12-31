import java.awt.Color;

public class Cirlce extends Shape {
  //instance variables
  private double radius;
  private double centerX;
  private double centerY;
  
  //constructors (here they chose color and field property)
  public Circle(Color c, boolean f, double r, double cx, double cy) {
    super(c, f);
    this.radius = r;
    this.centerx = cx;
    this.centery = cy;
  }
  //make sure super class has shape constructor with no parametrers (default constructor)
  public Circle(double r, double cx, double cy) {
    super();
    this.radius = r;
    this.centerx = cx;
    this.centery = cy;
  }
  
  //setter methods (would normally have for all instance variables)
  /* sets radius to r*/
  public void setRadius(double r) {
    this.radius = r;
  }
  
  //setter method if user can change method
  public double getRadius() {
    return this.radius;
  }
  
  public double getArea() {
    return Math.PI * Math.pow(this.radius, 2)
  }
  
  //returns string representation of calling object
  public String toString() {
    return super.toString() + " R " + this.radius;
      
  
}