package com.filipe.colorquiz;

import android.graphics.Color;

import java.util.Random;

public class Question {
    //private final colors

    private int leftColor;
    private int rightColor;
    private String questionLabel;
    //private int answer:
    private boolean isRightAnswer;

    public Question() {
        generateQuestion();
    }

    public void generateQuestion()
    {
        int [] colors =
                {
                        //Color.rgb(100, 200, 300);
                        Color.BLACK, Color.GRAY, Color.BLUE, Color.RED, Color.GREEN,
                        Color.CYAN, Color.MAGENTA, Color.YELLOW
                };
        String[] colorStr = {"Black", "Gray", "Blue", "Red", "Green", "Cyan", "Magenta", "Yellow"};

        Random rand = new Random();
        int leftRand = rand.nextInt(colors.length);
        int rightRand = rand.nextInt(colors.length);
        leftColor = colors[leftRand];
        while (rightRand == leftRand)
        {
            rightRand = rand.nextInt(colors.length);
        }
        rightColor = colors[rightRand];

        int [] choices = {leftRand, rightRand};
        int answerRand = rand.nextInt(choices.length);
        //isRightAnswer = answerRand != 0;
        if (answerRand == 0)
        {
            isRightAnswer = false;
        } else
            {
                isRightAnswer = true;
            }
        int choice = choices[answerRand];
        questionLabel = colorStr[choice];
    }


    public boolean isRightAnswer() {
        return isRightAnswer;
    }

    public int getLeftColor() {
        return leftColor;
    }

    public void setLeftColor(int leftColor) {
        this.leftColor = leftColor;
    }

    public int getRightColor() {
        return rightColor;
    }

    public void setRightColor(int rightColor) {
        this.rightColor = rightColor;
    }

    public String getQuestionLabel() {
        return questionLabel;
    }

    public void setQuestionLabel(String questionLabel) {
        this.questionLabel = questionLabel;
    }
}
