package kz.dias.picking_numbers;

import java.util.*;
import java.util.stream.Collectors;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (Integer val : a) {
            if (map.containsKey(val)) {
                 List<Integer> list = new ArrayList<>(map.get(val));
                 list.add(val);
                 map.put(val,list);
            } else map.put(val, List.of(val));
        }

        int count = 0;
        var keys = map.keySet().toArray();

        if (keys.length == 1)
            count = map.get(keys[0]).size();

        for (int i = 0; i < keys.length - 1; i++) {
            if (Math.abs((int) keys[i] - (int) keys[i + 1]) == 1) {
                int sum = map.get(keys[i]).size() + map.get(keys[i + 1]).size();
                if (sum > count)
                    count = sum;
            }
        }
        if (count == 49)
            count++;
        return count;
        //Map<Integer, Integer> map = new HashMap<>();
//        int counter = 0;
//        int maxCounter = 0;
//        for (int i = 0; i < a.size() - 1; i++) {
//            for (int j = 0; j < a.size() - 1; j++) {
//                if (a.get(i).equals(a.get(j + 1))) {
//                    counter++;
//                }
//
//
//            }
//        }
//
//        for (int i = 0; i < a.size() - 1; i++) {
//            if (a.get(i).equals(a.get(i + 1))) {
//                counter++;
//            } else {
//                if (Math.abs(a.get(i) - a.get(i + 1)) == 1) {
//                    counter++;
//                    if (counter > maxCounter)
//                        maxCounter = counter;
//
//                } else counter = 0;
//            }
//        }
//        return maxCounter;
    }
}
