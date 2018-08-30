package com.j4loxa.j4edu.designpatterns.behavioral.interpreter;

import java.util.Stack;

public class Interpreter {
    private static boolean isOperator(String s) {
        if(s.equals("+") || s.equals("-") || s.equals("*")) {
            return true;
        } else {
            return false;
        }
    }

    private static Expression getOperator(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new Add(left, right);
            case "-":
                return new Subtract(left, right);
            case "*" :
                return new Product(left, right);
        }
        return null;
    }

    public static int evaluate(String expression) {
        Stack<Expression> stack = new Stack<>();
        for(String s : expression.split(" ")) {
            if(isOperator(s)) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(getOperator(s, left, right));
            } else {
                Expression i = new Number(Integer.valueOf(s));
                stack.push(i);
            }
        }
        return stack.pop().interpret();
    }
}
