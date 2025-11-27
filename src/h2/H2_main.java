package h2;

public class H2_main {
    static void main(String[] args) {
        int [] a = {1,2,3,12,0};
        int [] b = {1,2,3,12,0};
        System.out.println(compareArrays(a,b));

    }
    public static boolean compareArrays(int [] a, int [] b){
        int la = a.length;
        int lb = b.length;

        if (la != lb){
            return true;
        }
        for (int i = 0; i < la; i++) {
            if (a[i] != b[i]) {
                return false;


            }
        }
        return true;
    }
}
