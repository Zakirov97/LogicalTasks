package kz.dias.divisible_sum_pairs;

import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int k, List<Integer> ar) {
        // Write your code here
        int counter = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0)
                    counter++;
            }
        }
        return counter;
    }
}
