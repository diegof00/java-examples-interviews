package net.javabackend.algorithmproblems;

import java.util.Stack;

public class BalanceBrackets {

    public static void main(String[] args) {
        String brackets = "({[]})";
        System.out.println(isBalanced(brackets));
    }

    public static boolean isBalanced(String brackets) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            char bracket = brackets.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            }
            if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char lastBracket = stack.pop();
                if (bracket == ')' && lastBracket != '(') {
                    return false;
                }
                if (bracket == '}' && lastBracket != '{') {
                    return false;
                }
                if (bracket == ']' && lastBracket != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
