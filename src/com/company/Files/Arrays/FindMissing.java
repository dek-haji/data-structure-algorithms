package com.company.Files.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//You are given an array of positive numbers from 1 to n, such that all numbers from 1 to n are present
//except one number ‘x’. You have to find ‘x’. The input array is not sorted.
public class FindMissing {
    public static int find_missing(List<Integer> input) {
        // calculate sum of all elements
        // in input list
        int sum_of_elements = 0;
        for (Integer x : input) {
            sum_of_elements += x;
        }
        // There is exactly 1 number missing
        int n = input.size() + 1;
        int actual_sum = (n * (n + 1)) / 2;
        return actual_sum - sum_of_elements;
    }

    public static void test(int n) {
        int missing_element = (new Random()).nextInt(n) + 1;
        List<Integer> v = new ArrayList<Integer>();
        for (int i = 1; i <= n; ++i) {
            if (i != missing_element)
                v.add(i);
        }

        int actual_missing = find_missing(v);
        System.out.print("Expected Missing = ");
        System.out.print(missing_element);
        System.out.print(" Actual Missing = ");
        System.out.println(actual_missing);
        System.out.println("Missing Element == Actual Missing : " + (missing_element == actual_missing));
    }
}