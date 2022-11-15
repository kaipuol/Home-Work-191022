package org.homework;

import java.util.Arrays;

public class Block {
    private final String question;
    private final String[] answerOptions;
    private final int correctAnswer;
    private final UserInput userInput = new ConsolUseInput();

    public Block(String question, String[] answerOptions, int correctAnswer) {
        this.question = question;
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }
        public boolean ask () {
        System.out.println(question);
        // TODO: Вывод вариантов ответов на экран
        System.out.println(Arrays.toString(answerOptions));
        //TODO: Считываем с консоли ответ пользователя
        System.out.print("Ваш ответ: ");
        int k = userInput.read(answerOptions.length);
        //TODO: Проверяем ответ и выводим результат, а также увеличиваем счетчики правильных и неправильных ответов
        return k == correctAnswer;
    }
}


