public class Ass_3 {

    public int a, b;

    Ass_3() {
    }

    Ass_3(int x, int y) {
        a = x;
        b = y;
        {
            a = a % 10;
            b = b % 10;
        }
    }

        void ans ()
        {
            if (a == b) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }

        }
    }
