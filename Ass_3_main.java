import java.util.Scanner;

public class Ass_3_main {
    public static void main(String[] args) {
        Ass_3 a1= new Ass_3();

        int a,b;
        System.out.print("Enter The Two Number =");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
       // PracticalList_3 c1 = new PracticalList_3(a ,b);
        System.out.printf("LASTDigit(%d,%d)",a,b);
        System.out.print(" -> ");
        a1.ans();
        System.out.println("Created By:- Rushit Rabadiya \n" + "ID:- 21CE111");


    }
}
