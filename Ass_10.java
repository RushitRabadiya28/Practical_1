public class Ass_10 {

    Ass_10 (String a) {  // parameter  constructor 

        int l=a.length(); // for length of name 
        char b[] =a.toCharArray(); // string convert into array
        for(int i=0;i<l;i++) {
            b[i]+=3; // for +3 char  in all char
            System.out.print(b[i]+" "); 
        }
    }
}



