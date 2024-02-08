package Fila;

public class Main {
    public static void main(String[] args) {
        //Criação da fila
        Fila fila = new Fila();

        //Criação de itens
        Item item = new Item();
        item.setName("Luis Felipe");
        item.setID(1);

        Item item2 = new Item();
        item2.setName("Carlos Amarildo");
        item2.setID(2);

        Item item3 = new Item();
        item3.setName("Eusébio de Souza");
        item3.setID(3);

        //Adição dos itens e resultado
        fila.enqueue(item);
        System.out.println(fila.ToString());
        fila.enqueue(item2);
        fila.enqueue(item3);
        System.out.println(fila.ToString());
        Item itemDeq=fila.dequeue();
        System.out.println(fila.ToString());
    }
}