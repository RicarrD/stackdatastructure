package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MyQueue {
    static Scanner scanner = new Scanner(System.in);
    private static final ArrayList<String> queue = new ArrayList<>();

    public static void main(String[] args) {
        enqueue();
        enqueue();
        dequeue();
        isEmpty();
        dequeue();
        isEmpty();
        enqueue();
        size();
        enqueue();
        enqueue();
        enqueue();
        printQueue();
    }

    public static void enqueue() {
        System.out.println("O que você deseja adicionar ");
        String novoElemento = scanner.nextLine();
        System.out.println(novoElemento + " Adicionado com sucesso");
        queue.add(novoElemento); // Adiciona ao final da lista
        System.out.println("Fila após adição: " + queue);
    }

    public static void dequeue() {
        if (!queue.isEmpty()) {
            String removido = queue.removeFirst();
            System.out.println(removido + " removido da fila");
        } else {
            System.out.println("A fila está vazia. Não é possível remover.");
        }
        System.out.println("Fila após remoção: " + queue);
    }

    public static boolean isEmpty() {
        System.out.println("A pilha está vazia? " + (queue.isEmpty() ? "Sim" : "Não"));
        return queue.isEmpty();
    }

    public static int size() {
        int tamanho = queue.size();
        System.out.println("O tamanho da pilha é de " + tamanho);
        return tamanho;
    }

    public static void printQueue() {
        System.out.println("Conteúdo da fila: " + queue);
    }
}