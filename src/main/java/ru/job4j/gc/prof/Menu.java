package ru.job4j.gc.prof;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static final int CREATE_ARRAY = 1;
    public static final int MERGE_SORT = 2;
    public static final int BUBBLE_SORT = 3;
    public static final int INSERT_SORT = 4;
    public static final int CLOSE = 6;

    public static final String BEGIN = " Sort start - ";
    public static final String END = " Sort end - ";
    public static final String SELECT = " Enter number of elements - ";
    public static final String ARRAY_INFO = " Array had been created and completed with random values from 1 to ";

    public static final String MENU = """
                Enter 1 to create an array.
                Enter 2 to sort using merge_sort.
                Enter 3 to sort using bubble_sort.
                Enter 4 to sort using insert_sort.
                Enter another number for exit.
            """;

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        Data store = new RandomArray(new Random());
        Sort merge = new MergeSort();
        Sort bubble = new BubbleSort();
        Sort insert = new InsertSort();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println(MENU);
            int userChoice = Integer.parseInt(scanner.nextLine());
            System.out.println(userChoice);
            if (CREATE_ARRAY == userChoice) {
                System.out.println(SELECT);
                int size = Integer.parseInt(scanner.nextLine());
                store.insert(size);
                System.out.println(ARRAY_INFO + size);
                System.out.println(LocalDateTime.now());
            } else if (MERGE_SORT == userChoice) {
                System.out.printf("%s%s%s%n", merge.getClass().getSimpleName(), BEGIN, LocalTime.now());
                System.out.println(LocalDateTime.now());
                merge.sort(store);
                System.out.printf("%s%s%s%n", merge.getClass().getSimpleName(), END, LocalTime.now());
                System.out.println(LocalDateTime.now());
            } else if (BUBBLE_SORT == userChoice) {
                System.out.printf("%s%s%s%n", bubble.getClass().getSimpleName(), BEGIN, LocalTime.now());
                System.out.println(LocalDateTime.now());
                bubble.sort(store);
                System.out.printf("%s%s%s%n", bubble.getClass().getSimpleName(), END, LocalTime.now());
                System.out.println(LocalDateTime.now());
            } else if (INSERT_SORT == userChoice) {
                System.out.printf("%s%s%s%n", insert.getClass().getSimpleName(), BEGIN, LocalTime.now());
                System.out.println(LocalDateTime.now());
                insert.sort(store);
                System.out.printf("%s%s%s%n", insert.getClass().getSimpleName(), END, LocalTime.now());
                System.out.println(LocalDateTime.now());
            } else {
                run = false;
                System.out.println("The End");
            }
        }
        System.out.println(LocalDateTime.now());
    }
}
