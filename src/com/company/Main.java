package com.company;

public class Main {
    public static String scrambleWord(String word) {
        String front = "";
        String back = "";
        String sub = "";
        String finalString = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i + 1).equals("a") && i != (word.length() - 1)) {
                if (word.substring(i + 1, i + 2).equals("a")) {
                    front = word.substring(i, i + 1);
                    sub = word.substring(i + 1, i + 2);
                    back = word.substring(i + 2, i + 3);
                    finalString = finalString + front + back + sub;
                    i = i +2;
                }
                else {
                    front = word.substring(i, i + 1);
                    back = word.substring(i + 1, i + 2);
                    finalString = finalString + back + front;
                    i++;
                }
            }
            else {
                finalString = finalString + word.substring(i, i+1);
            }
        }
        return finalString;
    }


    public static void main(String[] args) {
        System.out.println(scrambleWord("tan"));
    }
}
