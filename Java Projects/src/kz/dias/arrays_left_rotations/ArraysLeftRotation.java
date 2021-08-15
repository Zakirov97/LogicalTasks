package kz.dias.arrays_left_rotations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysLeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        if (a.size() < d) d = d % a.size();
        return Stream.concat(a.subList(d,a.size()).stream(), a.subList(0,d).stream())
                .collect(Collectors.toList());
    }
}
