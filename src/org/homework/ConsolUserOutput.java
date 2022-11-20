package org.homework;
import java.util.Arrays;

public class ConsolUserOutput implements UserOutput{
    @Override
    public void print(int correctCount, int wrongCount) {
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
    @Override
    public void print(String[] answerOptions) {
        System.out.println(Arrays.toString(answerOptions));
    }
    @Override
    public void print() {
        System.out.println("Ваш ответ: ");
    }
}
