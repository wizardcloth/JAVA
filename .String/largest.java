public class largest {
     public static void main(String arg[])
     {
    basic();

     }
     public static void basic() {
         //laxiographic compare
         //campare treat a and A same while compareToIgnoreCase treat them as same
        //0 for equal,1 for str1>str2,-1 for str1<str2
        
        String str1 = "A";
        String str2 = "a";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
     
     }
}