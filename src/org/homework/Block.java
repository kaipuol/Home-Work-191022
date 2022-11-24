package org.homework;

public class Block {
    private final String question;
    private final String[] answerOptions;
    private final int correctAnswer;
    private final UserInput userInput = new ConsolUseInput();
    private final UserOutput userOutput = new ConsolUserOutput();

    public Block(String question, String[] answerOptions, int correctAnswer) {
        this.question = question;
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }
        public boolean ask() {
        System.out.println(question);
        userOutput.print(answerOptions);
        userOutput.print();
        int k = userInput.read(answerOptions.length);
        //TODO: Проверяем ответ и выводим результат, а также увеличиваем счетчики правильных и неправильных ответов
        return k == correctAnswer;
    }
}


