//single and multi inheritance
public class inherit {
  public static void main(String[] args) {
    fish s1 = new fish();
    s1.sleep();
    s1.name = "abc";
    s1.color = "green";    
    System.out.println(s1.color);
    System.out.println(s1.name);
  } 

}
// base class 
class Animal{
    String color = "red";
    void food()
    {
        System.out.println("fishfood");
    }
}
//single till now
// sub class
class mammal extends Animal{
    void sleep()
    {
        System.out.println("sleep");
    }
}
// lower-sub class 
class fish extends mammal{
    String name;

}
//multi till now