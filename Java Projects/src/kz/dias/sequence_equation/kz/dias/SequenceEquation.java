package kz.dias.sequence_equation.kz.dias;

import java.util.*;

public class SequenceEquation {
    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < p.size(); i++) {
            map.put(i + 1, p.indexOf(i + 1) + 1);
        }
        for (int i = 1; i <= p.size(); i++) {
            res.add(map.get(map.get(i)));
        }
        
        return res;
    }
}
