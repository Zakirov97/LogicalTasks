package kz.dias.cats_and_a_mouse;

public class CatsAndAMouse {
    public static String catAndMouse(int x, int y, int z) {
        int catA = Math.abs(x-z);
        int catB = Math.abs(y-z);
        if (catA == catB)
            return "Mouse C";
        return catA > catB ? "Cat B" : "Cat A";
    }
}
