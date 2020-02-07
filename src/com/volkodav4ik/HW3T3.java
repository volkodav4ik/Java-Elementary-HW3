package com.volkodav4ik;

/*
3*.Дана строк состоящая из любых символов.Не используя стандартный метод
String.toLowerCase()перевести все большие латинские буквы в маленькие.

        Пример:
        Input:"#1AmC"
        Output:"#1amc"
*/

public class HW3T3 {
    private static final char TO_LOWER_CHAR = 32;

    public static void main(String[] args) {
        String input = "###String_Fr0m_A_t0_Z!!!";
        System.out.println("Input: " + input);
        System.out.println("Output: " + toLowerCase(input));
    }

    private static String toLowerCase(String input) {
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                sb.setCharAt(i, (char) (sb.charAt(i) + TO_LOWER_CHAR));
            }
        }
        return sb.toString();
    }
}
