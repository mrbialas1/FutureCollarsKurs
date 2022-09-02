package com.futurecollars.lesson7.exercise5;

public class PythagoreanTheorem {
    public static boolean checkingTriangleIsRectangular(int side1, int side2, int side3){
        int[] table = new int[]{ side1, side2, side3};
        int max=table[0];
        int number=0;
        for (int i = 0; i < 3; i++) {
            if(table[i]>max){
                max=table[i];
                number =i;
            }
        }
        int product=0;
        for (int i = 0; i < 3; i++) {
            if(i!=number){
             product+=table[i]^2;
            }
        }
        return (max^2)==product;
    }
}
