package kz.dias.apple_and_orange;

import java.util.List;

public class AppleAndOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b,
                                             List<Integer> apples, List<Integer> oranges) {
        System.out.println(apples.stream().filter(f -> f + a >= s && f + a <= t).count());
        System.out.println(oranges.stream().filter(f -> f + b >= s && f + b <= t).count());
    }
}
