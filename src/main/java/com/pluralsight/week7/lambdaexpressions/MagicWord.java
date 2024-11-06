package com.pluralsight.week7.lambdaexpressions;

public class MagicWord implements Tester {
    private String magicWord;

    public MagicWord(String magicWord) {
        this.magicWord = magicWord;
    }

    public String getMagicWord() {
        return magicWord;
    }

    public void setMagicWord(String magicWord) {
        this.magicWord = magicWord;
    }

    @Override
    public boolean test(String str) {
        return magicWord.equals(str);
    }
}
