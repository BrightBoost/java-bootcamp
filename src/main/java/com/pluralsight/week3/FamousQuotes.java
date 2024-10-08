package com.pluralsight.week3;

import java.util.Scanner;

public class FamousQuotes {
    private static String[] quotes = {
        "The only way to learn programming is by doing it. So get your hands dirty and start coding!",
        "Every line of code you write is a step closer to mastering your craft. Keep pushing forward!",
        "Programming is not about perfection; it's about progress. Embrace the journey!",
        "Don't be afraid to fail; every error is a lesson learned on the path to success.",
        "Think of challenges as opportunities to grow. Each bug you fix makes you a better programmer!",
        "Great programmers are not born; they are made through persistence, practice, and passion.",
        "Code your way to success, one line at a time. Every project is a stepping stone!",
        "Your only limit is your imagination. Dream big, code bigger!",
        "Stay curious, keep learning, and never stop asking questions. That's the heart of programming!",
        "Remember, every expert was once a beginner. Keep striving, and you'll reach your goals!"
    };

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String anotherQuote;
        do {
            System.out.println("Please enter a nr between 1 and 10 to see quote. Or enter \"random\" if you want a random quote:");
            String input = scanner.nextLine();
            try {
                int index;
                if(input.equalsIgnoreCase("random")) {
                    index = (int) (Math.random() * 10 + 1);
                } else {
                    index = Integer.parseInt(input);
                }
                // input is now a string, I need a  number
                System.out.println(quotes[index - 1]);
            } catch(Exception e) {
                System.out.println("Number is out of bounds!");
            }
            System.out.println("Do you want another quote? Y / N");
            anotherQuote = scanner.nextLine().toUpperCase();
        } while(anotherQuote.equals("Y"));


    }
}
