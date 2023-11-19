package org.example;

public class FirstAndSecondConditionOfHomeWork{

    public static void arrayCalculate(int[]numbers){

        for (int i = 0; i < numbers.length ; i++) {//loop for first homework requirement
            numbers[i] = i*5;

            System.out.printf("Current index is : %d . Value is %d \n",i,numbers[i]);
        }
        double sum = 0;
        for (int element:numbers//loop for calculate sum of array elements
             ) {
            sum += element;
        }
        double average = sum / numbers.length;//calculate average value of array
        System.out.printf("Average value is : %.1f\n",average);//print array average value
    }

    public static void main(String[] args) {
        int[] number = new int[20];//implement array with 20 elements
       arrayCalculate(number);
    }
}
