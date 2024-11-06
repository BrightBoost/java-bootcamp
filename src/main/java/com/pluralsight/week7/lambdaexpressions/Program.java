package com.pluralsight.week7.lambdaexpressions;

public class Program {
    public static void main(String[] args) {
        MagicWord magicWord = new MagicWord("magic");
//        System.out.println(magicWord.test("bla"));
//        System.out.println(magicWord.test("magic"));

        // anonymous implementation of the interface Tester
        Tester tester = new Tester() {
            @Override
            public boolean test(String str) {
                return false;
            }
        };

        // lambda expression
        Tester tester2 = str -> false;
        Tester tester3 = str -> str.length() > 5;
        doMagic(tester3);

      // implementing: void print();
      //  Printer p = () -> System.out.println("balblablablablabla");
      //  p.print();

        Printer p = (s1, s2) -> {
            System.out.println(s1 + " " + s2);
        };

        p.print("lala", "blabla");

        Creator<MagicWord> creator = () -> new MagicWord("magic!");

        // equivalent of having a class with:
        // public MagicWord create() {
        //    return new MagicWord("magic!");
        // }
        MagicWord m = creator.create();
    }

    public static void doMagic(Tester t) {
        System.out.println(t.test("bla"));
    }
}
