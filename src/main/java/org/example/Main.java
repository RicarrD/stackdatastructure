package org.example;


import java.util.ArrayList;
import java.util.Scanner;

/*
Toda pilha tem que ter
push
pop
peek
isEmpty
size
*/
public class Main{
    static Scanner scanner = new Scanner(System.in);
    private static final ArrayList<String> stack = new ArrayList<>();

    public static void main() {
        push();
        pop();
        pop();
        isEmpty();
        push();
        push();
        peek();
        size();
        isEmpty();
    }

    public static void push() {
        System.out.println("O que você deseja adicionar ");
        String novoElemento = scanner.nextLine();
        System.out.println(novoElemento + " Adicionado com sucesso");
        stack.add(novoElemento);
    }

    public static void pop() {
        if (!stack.isEmpty()) {
            stack.removeLast();
            System.out.println("Último elemento removido");
        }   else {
            System.out.println("Pilha vazia");
        }
    }

    public static void peek() {
        System.out.println("O último elemento é: " + stack.getLast());
    }

    public static boolean isEmpty() {
        System.out.println("A pilha está vazia? " + (stack.isEmpty() ? "Sim" : "Não"));
        return stack.isEmpty();
    }

    public static int size() {
        System.out.println("O tamanho da pilha é de " + stack.size());
        return stack.size();
    }
}