package main.java;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        int rand = ThreadLocalRandom.current().nextInt(24565, 35789);
        System.out.println(rand);

        long start = System.currentTimeMillis();
        Count.count(rand);
        long end = System.currentTimeMillis();

        System.out.println("Time " + (end - start) / 1000f);

    }
}
