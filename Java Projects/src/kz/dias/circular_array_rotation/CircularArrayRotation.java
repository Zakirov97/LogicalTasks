package kz.dias.circular_array_rotation;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        List<Integer> resList = new ArrayList<>();
        List<Integer> tempList;
        
        if (k < a.size()) {
            tempList = new ArrayList<>(a.subList(a.size() - k, a.size()));
            tempList.addAll(a.subList(0, a.size() - k));
        } else if (k > a.size() && k % a.size() != 0) {
            k = k % a.size();
            
            tempList = new ArrayList<>(a.subList(a.size() - k, a.size()));
            tempList.addAll(a.subList(0, a.size() - k));
        } else tempList = new ArrayList<>(a);
        
        for (int i = 0; i < queries.size(); i++) {
            resList.add(tempList.get(queries.get(i)));
        }
        
        return resList;
    }
}
