package main.java;

import java.util.*;

public class Count {
    public static void count(int total) {

        List<Integer> bills = new ArrayList<>(Arrays.asList(500, 200, 100, 50, 20, 10, 5, 2, 1));
        Iterator<Integer> iterator = bills.iterator();
        int countNum = total;

        while (iterator.hasNext()) {
            Integer num = iterator.next();
            int meter = countNum / num;
            if (countNum != 0) {
                System.out.print(num + "-" + meter + "; ");
                countNum %= num;
                if (countNum == 0) {
                    break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}