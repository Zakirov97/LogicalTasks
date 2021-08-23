package kz.dias.beautiful_days_at_the_movies;

public class BeautifulDaysAtTheMovies {
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int res = 0;
        for (int l = i; l <= j; l++) {
            StringBuilder sb = new StringBuilder(String.valueOf(l)).reverse();
            if (Math.abs(l-Integer.parseInt(sb.toString()))%k == 0)
                res++;
        }
        return res;
    }
}
