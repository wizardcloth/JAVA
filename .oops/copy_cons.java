
public class copy_cons {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 10;
        s1.password = "xyz";
        s1.marks[0] = 10;

        Student s2 = new Student(s1);
        System.out.println("before rollno : " + s1.rollno);
        System.out.println("before rollno : " +s2.rollno);
        // System.out.println(s1.password);
        // System.out.println(s2.password);
        System.out.println("marks before : " + s1.marks[0]);
        System.out.println("marks before : " + s2.marks[0]);
    
        s1.rollno = 30;
        s1.marks[0] = 50;
        System.out.println("after rollno : " + s1.rollno);
        System.out.println("after rollno : " + s2.rollno);
        System.out.println("marks after : " + s1.marks[0]);
        System.out.println("marks after : " + s2.marks[0]);


    }

}

class Student {
    int marks[];
    int rollno;
    String password;

    Student() {
        marks = new int[3];

    }
    //shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.rollno = s1.rollno;
    //     this.password = s1.password;
    //     this.marks = s1.marks;

    // }
    //deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.rollno = s1.rollno;
        this.password = s1.password;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }

}
