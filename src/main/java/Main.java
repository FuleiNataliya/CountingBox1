package main.java;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        int rand = ThreadLocalRandom.current().nextInt(24565, 35789);
        System.out.println("You random number: " + rand);

        long start = System.currentTimeMillis();
        System.out.println("You will receive such bills in quantity:");
        Count.count(rand);
        long end = System.currentTimeMillis();

        System.out.println("Time of the performed operation: " + (end - start) / 1000f);

    }
}
