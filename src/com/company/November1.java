package com.company;

public class November1 {
    public static void main(String args[]) {
       /* System.out.print(Arrays.toString(createArray((10))))

        int[][] table = {
                {1, 3, 8},
                {9, 2, 4},
                {3, 4, 3},
                {2, 2, 2}
        };
        int sum = calculateSumInRow(table, 0);
        System.out.println("Sum = " + sum);*/
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] a = {0, 2, 5, 1, 0};
        int[] b = {3, 9, 1, 0};
        System.out.printf("Matches count: %d%n", countMatches(a, b));
    }

    // [0, 2, 5, 1]
    // [3, 9, 1, 0]
    private static int countMatches(int[] a, int[] b) {
        int matchesCount = 0;
        for (int number : a) {
            if (arrayContainsNumber(b, number)) {
                matchesCount++;
            }
        }
        return matchesCount;
    }

    private static boolean arrayContainsNumber(int[] array, int number) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }

    /* 1. Написать метод, который принимает на вход целое число и возвращает массив, заполненный числами от 0 до принятого на вход числа (включительно).
2. Написать метод, который принимает на вход два массива чисел. Метод должен вернуть число совпадений по числам в двух массивах. Например:
Даны массивы [0, 2, 5, 1] и [3, 9, 1, 0]. Для этих массивов метод должен вернуть число 2, так как в обоих массивах есть числа 0 и 1.*/
    private static int[] createArray(int number) {
        int[] array = new int[number + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    private static int calculateSumInRow(int[][] table, int rowNumber) {
        int rowSum = 0;
        if (table.length - 1 < rowNumber) {
            System.out.println("Table does not contain row #" + rowNumber);
            System.out.println("It has only " + table.length + " rows");
            return rowSum;
        }
        for (int i = 0; i < table[rowNumber].length; i++) {
            rowSum += table[rowNumber][i];
        }
        return rowSum;
    }

    private static int[][] fillArrayAndReplaceMiddle(int arrayLength) {
        int[][] twoD = new int[arrayLength][arrayLength];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                if (i == j) {
                    twoD[i][j] = 1;
                }
            }
        }
        return twoD;
    }

    private static void printTable(int[][] table) {
        for (int[] row : table) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
  /*  public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int n = scanner.nextInt();
        int[][] array = {
                {1, 4, 1},
                {2, 0, 5},
                {3, 6, 2}

        };

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();

    }
}

    public static void main(String[] args) {
        int[][] table = {
                {4, 1, 5},
                {0, 8, 2}
        };
        int[][] anotherTable = new int[2][3];
        anotherTable[0][0] = 5;
        anotherTable[0][2] = 10;

        int[][] t = {
                {1, 6},
                {0, 9, 2},
                {10},
                {4, 8, 0, 9, 2}
        };
        printTableIndexed(table);
        for (int i = 0; i < t[3].length; i++) {
            System.out.print(t[3][i] + " ");
        }
    }

    private static void printTableIndexed(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/