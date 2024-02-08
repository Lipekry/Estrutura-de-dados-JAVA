package br.com.pilha;

public class No {

    public No() {
        this.num=0;
        this.prox=null;
    }
    private int num;

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private No prox;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "No{" +
                "num=" + num +
                " Desc=" + desc +
                '}';
    }

    public No getProx() {
        return this.prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
