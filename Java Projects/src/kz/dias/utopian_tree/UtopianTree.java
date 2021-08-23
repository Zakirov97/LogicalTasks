package kz.dias.utopian_tree;

public class UtopianTree {
    public static int utopianTree(int n) {
        // Write your code here
        int res = 0;
        for (int i = 0; i <= n; i++) {
            if (res == 0) {
                res++;
                continue;
            }
            if (i % 2 == 0) res += 1;
            else res *= 2;
        }
        return res;
    }
}
