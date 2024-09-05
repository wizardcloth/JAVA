public class abstraction {
    public static void main(String[] args) {
        fish p1 = new fish();
        p1.eats();
    }
    
}
abstract class animal{
    //cannot create an object of abstract class
    abstract void eats();
    //we can create an constructor
    animal(){
        System.out.println("animal constructor");
    }
}
class fish extends animal{
    void eats(){
        System.out.println("FishFood");
    }
    fish(){
        System.out.println("fish constructor");
    }
}
class mammal extends animal{
    void eats(){
            System.out.println("Food");
    }
}
