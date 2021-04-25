package com.company.april4.homework1;

public class Tasks {
    public boolean checkingForRepetition(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) return true;
            }
        }
        return false;
    }

    public int[] connectArrays(int[] array1, int[] array2) {
        int[] c = new int[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            c[i] = array1[i];
            count++;
        }
        for (int j = 0; j < array2.length; j++) {
            c[count++] = array2[j];
        }
        return c;
    }

    public int[] arraysSum(int[][] array) {
        int[] sum = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum[i] += array[i][j];
            }
        }
        return sum;
    }

    public int[] arraysSumForeach(int[][] array) {
        int[] sum = new int[array.length];
        int resultIndex = 0;
        for (int[] row : array) {
            for (int number : row) {
                sum[resultIndex] += number;
            }
            resultIndex++;
        }
        return sum;
    }

    public void sumByRow(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            int[] row = table[i];
            int rowSum = 0;
            for (int element : row) {
                rowSum += element;
            }
            System.out.println("Sum in row No" + i + " = " + rowSum);
        }
    }

    public boolean toothedArray(int[][] array) {
        int firstRowLength = array[0].length;
        for (int[] currentRow : array) {
            if (firstRowLength != currentRow.length) {
                return true;
            }
        }
       /* for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].length != array[j].length) return true;
            }
        }*/
        return false;
    }

    public int[][] fillTheArrayDiagonally(int number) {
        int[][] array = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }
}