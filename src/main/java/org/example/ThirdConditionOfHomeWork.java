package org.example;

public class ThirdConditionOfHomeWork {

    public static void oddAndEven(int[] numbers){
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {

            if ((numbers[i] % 2) == 0){
                sumEven += numbers[i];
            }
            else {
                sumOdd += numbers[i];
            }
        }
        System.out.printf("The sum of even number is: %d , and sum of odd number is: %d ",sumEven,sumOdd);
    }

    public static void main(String[] args) {
        int[] elements = {8,15,10,13,6,19,35,12};
        oddAndEven(elements);
    }
}
