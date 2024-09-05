public class Oops {
    public static void main(String[] args) {
        // setting pen as contructor
        Pen p1 = new Pen();

        p1.set_color("red");
        System.out.println(p1.color);

        p1.set_pensize(15);
        System.out.println(p1.get_pensize());
    }    
}

class Pen{
    public String color;
    private int pensize = 5;

    int get_pensize(){
        return this.pensize;
    }

    void set_pensize(int newpensize)
    {
        pensize = newpensize;
        System.out.println(pensize);
    }

    void set_color(String newcolor) {
        color = newcolor;
    }
  
}

