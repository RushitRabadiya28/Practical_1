import java.util.Scanner;

public class Ass_2_main {
    public static void main(String[] args) {
        Scanner ssc=new Scanner(System.in);
        Ass_2 as = new Ass_2(); // object make
        System.out.print("Enter String:");
        String A=ssc.nextLine();
       as.startOZ(A);//method call 
        System.out.println("Created By:- Rushit Rabadiya \n" + "ID:- 21CE111");
    }
}

