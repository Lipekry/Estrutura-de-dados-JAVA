package Fila;

public class Item {

    private Integer ID;
    private String name;
    private Item prox;

    public Item getProx() {
        return prox;
    }

    public void setProx(Item prox) {
        this.prox = prox;
    }

    public Item() {
        this.ID=0;
        this.name="";
        this.prox=null;
    }

     public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item {" +
                "ID=" + ID +
                " | Name='" + name + '\'' +
                '}'+"\n";
    }

    public void setName(String name) {
        this.name = name;
    }
}
