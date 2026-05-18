package com.example.ergastiria.lab3.askisi2;

import gr.ihu.iee.oop.lab.UserInput;

public class Palindrome {
    public static void main(String[] args) {
        /**
         * GIA INTEGER INPUT
         */
        for (int i = 0; i < 10; i++) {
            int input = UserInput.getInteger();
            System.out.println(isPalindrome(input));
        }

        /**
         * PARALLAGI
         * GIA STRING INPUT
         */
        for (int i = 0; i < 10; i++) {
            String input = UserInput.getString();
            System.out.println(isPalindrome(input));
        }
    }

    public static boolean isPalindrome(int num) {
        // Metatropi tou num se string me to idio periexomeno
        String str = String.valueOf(num);
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) return false;
        }

        return true;
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();

        if (length == 0 || length == 1) return true;
        else if (str.charAt(0) == str.charAt(length - 1)) return isPalindrome(str.substring(1, length - 1));
        else return false;
    }
}
