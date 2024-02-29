// Design a Java program for managing student enrollment in a university, adhering to the principles of loose coupling and high cohesion. Your program should include classes for representing students (`Student`), courses (`Course`), and enrollment management (`Enrollment`). Ensure that the `Enrollment` class interacts with the other classes indirectly through an interface class (`EnrollmentSystem`). Implement methods for enrolling and dropping students from courses, and displaying enrollment details. Create a `Main` class to demonstrate the system's functionality, with appropriate error handling and user-friendly output messages. Provide comments in your code explaining how loose coupling and high cohesion are maintained throughout the implementation.

package Assingments.Assingment_CH12;

import java.util.List;
import java.util.ArrayList;

// import java.util.ArrayList;
// import java.util.List;

// interface EnrollmentSystem {
//     void enrollStudent(Student student, Course course);
//     void dropStudent(Student student, Course course);
//     void displayEnrollmentDetails();
// }

// class Student {
//     private String studentID;
//     private String name;

//     public Student(String studentID, String name) {
//         this.studentID = studentID;
//         this.name = name;
//     }

//     public String getStudentID() {
//         return studentID;
//     }

//     public void setStudentID(String studentID) {
//         this.studentID = studentID;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }
// }

// class Course {
//     private String courseID;
//     private String courseName;

//     public Course(String courseID, String courseName) {
//         this.courseID = courseID;
//         this.courseName = courseName;
//     }

//     public String getCourseID() {
//         return courseID;
//     }

//     public void setCourseID(String courseID) {
//         this.courseID = courseID;
//     }

//     public String getCourseName() {
//         return courseName;
//     }

//     public void setCourseName(String courseName) {
//         this.courseName = courseName;
//     }
// }

// class Enrollment implements EnrollmentSystem {
//     private List<> = String enrollmentDetails;

//     public Enrollment() {
//         this.enrollmentDetails = new ArrayList <> ();
//     }

//     @Override
//     public void enrollStudent(Student student, Course course) {
//         enrollmentDetails.add(student.getName() + " enrolled in " + course.getCourseName());
//     }

//     @Override
//     public void dropStudent(Student student, Course course) {
//         enrollmentDetails.remove(student.getName() + " enrolled in " + course.getCourseName());
//     }

//     @Override
//     public void displayEnrollmentDetails() {
//         System.out.println("Enrollment Details: ");
//         for (String detail : enrollmentDetails) {
//             System.out.println(detail);
//         }
//     }
// }

// public class Q9 {
//     public static void main(String[] args) {
//         EnrollmentSystem enrollmentSystem = new Enrollment();

//         Student student1 = new Student("101", "Suprit");
//         Student student2 = new Student("102", "Ronit");
        
//         Course course1 = new Course("C101", "Java Programming");
//         Course course2 = new Course("C102", "Data Structure");

//         enrollmentSystem.enrollStudent(student1, course1);
//         enrollmentSystem.displayEnrollmentDetails();
//     }
// }

interface EnrollmentSystem8 {
    void enrollStudent(Student8 student, Course8 course);
    void dropStudent(Student8 student, Course8 course);
    void displayEnrollmentDetails();
}

class Student8 {
    private String studentId;
    private String name;

    public Student8(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Course8 {
    private String courseId;
    private String courseName;

    public Course8(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCouseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}

class Enrollment implements EnrollmentSystem8 {
    private List<String> enrollmentDetails;

    public Enrollment() {
        this.enrollmentDetails = new ArrayList<>();
    }

    @Override
    public void enrollStudent(Student8 student, Course8 course) {
        enrollmentDetails.add(student.getName() + " enrolled in " + course.getCouseName());
    }

    @Override
    public void dropStudent(Student8 student, Course8 course) {
        enrollmentDetails.remove(student.getName() + " enrolled in " + course.getCouseName());
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (String detail : enrollmentDetails) {
            System.out.println(detail);
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        EnrollmentSystem8 enrollmentSystem = new Enrollment();

        Student8 student1 = new Student8("101", "Suprit");
        Student8 student2 = new Student8("102", "Ronit");

        Course8 course1 = new Course8("C101", "Java Programming");
        Course8 course2 = new Course8("C102", "Data Structures");

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);

        enrollmentSystem.displayEnrollmentDetails();

        enrollmentSystem.dropStudent(student1, course1);

        enrollmentSystem.displayEnrollmentDetails();
    }
}