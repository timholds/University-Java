public class Registrar {
  
    // Instance variables
    private Student [] students;
    private int numStudents;    
    
    // Constructor
    /* Initializes students array to have
     * maxStudents elements, and numStudents to 0.
     */
    public Registrar(int maxStudents) {
        this.students = new Student[maxStudents];
        this.numStudents = 0;
    }
  
    /* Adds student with name to Registrar
     */
    public void addStudent(String name) {
        this.addStudent(name, 0);
        
    }
    
    /* Adds student with name and transferred units to Registrar.
     */
    public void addStudent(String name, double units) {
        Student student = new Student(name, units);
        if(numStudents == students.length) {
            this.resize();
        }
        students[numStudents] = student;
        numStudents++;
    }
  
    /* Add a class to a student with the specified name.  The units
     * and grade of the class are also specified.  Returns true if the
     * student is in the students array, and false if not.
     */
    public boolean addClass(String name, double units, String grade) {
   
// changes grade to uppercase
   grade = grade.toUpperCase();  
   
   if (!(validGrade(grade))){
    return false; 
   }
   else {
     return true;
   }
    }
    /* Add a transferred class to a student with the specified name.  The units
     * of the class are also specified.  Returns true if the
     * student is in the students array, and false if not.
     */
    public boolean addTransferredClass(String studentName, double units) {
        // Look for the student in the students array.
        Student s = this.findStudent(studentName);
        
        // If not in the students array, return false.
        if(s == null) {
            return false;
        }
        else {
            // add transferred class to that student and return true.
            s.addTransferredClass(units);
            return true;
        }
    }
    
    /* Returns the gpa of a student with a specified name. If that
     * student does not exist, -1 is returned.
     */
    public double gpa(String studentName) {
        // Look for the student in the students array.
        Student s = this.findStudent(studentName);
        
        // If not in the students array, return -1.
        if(s == null) {
            return -1;
        }
        else {
            // return that students gpa.
            return s.gpa();
        }
    }
    
    /* Returns the institutionUnits of a student with a specified name. 
     * If that student does not exist, -1 is returned.
     */
    public double getUnits(String studentName) {
        // Look for the student in the students array.
        Student s = this.findStudent(studentName);
        
        // If not in the students array, return -1.
        if(s == null) {
            return -1;
        }
        else {
            // return that students gpa.
            return s.getUnitsEarned();
        }
    }
    
    /* Returns the highestGrade of a student with a specified name. 
     * If that student does not exist, null is returned.
     */
    public String getHighestGrade(String studentName) {
        // Look for the student in the students array.
        Student s = this.findStudent(studentName);
        
        // If not in the students array, return -1.
        if(s == null) {
            return null;
        }
        else {
            // return that students gpa.
            return s.getHighestGrade();
        }
    }
    
    /* Returns the id of a student with a specified name. 
     * If that student does not exist, -1 is returned.
     */
    public int getId(String studentName) {
        // Look for the student in the students array.
        Student s = this.findStudent(studentName);
        
        // If not in the students array, return -1.
        if(s == null) {
            return -1;
        }
        else {
            // return that students id.
            return s.getId();
        }
    }
    
    /* Returns the name of a student with a specified id.
     * If that student does not exist, returns null.
     */
    public String getName(int studentId) {
        // Look for the student int the students array.
        Student s = this.findStudent(studentId);
        
        // If not in the students array, return null.
        if(s == null) {
            return null;
        }
        else {
            // return that students name.
            return s.getName();
        }
    }
    
    /* Calculates and returns the overall GPA of all students in Registrar
     * object. This is done by summing all the gradePoints of all students
     * and dividing this by sum of all students units taken for a grade. If
     * no students have taken a class for a grade, returns 0.
     */
    public double overallGpa() {
        // Summ up all students gradePoints and Units for Grade
        double totalGradePoints = 0;
        double totalUnitsForGrade = 0;
        for(int i = 0; i < numStudents; i++) {
            totalGradePoints += students[i].getGradePoints();
            totalUnitsForGrade += students[i].getUnitsForGrade();
        }
        
        if(totalUnitsForGrade == 0) {
            return 0;
        }
        else {
            return totalGradePoints / totalUnitsForGrade;
        }
    }
    
    /* Private helper method to find the student with a specified name.
     * If a student with the name name is in the students array, return 
     * a reference to the student.  If not, return null. 
     */
    private Student findStudent(String name) {
        // Search the array for the student.
        for(int i = 0; i < this.numStudents; i++) {
            if(this.students[i].getName().equals(name)) {
                return this.students[i];
            }
        }
        
        // Not in the array of students.
        return null;
    }
    
    /* Private helper method to find the student with a specified id.
     * If a student with the id studentId is in the students array, return 
     * a reference to the student.  If not, return null. 
     */
    private Student findStudent(int studentId) {
        // Search the array for the student.
        for(int i = 0; i < this.numStudents; i++) {
            if(this.students[i].getId() == studentId) {
                return this.students[i];
            }
        }
        
        // Not in the array of students.
        return null;
    }
    
    /* Private method resizes the students array to twice its current size.
     */
    private void resize() {
        Student[] temp = new Student[students.length * 2];
        System.arraycopy(students, 0, temp, 0, students.length);
        students = temp;
    }
    
    /* private helper method returns true if grade is valid and false if not.
     */
    private static boolean validGrade(String grade) {
  if (grade.equals("A+")) 
    return true;
  else if (grade.equals("A"))
    return true;
  else if (grade.equals("A-"))
    return true;
  else if (grade.equals("B+"))
    return true;
  else if (grade.equals("B"))
    return true;
  else if (grade.equals("B-"))
    return true;
  else if (grade.equals("C+"))
    return true;
  else if (grade.equals("C"))
    return true;
  else if (grade.equals("C-"))
    return true;
  else if (grade.equals("D+"))
    return true;
  else if (grade.equals("D"))
    return true;
  else if (grade.equals("D-"))
    return true;                              
  else {
    return false;
  }
}
}