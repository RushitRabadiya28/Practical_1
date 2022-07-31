public class Ass_3 {

    public int a, b;

    Ass_3() {  //default constructor 
    }

    Ass_3(int x, int y) {  //parameter  constructor 

        a = x;
        b = y;
        {
            a = a % 10;  //logic 
            b = b % 10;
        }
    }

        void ans () // method 
        {
            if (a == b) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }

        }
    }
