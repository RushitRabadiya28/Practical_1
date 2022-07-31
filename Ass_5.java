import static java.lang.Math.min;
public class Ass_5 {
        Ass_5(String a, String b) {  // parameter  constructor
            int len = Math.min(a.length(), b.length());  // math function for find minimum length 
            int count = 0;
            for (int i = 0; i < len - 1; i++) {
                String aSub = a.substring(i, i + 2); // take substring  for check equals 
                String bSub = b.substring(i, i + 2);
                if (aSub.equals(bSub)) {  
                    count++;
                }
            }
            System.out.println("stringMatch(\"" + a + "\", \"" + b + "\") --> " + count);
        }
    }
