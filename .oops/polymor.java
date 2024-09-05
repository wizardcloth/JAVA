
public class polymor {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;
        sum(a, b);
        sum(a, b, c);
        // System.out.println(Double.MAX_VALUE);
        // System.out.println(Double.MIN_VALUE);
        // System.out.println(Float.MAX_VALUE);
        // System.out.println(Float.MIN_VALUE);
        fish p1 = new fish();
        p1.eats();
    }
    // or can take float a or float b
    //example of compile time polymorphism aka function overloading
    public static int sum(int a, int b) {
        System.out.println(a + b);
        return 0;
    }

    public static int sum(int a, int b, int c) {
        System.out.println(a + b + c);
        return 0;
    }
}
//for run time polymorphism or function overriding
class animal{
    String eats = "food";
    void eats()
    {
        System.out.println("FOOD");
    } 
    animal(){
        System.out.println("This will call first");
    }
}
class fish extends animal{
    void eats()
    {
        System.out.println("FOODe");
    }
    fish(){
        System.out.println("This will call second");
    }
}
