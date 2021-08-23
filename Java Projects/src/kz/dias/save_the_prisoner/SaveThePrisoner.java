package kz.dias.save_the_prisoner;

public class SaveThePrisoner {
    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        if (m > n)
            m = m%n!=0?m%n:n;
        if (s + m - 1 <=n)
            return s + m - 1;
        else return Math.abs(s + m - 1 - n);
    }
}
