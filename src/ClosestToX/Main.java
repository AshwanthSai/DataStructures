package ClosestToX;

import Arrays.Array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println(secondAtX(10));
    }


    // Fleshout.
    // Debug code and idea.
    // Simplify
    // Solve slowly.
    // F
    // D
    // S
    // S
    // HLT to LLT
    // Linearly search for a greater index, then move one index backwards, subtract and stdout.
    public static int distanceCalculate(int[] arr, int N, int target) {
        int smallerPoint = -1;
        System.out.println("here 1");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                smallerPoint = i - 1;
                break;
            }
        }
        System.out.println("here 2");
        return target - arr[smallerPoint];
    }

    // FDSS
    // ----------------------------------------------------
    // Write a for loop from zero to IntegerMax with a terinary operator, which manupluates a count.
    // Every manipulation, check for target, if reached return index;
    // Simplify ? -
    // Can you populate the array, try a sample.
    // [1, -1, 2, -2, 3, -3]
    // [7/1/23] Is there math for this ?
    // Apparently Yes, we could answer the positive and negative casses seperately.
    // HLL to LLT and never oscillate between HLT and LLT.

    public static int secondAtX(int target) {
        int counter = 0;
        for(int i = 1; i < Integer.MAX_VALUE; i++){
            if(i % 2 != 0) {
                counter+=i;
                if(counter == target) return i;
                continue;
            }
            counter-=i;
            if(counter == target) return i;
        }
        return 0;
    }
}
