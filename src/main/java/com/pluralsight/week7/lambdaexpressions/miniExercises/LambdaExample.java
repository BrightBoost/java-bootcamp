package com.pluralsight.week7.lambdaexpressions.miniExercises;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator numericOperator = (a, b) -> a + b;
        System.out.println(numericOperator.operate(5, 6));

        NumericOperator numericOperator1 = (a, b) -> Math.max(a, b);
        // same thing but with ternary statement
        NumericOperator numericOperator2 = (a, b) -> a > b ? a : b;

        StringFormatter stringFormatter = str -> str.toUpperCase();
        System.out.println(stringFormatter.format("blabla"));


    }
}
