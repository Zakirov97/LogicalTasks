package kz.dias.number_line_jumps;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if (x1 < x2 && v2 > v1 || x1 > x2 && v2 < v1 || v2 - v1 == 0 && x1 != x2)
            return "NO";
        
        int subtructJumps = v2 - v1;
        if (v1 > v2) subtructJumps = v1 - v2;
        
        int lowestJumperPosition = x1 - x2;
        if (x1 < x2) lowestJumperPosition = x2 - x1;
        
        if (lowestJumperPosition % subtructJumps > 0) return "NO";
        else return "YES";
    }
}
