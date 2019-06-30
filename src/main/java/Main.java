package main.java;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

       /* System.out.print("Enter the amount of money");
        Scanner sum = new Scanner(System.in);*/

        int rand = ThreadLocalRandom.current().nextInt(24565, 35789);
        System.out.println(rand);

        long start = System.currentTimeMillis();
        Count.count();
        long end = System.currentTimeMillis();
        System.out.println("Time" + (end - start));

    }
}
