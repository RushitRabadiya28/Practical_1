import java.util.Scanner;

public class Ass_3_main {
    public static void main(String[] args) {
        Ass_3 a1= new Ass_3();  // object make 

        int a,b;
        System.out.print("Enter The Two Number =");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt(); // input int 
        b=sc.nextInt();
        System.out.printf("LASTDigit(%d,%d)",a,b);
        System.out.print(" -> ");
        a1.ans();  // method calling 
        System.out.println("Created By:- Rushit Rabadiya \n" + "ID:- 21CE111");
    }
}
