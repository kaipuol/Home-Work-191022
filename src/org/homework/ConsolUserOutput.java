package org.homework;

public class ConsolUserOutput implements UserOutput{
    @Override
    public void print(int correctCount, int wrongCount) {
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
