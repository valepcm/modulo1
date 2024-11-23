package com.anahuac.mayab.modulo1.sesion5.Extras.Pilas;
import java.util.Stack;

public class Ejercicio8Pilas {

	public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Pop elements from the stack
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}