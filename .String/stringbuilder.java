public class stringbuilder {
    public static void main(String[] args) {
    //    int a = 5;
       Integer b = 5;
       System.out.println(b.toString());

       //time complexity = (n^2) where n =1,2,3,...26
       String str2 = new String("");
       for (char i = 'a'; i <= 'z'; i++) {
        str2 = str2 + i ;
       }
       System.out.println(str2);
       
       //time complexity = (O(26))
       StringBuilder str = new StringBuilder("");
       for (char ch = 'a'; ch <= 'z'; ch++) {
        str.append(ch);
       } 
       System.out.println(str);
    }
}
