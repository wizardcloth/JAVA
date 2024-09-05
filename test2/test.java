public class test {
   public static void main(String[] args) {
    demo p1 = new demo(125,133);
    p1.a = 5;
    demo p2 = new demo(125.6,13.3);
    p2.b = 2;
   }
  
    
}
class demo{
    int a;
    int b;
    double c;
    double d;
    public demo(int a, int b ){
        this.a = a;
        this.b = b;
        System.out.println(a);
        System.out.println(b);
    }
    public demo(double c ,double d){
        this.c = c;
        this.d = d;
        System.out.println(c);
        System.out.println(d);
    }
   }
