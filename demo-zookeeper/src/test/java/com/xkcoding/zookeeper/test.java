package com.xkcoding.zookeeper;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> intList = new ArrayList();
        while (scan.hasNext()) {
            int begin = scan.nextInt();
            for (int i = 0; i < begin; i++) {
                int next = scan.nextInt();
                if (intList.contains(next)) {
                    continue;
                }
                intList.add(next);
            }
            Collections.sort(intList);
        }
        int i = 0;
        try {
            for (; ; ) {
                System.out.println(intList.get(i));
                i++;
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }
}
