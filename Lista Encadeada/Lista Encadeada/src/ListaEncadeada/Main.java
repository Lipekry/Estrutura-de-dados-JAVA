package ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        No<Integer> no = new No<Integer>();
        no.setDado(10);
        lista.add(no);
        No<Integer> no2 = new No<Integer>();
        no2.setDado(15);
        lista.add(no2);
        No<Integer> no3 = new No<Integer>();
        no3.setDado(20);
        lista.add(no3);
        System.out.println(lista.Stringify());
        lista.Remove(1);
        System.out.println(lista.Stringify());
        lista.Remove(no);
        System.out.println(lista.Stringify());
        lista.Remove();
        System.out.println(lista.Stringify());
    }
}