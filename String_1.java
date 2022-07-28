public class String_1 {

    public static void main(String[] args) {
        String s="HELLO";
        System.out.println(s);
        String s1 = "WORLD !";
         String s2=s.concat("WORLD");
        System.out.println(s);
        System.out.println((s2));
        String s3 = new String("RUSHIT RABADIYA ");
        System.out.println(s3);
       String s4 =  s3.concat(s2);
        System.out.println(s4);
        s3.intern();
        System.out.println(s4);
        StringBuilder s5 = new StringBuilder("PATEL");
        System.out.println(s5);
        s5.append(2);
        System.out.println(s5);
        StringBuilder s6 = new StringBuilder("1CE!!!");
        System.out.println(s6);
        s6.append(" MOJ ");
        System.out.println(s6);
        s6.reverse();
        System.out.println(s6);
        System.out.println(s6);
        s6.replace(2,6,"ushi");
        System.out.println(s6);
        String[] s7 = {"adadad ","dsfdff ","sfsffsf"};
        for (int i =0; i<3;i++)
        {
            System.out.println(s7[i]);
        }
        char[] c={'c','h','a','r','u','s','a','t'};
            {

            System.out.println(c);
            char r1[];
            r1=s4.toCharArray();
                {
                    for(int i =0 ; i<15 ; i++)
                        System.out.println(r1[i]);
                }
                    String x="xyz";
                    String y="xyz ";
                System.out.println(x==y);
        }

    }

    }
