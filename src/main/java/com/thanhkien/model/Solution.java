package com.thanhkien.model;

import java.util.Scanner;

public class Solution {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(count(a));
    }

    private static int count(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (isFalse(a, i)) {
                int j = findPairWith(a, i);
                if (j == -1) {
                    return -1;
                } else {
                    // swap
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    ++count;
                }
            }
        }
        return count;
    }

    private static boolean isFalse(int[] a, int i) {
        return a[i] % 2 != i % 2;
    }

    private static int findPairWith(int[] a, int i) {
        for (int j = i + 1; j < a.length; j += 2) {
            if (isFalse(a, j)) {
                return j;
            }
        }
        return -1;
    }
}
