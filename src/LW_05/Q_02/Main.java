package LW_05.Q_02;

public class Main {

    public static void main(String[] args) {

        Department seDept = new Department("Software Engineering");
        Degree csDegree = new Degree("Computer Science");

        Course oop = new Course("Object-Oriented Programming", "Compulsory");

        Lecturer lec1 = new Lecturer("Dr. Perera", "Senior Lecturer", seDept);
        Student stu1 = new Student("Kamal", "CS2023-001", "2nd Year");

        seDept.addLecturer(lec1);
        seDept.appointDepartmentHead(lec1);
        seDept.offerCourse(oop);

        csDegree.offerCourse(oop);
//gygyg
        oop.addLecturerInCharge(lec1);
        oop.addDegreeBelongsTo(csDegree);

        lec1.addCourse(oop);

        stu1.registerDegree(csDegree);
        stu1.enrollCourse(oop);

        System.out.println("\n--- Lecturer Info ---");
        lec1.displayInfo();

        System.out.println("\n--- Student Info ---");
        stu1.displayInfo();

        System.out.println("\n--- Department Info ---");
        seDept.displayInfo();

        System.out.println("\n--- Course Info ---");
        oop.displayInfo();

        System.out.println("\n--- Degree Info ---");
        csDegree.displayInfo();
    }
}
