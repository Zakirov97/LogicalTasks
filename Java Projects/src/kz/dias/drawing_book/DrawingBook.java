package kz.dias.drawing_book;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        // Write your code here
        int res = 0;
        if (n / 2 >= p){
            if (p > 1)
                res = p / 2 ;
        }
        else {
            res = (n - p)/2;
            if (res == 0 && n % 2 == 0 && n != p)
                res++;
        }
        return res;
        
    }
}
