package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        // task1();
        // System.out.println(task2(12, 'a', 'c'));
        // task3();
        System.out.println(task4("aabbcc ", "abcabc "));
        System.out.println(task4("aabbcc ", "aacabc "));
    }

    // Метод проверяет является ли одна сторока перестановкой другой
    static boolean task4(String s1, String s2){

    //String str = "Hello!";
    //String str1 = new String(new char[]{'h', 'e', 'l', 'l', 'o', '!'});

    char[] arrS1 = s1.toCharArray();
    Arrays.sort(arrS1);
    char[] arrS2 = s2.toCharArray();
    Arrays.sort(arrS2);

    String str1 = new String(arrS1);
    String str2 = new String(arrS2);

    return new String(arrS1).equals(new String(arrS2));
    /*if (str1.length() != str2.length())
    return false;
    for(int i = 0; i < str1.length(); i++){
    if (str1.charAt(i) != str2.charAt(i))
    return false;
    return true;*/
    }

//  Задача . "Частота символов"
//  На вход программы подаются произвольные алфавитно-цифровые символы.
//  Требуется написать программу, которая будет печатать последовательность строчных английских букв ('a' 'b'…
//  из входной последовательности и частот их повторения.
//  Печать должна происходить в алфавитном порядке. Например, пусть на вход подаются следующие символы:
//  fnb5kbfshfm.
//  В этом случае программа должна вывести:
//  b2
//  f3
//  h2
//  k1
//  m1
//  s1

    static void task3(){

        int cA = 'a';//97
        int code;
        char c;
        Scanner scanner = new Scanner(System.in);
        int[] statistic = new int[26];
        System.out.println("Введите строку:");
        String s = scanner.nextLine();
        s = s + ".";
        for (int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            code = c;
            if (c >= 'a' && c <= 'z'){
               statistic[code - cA]++;
            }
            if (c =='.')
            break;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 26; i++){
            if (statistic[i] > 0){
              char cc = (char)(cA + i); 
              stringBuilder.append(cc);
              stringBuilder.append(statistic[i]);
              stringBuilder.append('\n');
            }
        }
        System.out.println(stringBuilder.toString());
    }
    // Дано четное число N (>0) и символы c1 и c2. Написать метод,
    // который вернет строку N, которая состоит из чередующихся 
    // символов c1 и c2, начиная с c1.

    static String  task2(int n, char c1, char c2){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++){
            // if - then - else(тернарный оператор, тройной)
            stringBuilder.append(i % 2 == 0 ? c1 : c2);
        //    if ( i % 2 == 0){
        //         stringBuilder.append(c1);
        //    } 
        //    else
        //    {
        //         stringBuilder.append(c2);
        //    }
        }
        return stringBuilder.toString();
    }

    static void task1(){

        int a = 1;
        double b = 12.1;

        String str2 = "AA" + "BB" + a + b + "CC" + "DD"; //переменные кот-ые указ-ют на опред строки "AA","BB","CC", 

        System.out.println(UUID.randomUUID());
        long startTime = System.currentTimeMillis();
        String str = "";
        for ( int i = 0; i < 30000; i++){
            str += UUID.randomUUID();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Операция выполнена за: " + (endTime - startTime) + "мс.");
        System.out.printf("Операция выполнена за: %d мс.\n", endTime - startTime);
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Hello!");
        for ( int i = 0; i < 30000; i++){
            stringBuilder.append(UUID.randomUUID());
        }
        endTime = System.currentTimeMillis();
        System.out.printf("Операция выполнена за: %d мс.\n", endTime - startTime);
    }

}