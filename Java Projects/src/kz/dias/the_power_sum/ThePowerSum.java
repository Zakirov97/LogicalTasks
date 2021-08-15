package kz.dias.the_power_sum;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class ThePowerSum {
    public static int powerSum(int X, int N) {
        int res = 0;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int count = 1;
        while (true) {
            int myPow = (int) Math.pow(count, N);
            if (myPow <= X) {
                
                map.put(count, myPow);
                count++;
            } else break;
        }
        
        TreeMap<Integer, Integer> copyMap = new TreeMap<>(map);
        for (int i = map.size(); i > 0; i--) {
            if (copyMap.values().stream().mapToInt(x->x).sum() < X)
                break;
            for (int j = copyMap.size(); j > 0; j--) {
                if (i == 7)
                    System.out.println();
                if (!copyMap.containsKey(i))
                    break;
                int mapValue = map.get(i);
                int subtr = X - mapValue;
                
                if (subtr == 0) {
                    res++;
                    copyMap.remove(i);
                    break;
                }
                else if (subtr > 0) {
                    List<Integer> acceptedKeys = new ArrayList<>();
                    int innerSubtr = subtr;//51
                    int nextOperand = j-1;
                    boolean successChecker = false;
                    while (nextOperand > 0) {
                        if(copyMap.get(nextOperand) == null){
                            nextOperand--;
                            continue;
                        }
                        if (innerSubtr - copyMap.get(nextOperand) == 0) {
                            acceptedKeys.add(nextOperand);
                            res++;
                            successChecker = true;
                            break;
                        } else if (innerSubtr - copyMap.get(nextOperand) > 0) {
                            innerSubtr -= copyMap.get(nextOperand);
                            acceptedKeys.add(nextOperand);
                            nextOperand--;
                        } else if (innerSubtr - copyMap.get(nextOperand) < 0) {
                            nextOperand--;
                        }
                    }
                    if (acceptedKeys.size()>0 && successChecker) {
                        for (Integer acceptedKey : acceptedKeys) {
                            copyMap.remove(acceptedKey);
                        }
                        copyMap.remove(i);
                    }
                    break;
                }
            }
        }
        
        return res;
    }
}
