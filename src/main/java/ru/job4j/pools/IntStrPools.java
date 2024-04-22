package ru.job4j.pools;

public class IntStrPools {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.print("Two strings were created in different heap locations. The Strings links are not equal to each other - ");
        System.out.println(str1 == str2);
        System.out.println();

        String str3 = "Hello";
        String str4 = "Hello";
        System.out.print("Two strings are linked to the same String pool address. The Strings links are equal to each other - ");
        System.out.println(str3 == str4);
        System.out.println();

        String str5 = "Hello, world";
        String str6 = "Hello, " + "world";
        System.out.print("Two strings are lined to the same String pool address - ");
        System.out.println(str5 == str6);
        System.out.println();

        String str7 = "Hello, world";
        String str8 = "Hello, ";
        String str9 = str8 + "world";
        System.out.print("Two string are not linked to the same String pool address. They are not equal - ");
        System.out.println(str9 == str7);
        System.out.println();

        String str10 = "Hello";
        String str11 = new String("Hello");
        String str12 = str11.intern();
        System.out.print("Two string are not linked to the same String pool address. They are not equal - ");
        System.out.print("Two strings are lined to the same String pool address - ");
        System.out.println(str12 == str10);
        System.out.println();

        System.out.print("Two new Strings aren't equal because they are created in different String pools sections - ");
        System.out.println(new String("Hello") == new String("Hello"));
        System.out.print("Two new Strings will be equal after using intern() method and will be linked to the same address - ");
        System.out.println(new String("Hello").intern() == new String("Hello").intern());
        System.out.println();

        Integer int1 = 127;
        Integer int2 = 127;
        System.out.print("Integer 127 equals to Integer 127 - ");
        System.out.println(int1 == int2);
        System.out.println();

        Integer int3 = -129;
        Integer int4 = -129;
        System.out.print("Integer -129 won't equals to Integer -129 - ");
        System.out.println(int3 == int4);
        System.out.println();
    }
}
