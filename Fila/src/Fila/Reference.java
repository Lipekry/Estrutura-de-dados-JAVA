package Fila;

public class Reference {
    private Item first;
    private Item last;


    public Reference() {
        this.first= null;
        this.last= null;
    }

    public Item getFirst() {
        return first;
    }

    public void setFirst(Item first) {
        this.first = first;
    }

    public Item getLast() {
        return last;
    }

    public void setLast(Item last) {
        this.last = last;
    }

}
