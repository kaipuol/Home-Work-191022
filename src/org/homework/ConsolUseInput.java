package org.homework;

import java.util.Scanner;

public class ConsolUseInput implements UserInput {
    @Override
    public int read(int maxvalue) {
        int k=0;
        Scanner answer = new Scanner(System.in);
        while (answer.hasNext()){
            if (answer.hasNextInt()){
                k = answer.nextInt();
                if (k < 1 || k > maxvalue){
                    System.out.println("Нет таких чисел");
                    System.out.print("Ваш ответ повторно: ");
                } else {
                    break;
                }
            } else{
                System.out.println("Это не число. Введите число!");
                answer.next();
            }
        }
        return k;
    }
}
