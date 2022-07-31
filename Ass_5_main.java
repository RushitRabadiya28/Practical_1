import java.util.*;
public class Ass_5_main {
           public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter first string : ");
            String s1=sc.next();  // input string 
            System.out.println("Enter second string : ");
            String s2=sc.next();  
            Ass_5 d5=new Ass_5(s1,s2); // object make with pass argument
            sc.close();
        }
    }

