import java.util.Scanner;
import java.util.*;

public class Ass_6 {

        Ass_6(String[] words, String target) {  // parameter constructor 
            int found = 0;
            for (int i = 0; i < words.length; i++) { 
                if (words[i].equals(target)) {
                    found++;
                }
            }
            found = words.length - found;
            int place = 0;
            String[] str = new String[found];
            for (int j = 0; j < words.length; j++) {  
                if (!words[j].equals(target)) {
                    str[place] = words[j]; // make new array for ans 
                    place++;
                }
            }
            System.out.println(Arrays.toString(str));  // print new array 
        }
    }
