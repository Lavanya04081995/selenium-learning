package week3.day2;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Myself Lavanya";
        String reversed="";
          char[] chars =str.toCharArray();
      
        for (int i = str.length()-1; i >=0; i--) {
            reversed+=str.charAt(i);
            
        }
        System.out.println("reversed of the String is: " + reversed);
    }

}
