package h1;

public class H1_main {
    static void main(String[] args) {
        int [] a = {1, 3, 5, 4, 1};
        int [] b = {1, 4, 5, 3, 1};

        isMirrorArray(a,b);
        System.out.println(isMirrorArray(b,a));






    }
    public static boolean isMirrorArray(int[] a, int[] b) {
        int la = a.length;
        int lb = b.length;
        if (la != lb) {
            return false;
        } else {
            for (int i = 0; i < la; i++) {
                if (a[i] != b[la -1 -i]) {
                    return false;
                }
                }

                }
        return true;
            }
        }



