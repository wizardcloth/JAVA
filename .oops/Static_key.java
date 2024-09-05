public class Static_key {
    public static void main(String[] args) {
        // Student s1 = new Student();
        Student.schoolname = "Dav";
        // Student s2 = new Student();
        // System.out.println(s2.schoolname);
        System.out.println(Student.percentage(100,100,100));

    }

}
class Student{
    String name;
    int rollno;

    static String schoolname;
    // void get_schoolname(){
    //     this.schoolname = schoolname;
    // }

    static int percentage(int maths, int phy , int chem) {
        return(maths + phy + chem / 3);
    }

}


