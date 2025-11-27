package p2;

import java.util.Arrays;

public class P2_main {
    static void main(String[] args) {
        int [] a = {1, 0, 2, 3, 2};
        System.out.println(pariwisedifferent(a));

    }
    public static boolean pariwisedifferent (int [] someNumbers){
        Arrays.sort(someNumbers);
        for (int i = 0; i < someNumbers.length - 1; i++){
            if (someNumbers[i] == someNumbers[i+1]){
                return false;
            }
        }
        return true;
    }
}
