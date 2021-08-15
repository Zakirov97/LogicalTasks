package kz.dias.bill_division;

import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int withoutAnnaPortionCost = (bill.stream().mapToInt(m -> m).sum() - bill.get(k)) / 2;
        if (b - withoutAnnaPortionCost > 0) {
            System.out.println(b - withoutAnnaPortionCost);
            return;
        }
        System.out.println("Bon Appetit");
    }
}
