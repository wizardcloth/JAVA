// hierarchial interface and hybrid interface
public class inherit2 {
    public static void main(String[] args) {
        fish s1 = new fish();
        System.out.println(s1.eats);
    }

}

class Animal {
    String eats = "eats";
}
// each class can access the class animal and
//  they have their own properties.
class mammal extends Animal {
    void walk() {
        System.out.println("walk");
    }
}

class fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}
class shark extends fish{
    void eats(){
        System.out.println("fish");
    }
}
class tuna extends fish{
    void eats()
    {
        System.out.println("food");
    }
}
