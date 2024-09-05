public class constructor {
    public static void main(String[] args) {
        Student cr1 = new Student();
        System.out.println(cr1.rollno);
        // Student cr2 = new Student(123);
        // cr2.rollno(45);

    }
}

class Student {
    String name;
    int rollno = 90;
    //contructor overloading :- it choose the suitablr constructor itself
    Student()
    {
        System.out.println("constructerr is called");
    }
    
    Student(int rollno)
    {
        System.out.println("constructerr is called");
        this.rollno = rollno;
        System.out.println(this.rollno);
    }

}
