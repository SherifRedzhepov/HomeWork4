package org.example;

public class FifthConditionOfHomeWork {
    public static void main(String[] args) {
        int n = 49;
        int num = 1;

       while (num <= n){
           if ((num % 3) != 0 && (num % 7) != 0){//will sort number which divide on 3 and 7
               System.out.println( num);//print numbers which not divide on 3 and 7
           }
           num++;
       }
    }
}
