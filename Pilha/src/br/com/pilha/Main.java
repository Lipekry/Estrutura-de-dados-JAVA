package br.com.pilha;

public class Main {
    public static void main(String[] args) {

        //Criação da Pilha
        Pilha pilha = new Pilha();

        //Criação e set de atributos do Nó e adição na pilha
        No node1 = new No();
        node1.setNum(10);
        node1.setDesc("Node 1");
        pilha.Push(node1);

        //Criação e set de atributos de novo Nó e adição na pilha
        No node2 = new No();
        node2.setNum(15);
        node2.setDesc("Node 2");
        pilha.Push(node2);

        //Criação e set de atributos de novo Nó e adição na pilha
        No node3 = new No();
        node3.setNum(20);
        node3.setDesc("Node 3");
        pilha.Push(node3);

        System.out.println(pilha.toString());
        //Remoção do nó do topo da pilha e print da mudança de referência do topo
        pilha.Pop();
        System.out.println(pilha.toString());

        pilha.Pop();
        System.out.println(pilha.toString());
    }
}