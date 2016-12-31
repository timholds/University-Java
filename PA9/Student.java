

/* File: Student.java
 * Author: Henry Tran Quevedo & Tim Holdsworth
 * Date: November 21, 2016
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
    private double gradePoints;
    private double usdUnits;
    private double totalUnitsEarned;
    private String highestGrade;
    
    // Constructors
    /* Initializes name to value n,
     * id to the nextStudentId,
     * gradePoints, and institution units to 0,
     * and totalUnitsEarned to value transferred.
     * highestGrade and gradeString are initialized to None.
     */
    public Student(String n, double transferred) {
        this.name = n;
        this.id = nextStudentId++;
        this.gradePoints = 0;
        this.usdUnits = 0;
        this.totalUnitsEarned = transferred;
        this.highestGrade = "";
    }
         
    
    /* Initializes name to the value n,
     * id to the next of nextStudentId,
     * and gradePoints, institutionUnits,
     * and toalUnits to 0.
     * highestGrade and gradeString are initialized to None.
     */
    public Student(String n)
    {
        this(n, 0);
    }
  
    /* Initializes name to default name,
     * id to the next of nextStudentId,
     * and gradePoints, institutionUnits,
     * and totalUnitsEarned to 0.
     * highestGrade and gradeString are initialized to None.
     */
    public Student()
    {
        this("Jane Doe");
    }
  
    /* Returns the id of the student.
     */
    public int getId()
    {
        return this.id;
    }
  
    /* Accessorn (getter) method.  Returns the name of the student
     */
    public String getName()
    {
        return this.name; 
    }
  
    /* Mutator (setter) method.  Sets the name of the student
    */
    public void setName(String n)
    {
        this.name = n;
    }
  
    /* Adds a class to the student, given the
     * units of the class and the grade received in the 
     * class.
     */
   public void addClass(double classUnits, String grade)
  {
    // Update total units taken
    this.usdUnits += classUnits;
    this.totalUnitsEarned += classUnits;
    
    if (grade.compareTo(highestGrade) > 0){
     highestGrade = grade;
    }
   }
  
    /* Returns the gpa of the student.
     */
    public double gpa()
    {
        if (this.usdUnits == 0)
          return 0;
        else
            return this.gradePoints / this.usdUnits;
    } 
    
    /*  Adds value units to totalUnitsEarned
     */
    public void addTransferredClass(double units) {
        this.totalUnitsEarned += units;
    }
    
    /* Returns number of units student has earned
     * Note: This does not include classes in which a student received an F.
     */
    public double getUnitsEarned() {
        return this.totalUnitsEarned;
    }
    
    /* Returns number of units student took for a grade at institution.
     */
    public double getUnitsForGrade() {
        return this.usdUnits;
    }
    
    /* Returns the number of gradePoints the student has earned.
     */
    public double getGradePoints() {
        return this.gradePoints;
    }
    
    /* Returns the highest grade earned as a String.
     */
    public String getHighestGrade() {
        return this.highestGrade.toString();
        
    }
  
    /* Returns a string representation of the student.
     */
    public String toString() {
        String g;
/*        if(this.gpa() == 0) {
            g = String.format("%.0f", this.gpa());
        }
        else*/ {
            g = String.format((this.gpa() == 0.0) ? "%.0f" : "%1.1f", this.gpa());
        }
        String str = this.name + " id: " + this.id +
                " Earned units: " +
                String.format("%.0f", this.totalUnitsEarned) +
                " Graded units: " + 
                String.format("%.0f", this.usdUnits) +
                " GPA: " + g +
                " High Grade: " + this.highestGrade;
        return str;
    }
    
    
    
    
}