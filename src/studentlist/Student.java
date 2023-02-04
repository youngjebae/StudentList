
package studentlist;

/**
 *
 * @author YoungJe Bae 
 * Modified on Feb 2nd, 2023
 */
public class Student { 
    private String studentName;

    public Student() {
    }
    
    private String address;

    public Student(String studentName) {
        this.studentName = studentName;
    }
    
    

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
  
