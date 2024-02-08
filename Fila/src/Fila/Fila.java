package Fila;

public class Fila {
    private final Reference reference;
    public Fila(){
        this.reference= new Reference();
    }
    public boolean isEmpty(){
        return this.reference.getFirst()==null;
    }
    public void enqueue(Item item){
        if (this.reference.getFirst()==null){
            this.reference.setFirst(item);
            this.reference.setLast(item);
        } else {
            Item itemAux=this.reference.getLast();
            itemAux.setProx(item);
            this.reference.setLast(item);
        }
    }
    public Item dequeue(){
        Item ItemAux=this.reference.getFirst();
        if (ItemAux!=null){
            this.reference.setFirst(ItemAux.getProx());
            ItemAux.setProx(null);
            return ItemAux;
        }
        return null;
    }
    public Item first(){
        return this.reference.getFirst();
    }

    public Item last(){
        return this.reference.getLast();
    }
    public String ToString(){
        String texto="----------Fila----------\n";
        Item ItemAux=this.reference.getFirst();
        while (ItemAux!=null){
            texto+=ItemAux.toString();
            ItemAux=ItemAux.getProx();
        }
        texto+="------------------------";
        return texto;
    }
}
