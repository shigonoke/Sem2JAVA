package ru.geekbrains.lesson2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Calculator {
    static File filelog;
    static FileWriter fileWriter;
    public static void main(String[] args) {
        try
        {
             filelog = new File(" log.txt");
             fileWriter = new FileWriter(filelog);//запись в файл
            for (int i = 0; i < 5; i ++){
                fileWriter.write("hello!" + i + '\n');
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            double x = Double.parseDouble(scanner.nextLine());
            System.out.print("Введите операцию (+ - * / ): ");
            char operation = scanner.nextLine().charAt(0);
            System.out.print("Введите второе число: ");
            double y = Double.parseDouble(scanner.nextLine());
            if (operation == '+'){
                System.out.println(x + " + " + y + " = " + plus(x, y));
                System.out.printf( "%.2f + %.2f = %.2f\n", x , y,plus(x, y)); 
            }
            if (operation == '-'){
                System.out.println(x + " - " + y + " = " + minus(x, y));
                System.out.printf( "%.2f - %.2f = %.2f\n", x , y,minus(x, y));
            }    
            fileWriter.close();
        }
        catch(Exception e){

        }    
    }    
    static double plus(double a, double b){
        // fileWriter.write(null, 0, 0);
        return a + b;
    }
    static double minus(double a, double b){
        return a - b;
    }
}
          