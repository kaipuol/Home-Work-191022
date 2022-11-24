package org.homework;

public class Test {
    private final Block[] blocks;
    private int correctCount = 0;
    private int wrongCount = 0;
    public final UserOutput userOutput = new ConsolUserOutput();

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
    userOutput.print(correctCount, wrongCount);
    }
}
