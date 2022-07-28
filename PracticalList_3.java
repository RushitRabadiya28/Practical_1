import java.util.Scanner;

public class PracticalList_3{

    public int a ,b;
    PracticalList_3(){
    }
    PracticalList_3(int x, int y )
    {
        a=x;
        b=y;
        {
            while (a >= 10)
                a /= 10;
        }
        {
            while (b >= 10)
                b /= 10;
        }
    }
    void ans()
    {
        if(a==b)
        {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }

    public static void main(String[] args){
        int a,b;
        System.out.println("Enter The Two Number =");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        PracticalList_3 c1 = new PracticalList_3(a ,b);
        System.out.printf("firstDigit(%d,%d)",a,b);
        System.out.print(" -> ");
        c1.ans();
        System.out.println("Created By:- Rushit Rabadiya \n" + "ID:- 21CE111");

    }
}
