package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal (String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String answer = "";
        String paws = this.numberOfPaws > 1 ? " paws " : " paw ";
        if (hasFur) {
            answer =  "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + paws + "and a fur.";
        } else {
            answer = "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + paws + "and no fur.";
        }
        return answer;
    }
}
