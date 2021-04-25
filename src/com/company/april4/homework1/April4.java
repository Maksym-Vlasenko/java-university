package com.company.april4.homework1;

import java.util.Arrays;

public class April4 {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        int[] numbers = {1, 3, 3, 4, 5, 6};
        System.out.println(tasks.checkingForRepetition(numbers));
        System.out.println(Arrays.toString(tasks.connectArrays(new int[]{1, 2, 3}, new int[]{5, 6, 7})));
        int[][] table = {
                {1, 2, 2, 3},
                {2, 4, 4, 2},
                {3, 6, 6, 3},
                {4, 8, 8, 4}
        };
        System.out.println(Arrays.toString(tasks.arraysSum(table)));
        tasks.sumByRow(table);
        int[][] array = {
                {1, 2, 3},
                {5, 4}
        };
        System.out.println(tasks.toothedArray(array));
        System.out.println(Arrays.deepToString(tasks.fillTheArrayDiagonally(5)));


//public int[] filterByGroup(Student[],int group ){

//}
    }
}
