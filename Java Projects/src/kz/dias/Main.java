package kz.dias;

import kz.dias.apple_and_orange.AppleAndOrange;
import kz.dias.arrays_left_rotations.ArraysLeftRotation;
import kz.dias.bill_division.BillDivision;
import kz.dias.number_line_jumps.NumberLineJumps;
import kz.dias.the_power_sum.ThePowerSum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        //ThePowerSum.powerSum(100, 2);
        //ArraysLeftRotation.rotLeft(new ArrayList<>(List.of(1,2,3,4,5)), 7);
        //BillDivision.bonAppetit(new ArrayList<>(List.of(3, 10, 2, 9)),1,12);
        //AppleAndOrange.countApplesAndOranges(7, 11, 5, 15, new ArrayList<>(List.of(-2, 2, 1)), new ArrayList<>(List.of(5, -6)));
        System.out.println(NumberLineJumps.kangaroo(43, 2, 70, 2));
        
        
        
        //System.out.println("sad");
    }
}
