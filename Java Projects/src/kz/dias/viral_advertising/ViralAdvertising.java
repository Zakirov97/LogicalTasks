package kz.dias.viral_advertising;

public class ViralAdvertising {
    public static int viralAdvertising(int n) {
        // Write your code here
        int cumulativesLikes = 0;
        int shared = 5;
        int liked = 0;
        for (int i = 0; i < n; i++) {
            cumulativesLikes += shared/2;
            liked = (shared/2)*3;
            shared = liked;
        }
        return cumulativesLikes;
    }
}
