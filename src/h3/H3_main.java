package h3;

import java.util.Arrays;

public class H3_main {
    static void main(String[] args) {
        int [] a = {2,2,1};
        int [] b = {1,2,2};
        compareArraysVal(a,b);
        System.out.println(compareArraysVal(a,b));

    }
    public static boolean compareArraysVal(int [] a, int [] b){
        int la = a.length;
        int lb = b.length;

        if (la != lb){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < la; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
