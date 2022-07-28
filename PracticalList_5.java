import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class PracticalList_5 {

         public static int triangle(int a)
        {
            if(a==0)
                return 0;
            else
                return a+triangle(a-1);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter The Number of row in Triangle : ");
        a=sc.nextInt();
        System.out.println("Number of blocks the triangle has "+triangle(a));
        System.out.println("Created By:- Rushit Rabadiya \n" + "ID:- 21CE111");
    }
}

