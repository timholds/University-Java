/* File: Student.java
 * Author: COMP 150 class
 * Date: November 10 and 15, 2016
 * Description: A class that represents a student
 *   at a school
 */
public class Student
{
    // Static variables
  private static int nextStudentId = 1000000;
  
    // Instance variables
  private String name;
  private int id;
  private double gradepoints;       
  private double usdUnits;
  private double transferUnits;
  private double units = transferUnits + usdUnits;
  private String highGrade; 
    
   /*Constructors
   * This constructor initializes name to the value n,
   * id to the next of nextStudentId,
   * and gradepoints and units to 0. */
  public Student(String n)
  {
    this(n, 0.0);
    this.name = n;
    this.id = nextStudentId++;
    this.gradepoints = 0;
    this.usdUnits = 0;
    this.transferUnits = 0;
    this.highGrade = "";
  }
  
  /*constructor that takes as parameters the name of the 
   * student and the number of units being transferred 
   * in and initializes name and units to these values */ 
  public Student(String n, double units) {
    this.name = n;
    this.units = units;
  }
  
   /*instance method that adds a transferred class to the student record. 
    * The parameter is the number of units of the class, and the return type is void*/
  public void addTransferredClass(double addingClassUnits) {
    this.transferUnits += addingClassUnits;
  }
   
   /* Initializes name to default name,
   * id to the next of nextStudentId,
   * and gradepoints and units to 0.
   */
  public Student() {
    this("John Doe");
  }
  
  //Returns the id of the student.
  public int getId() {
    return this.id;
  }
  
  // Accessorn (getter) method.  Returns the name of the student
  public String getName() {
    return this.name; 
  }
  
  // Mutator (setter) method.  Sets the name of the student
  public void setName(String n) {
    this.name = n;
  }
  
  
  //method with parameter of strings for the grades and return the grade as a double 
  private double getGradeDouble(String grade) {
    if (grade.equals("A"))
      return 4;
    else if (grade.equals("A-"))
      return 3.67;
    else if (grade.equals("B+"))
      return 3.33;
    else if (grade.equals("B"))
      return 3; 
    else if (grade.equals("B-"))
      return 2.67;
    else if (grade.equals("C+"))
      return 2.33;
    else if (grade.equals("C"))
      return 2;
    else if (grade.equals("C-"))
      return 1.67;
    else if (grade.equals("D+"))
      return 1.33; 
    else if (grade.equals("D"))
      return 1;
    else if (grade.equals("D-"))
      return 0.67;
    else {
      return -1;
    }
  }
  
  /*Method to return the highest grade for a given student, 
  returning a string of the grade */
  private String getHighestGrade(String n, String grade) {
    return this.highGrade; 
  }
  
  /*Method to check if a given class's grade is the highest 
  grade for a given student, return a boolean value */
  private boolean highestGrade(String name) {
    if (getGradeDouble(grade) > getGradeDouble(highGrade)) {
      return true;
    }
    else {
      return false; 
    }
  }
  
  /* Adds a class to the student's record, given the
   * units of the class and the grade received in the class. */
  public void addClass(String n, double classUnits, String grade)
  {
    // Update total units taken
    this.usdUnits += classUnits;
    if (highestGrade(grade) == true) {
      this.highGrade = grade;
    }
    
    // Update gradepoints, based on grade in the class.
    if (grade.equals("A"))
      this.gradepoints += 4 * classUnits;
    else if (grade.equals("A-"))
      this.gradepoints += 3.67 * classUnits;
    else if (grade.equals("B+"))
      this.gradepoints += 3.33 * classUnits;
    else if (grade.equals("B"))
      this.gradepoints += 3 * classUnits;
    else if (grade.equals("B-"))
      this.gradepoints += 2.67 * classUnits;
    else if (grade.equals("C+"))
      this.gradepoints += 2.33 * classUnits;
    else if (grade.equals("C"))
      this.gradepoints += 2 * classUnits;
    else if (grade.equals("C-"))
      this.gradepoints += 1.67 * classUnits;
    else if (grade.equals("D+"))
      this.gradepoints += 1.33 * classUnits;
    else if (grade.equals("D"))
      this.gradepoints += classUnits;
    else if (grade.equals("D-"))
      this.gradepoints += 0.67 * classUnits;
  }

    //return the number of units earnned
  public double getUnitsEarned() {
    return this.units; 
  }
   //return the number of units for a grade
  public double getUnitsForGrade() {
    return this.usdUnits; 
  }
    //return the grade number points
  public double getGradePoints() {
    return this.gradepoints; 
  }
  
  /* Returns the gpa of the student.
   */
  public double gpa()
  {
    if (this.usdUnits == 0)
      return 0;
    else
      return this.gradepoints / this.usdUnits;
  }  
  
  /* Returns a string representation of the student.
   */
  public String toString() {
    String str = "Name: " + this.name + " id: " + this.id +
           "Earned units: " + this.units + "Graded units " + this.usdUnits +
           " GPA: " + this.gpa() + " High Grade: " + this.highGrade;
    return str;
  }
}

/*method to check takes one String parameter that is a grade, 
 * and returns a boolean - true if the grade is a valid grade, and false if not */
private static boolean validGrade(String grade) {
  if (grade.toString.equals("A+") 
    return true;
  else if (grade.toString.equals("A"))
    return true;
  else if (grade.toString.equals("A-"))
    return true;
  else if (grade.toString.equals("B+"))
    return true;
  else if (grade.toString.equals("B"))
    return true;
  else if (grade.toString.equals("B-"))
    return true;
  else if (grade.toString.equals("C+"))
    return true;
  else if (grade.toString.equals("C"))
    return true;
  else if (grade.toString.equals("C-"))
    return true;
  else if (grade.toString.equals("D+"))
    return true;
  else if (grade.toString.equals("D"))
    return true;
  else if (grade.toString.equals("D-"))
    return true;                              
  else {
    return false;
  }
}