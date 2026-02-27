public class Teacher extends Person {

    String department;
    String[] courses;

    // Constructor
    public Teacher(String firstName, String lastName, String gender, String department, String[] courses){
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    // Getters and setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    // toString method
    @Override
    public String toString() {
        String courseList = "";
        for(String c : courses){
            courseList += c + " ";
        }

        return "Teacher: " + super.toString() + ", department: " + department + ", courses: " + courseList.trim() + "]";
    }

    // equals method
    public boolean equals(Teacher t) {
        if(t == null){
            return false;
        }

        if(!super.equals(t)){
            return false;
        }
        if(!department.equals(t.department)){
            return false;
        }
        if(courses.length != t.courses.length){
            return false;
        }

        for(int i = 0; i < courses.length; i++){
            if(!courses[i].equals(t.courses[i])){
                return false;
            }
        }
        return true;
    }
}