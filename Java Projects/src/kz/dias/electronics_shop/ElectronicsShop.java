package kz.dias.electronics_shop;

public class ElectronicsShop {
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int cost = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int sum = keyboards[i] + drives[j];
                if (sum > cost && sum <= b)
                    cost = sum;
            }
        }
        return cost;
    }
}
