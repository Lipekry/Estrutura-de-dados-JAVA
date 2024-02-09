package ListaEncadeada;

public class No<T> {

    private T dado;
    private No prox;

    public T getDado() {
        return dado;
    }

    public No() {
        this.dado=null;
        this.prox=null;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    @Override
    public String toString(){
        return this.dado.toString();
    }

    public boolean isNull(){
        return this.dado==null;
    }

}
