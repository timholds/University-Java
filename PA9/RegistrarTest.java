/* File: Registrar.java
 * Author: Henry Quevedo & Tim Holdsworth
 * Date: November 21, 2016
 * Description: A class that tests the Registrar and Student classes.
 */
public class RegistrarTest {
    public static void main(String[] args) {
        Registrar USD = new Registrar(1);
        USD.addStudent("Amy");
        USD.addStudent("Tom", 2);
      
        
        System.out.println(USD.overallGpa() + "is 0.");
        
        USD.addClass("John", 3.0, "A+");
        System.out.println(USD.gpa("John") + " is 4.0.");
        System.out.println(USD.getUnits("John") + " is 36.0.");
        
        USD.addTransferredClass("Amy", 3);
        System.out.println(USD.overallGpa() + " is 4.0");
        
        System.out.println("Should give -1 or null");
        System.out.println(USD.getId("Jack")+ " " + 
                USD.getHighestGrade("Jack") + " " +
                USD.getUnits("Jack") + " " + USD.gpa("Jack") + " " +
                USD.getName(1002525));
        
        System.out.println("High Grade Should Be None: " +
                USD.getHighestGrade("Tom"));
        System.out.println(" ID: " + USD.getId("Amy"));
        System.out.println("Jon should be name: " +
                USD.getName(USD.getId("Tom") + 1));
        
        //test to make sure legit grades count and that we can add new grades
        Student s1 = new Student();
        System.out.println(s1);
        s1.setName("Tom");
        s1.addClass(3.0, "A");
        
        //test to make sure illigitimate grades to ensure they dont count 
        s1.addTransferredClass(2.0);
        s1.addClass(3.0, "G");
        System.out.println(s1);
    }
    
}