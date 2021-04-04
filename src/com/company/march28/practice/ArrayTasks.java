package com.company.march28.practice;

public class ArrayTasks {

    public int[] replaceArrayElenet(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = -1;
            }
        }
        return array;
    }

    public String[] breakIntoWords(String text) {
        String[] words = text.split("\\s");
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            words[i] = currentWord.replaceAll("[^\\w-]", "");
        }
        return words;
    }

    public String[] breakIntoWords1(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            for (int j = 0; j < currentWord.length(); j++) {
                char currentSymbol = currentWord.charAt(j);
                if (!Character.isLetter(currentSymbol)
                        && !(currentSymbol == '_')
                        && !(currentSymbol == '-')) {
                    currentWord = currentWord.replace(currentSymbol, '\0');
                }
            }
            words[i] = currentWord;
        }
        return words;
    }

}
