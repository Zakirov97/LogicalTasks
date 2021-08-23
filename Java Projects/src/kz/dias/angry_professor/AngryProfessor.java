package kz.dias.angry_professor;

import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        return a.stream().filter(f -> f <= 0).count() >= k ? "NO" : "YES";
    }
}
