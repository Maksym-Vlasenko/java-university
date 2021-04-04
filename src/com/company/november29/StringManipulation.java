/*
package com.company.november29;

public class StringManipulation {
    public static char[] getSubArray(String str, int start, int end) {
        String substring = str.substring(start, end);
        return substring.toCharArray();
    }

    public static String capitalize(String str) {
        StringBuilder builder = new StringBuilder(str);
        char firstSymbol = (char) str.codePointAt(0);
        if (Character.isAlphabetic(firstSymbol)) {
            builder.setCharAt(0, Character.toUpperCase(str.charAt(0)));
        }

        for (int i = 1; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)) && Character.isSpaceChar(str.charAt(i - 1))) {
                builder.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }

        return builder.toString();
    }


    public static char[] getAlphabet(boolean uppercase) {
        char[] alphabet = new char[50];
        for (char c = 'a', i = 0; c <= 'z'; c++, i++) {
            char letter = uppercase ? Character.toUpperCase(c) : c;
            alphabet[i] = letter;
        }
        return alphabet;
    }

    public static String removeWhitespaces(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentSymbol = str.charAt(i);
            if (!Character.isWhitespace(currentSymbol)) {
                result.append(currentSymbol);
            }
        }
        return result.toString();
    }

    public static int countChars(String str, char targetSymbol) {
        int symbolsCount = 0;
        for (char currentSymbol : str.toCharArray()) {
            if (currentSymbol == targetSymbol) {
                symbolsCount++;
            }
        }
        return symbolsCount;
    }

   */
/*public static String wrapWord(String wrapper, String word) {
        'Flavio'.concat(' ').concat('Copes') //'Flavio Copes'
    }*//*


   public static String сoncatWithoutFirstLetters(String a, String b) {
        return a + b;
    }
    public static char[] lastChars(String a, String b){
        char result1 = a.charAt(1);
        char result2 = b.charAt(2);
        if (a || b == null) {
            return @;
        }
        return ;
    }


}*/
