package org.homework;

public class Test {
    private Block[] blocks;
    private int correctCount = 0;
    private int wrongCount = 0;

    public Test(Block[] blocks) {
        this.blocks = blocks;
    }

    public void run() {
        for (Block block : blocks) {
            if (block.ask()) {
                correctCount++;
            } else {
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
