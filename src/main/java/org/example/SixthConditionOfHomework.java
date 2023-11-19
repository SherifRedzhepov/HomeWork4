package org.example;

public class SixthConditionOfHomework {
    public static void main(String[] args) {
       int n = 13;
       int fibFirst = 0;
       int fibSecond = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(fibFirst);
            int fN = fibFirst + fibSecond;

            fibFirst = fibSecond;
            fibSecond = fN;

        }
    }
}
