package com.company;

import java.util.Random;

import static com.company.Files.Arrays.FindMissing.test;
import static java.lang.Math.random;

public class Main {

    public static void main(String args[])
    {
//        BubbleSort ob = new BubbleSort();
//        int arr[] = {5, 4, 2, 1, 9, 6};
//        ob.bubbleSort(arr);
//        System.out.println("Buble Sorted array");
//        ob.printArray(arr);
//
//
//        //Selection sort class output
//        selectionSort ob1 = new selectionSort();
//        int arr2[] = {12,14,16,18,19};
//        ob1.sort(arr2);
//        System.out.println("selectionSorted array");
//        ob1.printArray(arr2);

        for (int n = 0; n < 10; ++n)
            test(10);


        //learning the random.nextInt method
        // create random object
        Random ran = new Random();
        // generating integer
        int nxt = ran.nextInt();

        // Printing the random Number
        System.out.println
                ("The Randomly generated integer is : " + nxt);
    }
}
