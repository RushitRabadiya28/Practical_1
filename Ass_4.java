import java.util.Scanner;

public class Ass_4 {
     Scanner sc = new Scanner(System.in);
     Ass_4(int a ) {  // parameter  constructor
         int x[] = new int[a];
         System.out.println("Enter your Array -> ");
         for (int i = 0; i < a; i++) {
             x[i] = sc.nextInt();  // input Array 
         }
         int co=0;
         for ( int i=0; i<a-2 ; i++) {   // for logic 
             if (x[i] == 1 && x[i + 1] == 2 && x[i + 2] == 3) {
                 co++;
             }
         }
         System.out.print("Your  Array is -> ");
             for ( int i=0; i<a ; i++)
             {
                 System.out.print(x[i]);
                 System.out.print(" ");
             }
         System.out.println();
         System.out.print("Sequence of numbers 1, 2, 3 appears in the array somewhere -> ");
         if(co==0)
             System.out.println("false (No) ");
         else
             System.out.println("true (Yes) ");
}
}
