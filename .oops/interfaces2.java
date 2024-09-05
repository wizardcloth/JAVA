//multiple interface or combining two class in one
public class interfaces2 {
    public static void main(String[] args) {
        bear p1 = new bear();
        p1.eats();
        System.out.println(bear.name);
    }
}

interface herbivore{
    void eats();
    String name = "cow";
}
interface carnivore{
    void eats();
}
class bear implements herbivore,carnivore {
    
    public void eats(){
        System.out.println("food");
    }
}