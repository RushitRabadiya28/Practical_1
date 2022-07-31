public class Ass_10 {

    Ass_10 (String a) {

        int l=a.length();
        char b[] =a.toCharArray();
        for(int i=0;i<l;i++) {
            b[i]+=3;
            System.out.print(b[i]+" ");
        }
    }
}


