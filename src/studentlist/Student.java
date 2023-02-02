
package studentlist;

/**
 *
 * @author Megha Patel 
 */
public class Student { 
    private String studentName;

    public Student() {
    }
    

    public Student(String studentName) {
        this.studentName = studentName;
    }
    
    

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
  