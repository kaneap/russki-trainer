package com.example.russkitrainer;

public class AddStressQuestion {

    String prompt;
    String word;
    int stressPosition;

    public AddStressQuestion(String prompt, String word, int stressPosition) {
        this.prompt = prompt;
        this.word = word;
        this.stressPosition = stressPosition;
    }

    public static AddStressQuestion parseFromLine(String str){
        String[] pieces = str.split(" \t");
        if (pieces.length != 3) throw new IllegalArgumentException("The line contains a question that cannot be parsed.");
        return new AddStressQuestion(pieces[0], pieces[1], Integer.parseInt(pieces[2]));
    }
}