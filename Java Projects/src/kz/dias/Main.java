package kz.dias;

import kz.dias.breaking_the_records.BreakingTheRecords;
import kz.dias.divisible_sum_pairs.DivisibleSumPairs;
import kz.dias.migratory_birds.MigratoryBirds;
import kz.dias.subarray_division.SubarrayDivision;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        //ThePowerSum.powerSum(100, 2);
        //ArraysLeftRotation.rotLeft(new ArrayList<>(List.of(1,2,3,4,5)), 7);
        //BillDivision.bonAppetit(new ArrayList<>(List.of(3, 10, 2, 9)),1,12);
        //AppleAndOrange.countApplesAndOranges(7, 11, 5, 15, new ArrayList<>(List.of(-2, 2, 1)), new ArrayList<>(List.of(5, -6)));
        //System.out.println(NumberLineJumps.kangaroo(43, 2, 70, 2));
        //BreakingTheRecords.breakingRecords(new ArrayList<>(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1))).forEach(System.out::println);
        //System.out.println(SubarrayDivision.birthday(new ArrayList<>(List.of(1, 2, 1, 3, 2)),3, 2));
        //System.out.println(DivisibleSumPairs.divisibleSumPairs(3, new ArrayList<>(List.of(1, 3, 2, 6, 1, 2))));
        MigratoryBirds.migratoryBirds(new ArrayList<>(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
        
        
        //System.out.println("sad");
    }
}
