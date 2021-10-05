package com.company;

import java.util.*;

import static com.company.Files.Arrays.FindMissing.test;

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
//        // create random object
//        Random ran = new Random();
//        // generating integer
//        int nxt = ran.nextInt(10);
//
//        // Printing the random Number
//        System.out.println
//                ("The Randomly generated integer is : " + nxt);


        //learning the hashset
        // creating and initializing an array (of non
        // primitive type)
        Integer arr[] = {6, 4,1, 2, 3, 4, 5};
        // Set demonstration using HashSet Constructor
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set + "Hashset don't take duplicates");

        TreeSet<Integer> treeSet = new TreeSet<Integer>(Arrays.asList(arr));
        System.out.println(treeSet + "TReeset don't take duplicates");
//creating treeset of strings
        String Phrases = "let me join you the coffee the shop";
        String[] phraseList = Phrases.split("");

        TreeSet<String> words = new TreeSet<>();
        words.addAll(Arrays.asList(phraseList));
        for(String w : words)
        {
            System.out.println(w);
        }

    }
}
