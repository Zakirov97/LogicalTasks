package kz.dias.subarray_division;

import java.util.List;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int res = 0;
        
        for (int i = 0; i <= s.size() - m; i++)
            if(d == s.subList(i,i+m).stream().mapToInt(mi->mi).sum())
                res++;
            
        return res;
    }
}
