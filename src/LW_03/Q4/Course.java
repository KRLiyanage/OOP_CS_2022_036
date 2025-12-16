package LW_03.Q4;

public class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public Course(String courseName, String courseCode, Lecturer lecturer) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lecturer = lecturer;
    }

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

