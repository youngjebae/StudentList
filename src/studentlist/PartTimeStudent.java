package studentlist;

/**
 * This class +++ Insert class description here +++
 *
 * @author YoungJe Bae
 */
public class PartTimeStudent extends Student {

    private int numCourses;

    public PartTimeStudent(String name, int numCourses) {
        super(name);
        this.numCourses = numCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
}
