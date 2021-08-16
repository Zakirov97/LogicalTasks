package kz.dias.migratory_birds;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        return arr.stream().collect(Collectors.groupingBy(x -> x)).entrySet().stream()
                .max((x,y) -> {
                    if (x.getValue().size() > y.getValue().size())
                        return 1;
                    else if (x.getValue().size() == y.getValue().size()){
                        return 0;
                    }
                    else return -1;
                })
                .get()
                .getKey();
    }
}
