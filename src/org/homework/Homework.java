package org.homework;

import java.util.Arrays;
import java.util.Scanner;

class Block {
    String question;
    String[] answerOptions;
    int correctAnswer;
}

public class Homework {
    public static void main(String[] args) {
        Block test1 = new Block();
        test1.question = "Что означает декларируемый Java принцип \"Write once, run anywhere\" ?";
        test1.answerOptions = new String[]{"1) Java-программа может быть запущена из исходников на любой платформе, где есть интерпретатор Java",
                                       "\n2) Скомпилированная Java-программа может быть запущена на любой платформе, где есть JVM",
                                       "\n3) Java-программа может быть скомпилирована в исполняемый файл под любую платформу"};
        test1.correctAnswer = 2;

        Block test2 = new Block();
        test2.question = "Как называется двоичный формат, который понимает виртуальная машина Java?";
        test2.answerOptions = new String[]{"1) Virtual code (виртуальный код)",
                                        "2) Intermediate language (промежуточный язык)",
                                        "3) Bytecode (байткод)",
                                        "4) Abstract syntax tree (абстрактное синтаксическое дерево)"};
        test2.correctAnswer = 3;

        Block test3 = new Block();
        test3.question = "Что произойдет, если объявить метод main с синтаксически корректной, но не поддерживаемой\n" +
                       "JVM комбинацией модификаторов, возвращаемого значения и параметров?";
        test3.answerOptions = new String[]{"1) Программа скомпилируется, но при попытке запуска упадет с ошибкой",
                                           "2) Программа скомпилируется, запустится, но ничего не сделает",
                                           "3) Программа не скомпилируется"};
        test3.correctAnswer = 1;

        Block test4 = new Block();
        test4.question = "В какой файл компилируется файл с исходным кодом класса в Java?";
        test4.answerOptions = new String[] {"1) .class", "2) .java", "3) .exe", "4) .com", "5) .cmd", "6) .bat"};
        test4.correctAnswer = 1;

        Block[] questions = {test1, test2, test3, test4};
        int correctCount = 0, wrongCount = 0;

        // TODO: Вывод вопроса на экран
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].question);
            // TODO: Вывод вариантов ответов на экран
            System.out.println(Arrays.toString(questions[i].answerOptions));
           //for(int j = 0; j < questions.answerOptions[j]; j++) {
           //System.out.println(questions[i].answerOptions[j]);
           //}
            //TODO: Считываем с консоли ответ пользователя
            System.out.print("Ваш ответ: ");
            int k = 0;
            Scanner answer = new Scanner(System.in);
            while (answer.hasNext()){
                if (answer.hasNextInt()){
                    k = answer.nextInt();
                    if (k < 1 || k > questions[i].answerOptions.length){
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
           //TODO: Проверяем ответ и выводим результат, а также увеличиваем счетчики правильных и неправильных ответов
            if (k==questions[i].correctAnswer){
               correctCount++;
            }
            else {
              wrongCount++;
            }
        }
            System.out.println();
        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}