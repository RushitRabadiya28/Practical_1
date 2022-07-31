
       import java.util.Scanner;

    public class Ass_8 {
        void exam() {  // method 
            char student[][] = {  // default  input (ans of mcq)
                    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
            };
            char ans[] = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};  // ans of mcq 
            int a[] = new int[10]; // make new array for store right answer  
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 10; j++) {
                    if (student[i][j] == ans[j]) {  //  for checking propose 
                        a[i]++;  // for Right Answer 
                    }
                }
            }
            for (int k = 0; k < 8; k++) {  // for print 
                System.out.println("Student " + (k + 1) + " Score " + a[k] + " Marks out of 10 Marks");
            }
        }
    }
