package LW_03.Q4;

public class Main {
    public static void main(String[] args) {

        Lecturer lecturer1 = new Lecturer("Kumar","CSCI 11023");
        Course course1 = new Course("Introduction to CS","CSCI 11023",lecturer1);
        Student student1 = new Student("Kamal","CS",course1.getCourseName());


        System.out.println("Course: " + course1.getCourseName() + " (" + course1.getCourseCode() + ")");
        System.out.println("Lecturer: " + course1.getLecturer().getLecturerName());
        System.out.println("Student: " + student1.getStudentName());
        System.out.println("Degree: " + student1.getDegreeName());
        System.out.println("Following Course: " + student1.getCourseFollowing());

        System.out.println("------------------------------------------------------------------------");

        Course oop = new Course();
        Lecturer john = new Lecturer();
        Student kumar = new Student();

        oop.setCourseCode("CSCI 21062");
        oop.setCourseName("Object Oriented Programming");
        oop.setLecturer(john);

        john.setCourseTeaching("Object Oriented Programming");
        john.setLecturerName("John Smith");

        kumar.setStudentName("Kumar Sangakara");
        kumar.setDegreeName("CS");
        kumar.setCourseFollowing("Object Oriented Programming");

        System.out.println("Student Details.");
        System.out.println("Name: "+kumar.getStudentName());
        System.out.println("Degree: "+kumar.getDegreeName() );
        System.out.println("Course: "+kumar.getCourseFollowing() );
        System.out.println();
        System.out.println("Course Details");
        System.out.println("Code: "+oop.getCourseCode());
        System.out.println("Name: "+oop.getCourseName());
        System.out.println("Lecture: "+oop.getLecturer());
        System.out.println();
        System.out.println("Lecture Details");
        System.out.println("Name: "+oop.getLecturer().getLecturerName());
        System.out.println("Course: "+oop.getLecturer().getCourseTeaching());


    }
}