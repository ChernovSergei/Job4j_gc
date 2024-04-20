package ru.job4j.cache.menu;

import ru.job4j.cache.AbstractCache;
import ru.job4j.cache.DirFileCache;
import java.util.Scanner;

public class Emulator {
    public static void main(String[] args) {
        Boolean status = true;
        String defaultDir = "C:/projects/job4j_gc/src/main/java/ru/job4j/cache/files/";
        String dir = "";
        AbstractCache cache = null;
        while (status) {
            String key = "";

            System.out.println("Enter options:"
                    + "\n1) Point a directory"
                    + "\n2) Point directory by default"
                    + "\n3) Put data into cache"
                    + "\n4) Get data"
                    + "\nAny number to exit");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            switch (answer) {
                case "1":
                    System.out.println("Enter directory: ");
                    dir = scanner.next();
                    cache = new DirFileCache(dir);
                    break;
                case "2":
                    dir = defaultDir;
                    cache = new DirFileCache(dir);
                    break;
                case "3":
                    System.out.println("There are two files in the system: Names.txt; Address.txt");
                    System.out.println("Enter file name to add it into a cache:");
                    key = scanner.next();
                    if (cache != null) {
                        cache.put(key, cache.get(key));
                    } else {
                        System.out.println("ERROR - point a directory first! Then you can put/get files");
                    }
                    break;
                case "4":
                    System.out.println("There are two files in the system: Names.txt; Address.txt");
                    System.out.println("Enter file name to get data from cache:");
                    key = scanner.next();
                    if (cache != null) {
                        System.out.println(cache.get(key));
                    } else {
                        System.out.println("ERROR - point a directory first! Then you can put/get files");
                    }
                    break;
                default:
                    status = false;
            }
        }
    }
}
