package main.java;

import java.util.*;

public class Count {
    public static void count(int total) {

        List<Integer> bills = new ArrayList<>(Arrays.asList(500, 200, 100, 50, 20, 10, 50, 2, 1));
        Iterator<Integer> iterator = bills.iterator();
        Integer num = iterator.next();
        int countNum = total;

        while (iterator.hasNext()) {
            int meter = countNum / num;
            if (countNum >= num) {
                System.out.println(num + "-" + meter);
                countNum %= num;
            }
            if (countNum < num) {
                num = iterator.next();
            }
            if (countNum == 0) {
                break;
            }
        }

    }
}