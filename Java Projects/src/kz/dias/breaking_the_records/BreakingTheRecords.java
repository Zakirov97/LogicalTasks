package kz.dias.breaking_the_records;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int lowest = 0;
        int highest = 0;
        
        int lastLow = scores.get(0);
        int lastHigh = scores.get(0);
        
        for (int i = 1; i < scores.size(); i++) {
            if (lastLow < scores.get(i)) {
                lowest++;
                lastLow = scores.get(i);
            }
            if (lastHigh > scores.get(i)) {
                highest++;
                lastHigh = scores.get(i);
            }
        }
        return new ArrayList<>(List.of(lowest, highest));
    }
}
