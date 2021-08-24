package kz.dias.jumping_on_the_clouds_revisited;

public class JumpingOnTheCloudsRevisited {
    public static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int i = k;
        while (true) {
            if (i - c.length == 0 || energy <= 0) {
                if (c[0] == 0)
                    energy--;
                else
                    energy -= 3;
                break;
            } else if (i - c.length > 0) {
                i = i - c.length;
            }
            
            if (c[i] == 0)
                energy--;
            else
                energy -= 3;
            
            System.out.println("i = " + i + "; Energy = " + energy);
            i += k;
        }
        
        return energy;
    }
}
