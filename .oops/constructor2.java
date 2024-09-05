public class constructor2 {
    public static void main(String[] args) {
        // student s1 = new student();
        student2 s2 = new student2();
        s2.name = "abc";
        System.out.println(s2.marks);

    }
}

class student {
    int marks;

    student() {
        // automatically call constructor of parent element we write super(); to call
        // manually
        System.out.println("name of student");
    }
}

class student2 extends student {
    String name;

    student2() {
        super.marks = 100;
        System.out.println("name of 2nd student");
    }
}
