package com.volkodav4ik;

/*1.Написать метод numJewelsInStones который принимает 2параметра:
-String jewels:строка,каждый символ который символизирует драгоценный камень,символы уникальны
-String stones:строка,каждый символ который символизирует камень.
Строки могут состоять только из символов a..zA..Z
Метод должен вернуть количество другоценных камней в строке stones.
        Пример:
        jewels="aAb"
        stones="caсAcA"
        Output:3
        Explanation:в строке stones есть 3 драг.камня:a,A,A*/

public class HW3T1 {
    public static void main(String[] args) {
        String jewels = "Ask";
        String stones = "sobAka";
        System.out.println("There are " + numJewelsInStones(jewels, stones) + " jewels in this stone.");
    }

    private static int numJewelsInStones(String jewels, String stones) {
        String lowerJewels = jewels.toLowerCase();
        String lowerStones = stones.toLowerCase();
        if (!lowerJewels.matches("[a-z]+")) {
            throw new IllegalArgumentException("The comparable strings should consist of a..z or A..Z");
        }
        if (!lowerStones.matches("[a-z]+")) {
            throw new IllegalArgumentException("The comparable strings should consist of a..z or A..Z");
        }
        int result = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    result++;
                }
            }
        }
        return result;
    }
}
