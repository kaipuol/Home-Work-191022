package org.homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        // TODO: Массив вопросов (вместо null надо написать определение массива)
        String[] questions = new String[4];
        questions[0] = "Что означает декларируемый Java принцип \"Write once, run anywhere\" ?";
        questions[1] = "Как называется двоичный формат, который понимает виртуальная машина Java?";
        questions[2] = "Что произойдет, если объявить метод main с синтаксически корректной, но не поддерживаемой\n" +
                       "JVM комбинацией модификаторов, возвращаемого значения и параметров?";
        questions[3] = "В какой файл компилируется файл с исходным кодом класса в Java?";
        // TODO: Массив вариантов ответов
        String[][] answerOptions = new String[4][];
        answerOptions[0] = new String[]{"1) Java-программа может быть запущена из исходников на любой платформе, где есть интерпретатор Java",
                "2) Скомпилированная Java-программа может быть запущена на любой платформе, где есть JVM",
                "3) Java-программа может быть скомпилирована в исполняемый файл под любую платформу"};
        answerOptions[1] = new String[]{"1) Virtual code (виртуальный код)",
                "2) Intermediate language (промежуточный язык)",
                "3) Bytecode (байткод)",
                "4) Abstract syntax tree (абстрактное синтаксическое дерево)"};
        answerOptions[2] = new String[]{"1) Программа скомпилируется, но при попытке запуска упадет с ошибкой",
                "2) Программа скомпилируется, запустится, но ничего не сделает",
                "3) Программа не скомпилируется"};
        answerOptions[3] = new String[]{"1) .class", "2) .java", "3) .exe", "4) .com", "5) .cmd", "6) .bat"};
        // TODO: Массив правильных ответов
        int[] correctAnswers = {2, 3, 1, 1};
        Scanner scanner = new Scanner(System.in);
        // TODO: Вывод вопроса на экран
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            // TODO: Вывод вариантов ответов на экран
            for(int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(answerOptions[i][j]);
            }
            System.out.print("Ваш ответ: ");
            //TODO: Считываем с консоли ответ пользователя
            Scanner answer = new Scanner(System.in);
            int k = answer.nextInt();
            //TODO: Проверяем ответ и выводим результат, а также увеличиваем счетчики правильных и неправильных ответов
            if (k==correctAnswers[i]){
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
