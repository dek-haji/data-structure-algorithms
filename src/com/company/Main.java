package com.company;

import com.company.sorting.BubbleSort;

public class Main {

    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {5, 4, 2, 1, 9, 6};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
