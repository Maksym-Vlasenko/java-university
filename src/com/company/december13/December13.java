package com.company.december13;

public class December13 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "There";
        String result = сoncatWithoutFirstLetters(s1, s2); // elloorld
        System.out.println(result);

        String wrapper = "(())";
        String word = "hello";
        String wrappedWord = wrapWord(wrapper, word);
        System.out.println(wrappedWord);

        String first = "last";
        String second = "chars";
        String lastChars = lastChars(first, second);
        System.out.println(lastChars);
    }

    private static String lastChars(String a, String b) {
        char aChar = a.isBlank() ? '@' : a.charAt(0);
        char bChar = b.isBlank() ? '@' : b.charAt(1);
        /*char aChar;
        char bChar;
        if (a.isEmpty()) {
            aChar = '@';
        } else {
            aChar = a.charAt(0);
        }
        if (b.isEmpty()) {
            bChar = '@';
        } else {
            bChar = b.charAt(1);
        }*/
        return String.valueOf(aChar) + bChar;
    }

    /*
        wrapWord("<<>>", "Hello") → "<<Hello>>"
        wrapWord("[[]]", "word") → "[[word]]"
    * */
    private static String wrapWord(String wrapper, String word) {
        return wrapper.substring(0, 2) + word + wrapper.substring(2);
    }

    public static String сoncatWithoutFirstLetters(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
}
