import java.util.Scanner;

public class Ass_6_2_main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] s = new String[5];
            String s1;
            System.out.println("Enter the array of String");
            for(int i=0;i<5;i++)
            {
                s[i] = sc.next();
            }
            System.out.println("Enter the target String");
            s1 = sc.next();
            Ass_6_2 d6 = new Ass_6_2(s,s1);
            sc.close();
        }
    }


