package com.company.march28.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTasks {
    public String middleThree(String text) {
        int middleIndex = text.length() / 2;
        return text.substring(middleIndex - 1, middleIndex + 2);
    }

    public String extraEnd(String text, int steps) {
        String lastSymbols = text.substring(text.length() - 2);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < steps; i++) {
            builder.append(lastSymbols);
        }
        return builder.toString();
    }

    public String withoutX(String text) {
        return text.replaceAll("x", "");
    }

    public int countWord(String text, String word) {
        int count = 0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public int countCode(String text) {
        return countWord(text, "code");
    }

    public boolean catDog(String text) {
        return countWord(text, "cat") == countWord(text, "dog");
    }

    public String buildExpression(int a, int b, char operation) {
        StringBuilder builder = new StringBuilder();
        int result;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            default:
                System.out.println("Unrecognized operation");
                result = Integer.MIN_VALUE;
        }
        // 41 + 4 = 45
        builder.append(a).append(" ").append(operation).append(" ").append(b).append(" = ").append(result);
       /* switch (builder) {
            case "sum":
                builder.append(a).append("+").append(b).append("=").append(a + b);
                break;
            case "subtract":
                builder.append(a).append("-").append(b).append("=").append(a + b);
                break;
            case "multiple":
                builder.append(a).append("*").append(b).append("=").append(a + b);
                break;

            default:
        }*/
        //builder.append(a).append(" + ").append(b).append(" = ").append(a + b).append('\n');
        //builder.append(a).append(" - ").append(b).append(" = ").append(a - b).append('\n');
        //builder.append(a).append(" * ").append(b).append(" = ").append(a * b).append('\n');
        return builder.toString();
    }
}
