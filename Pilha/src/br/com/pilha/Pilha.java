package br.com.pilha;

public class Pilha {

    private final Head head;
    public Pilha() {
        Head head = new Head();
        head.setNode(null);
        this.head=head;
    }

    public boolean isEmpty(){ return this.head.getNode()==null;}

    public No top(){ return this.head.getNode();}

    public void Push(No node){
        node.setProx(this.head.getNode());
        this.head.setNode(node);
    }

    public No Pop(){
        if (!this.isEmpty()) {
            No PopNode = this.head.getNode();
            this.head.setNode(PopNode.getProx());
            return PopNode;
        }
        return null;
    }

    @Override
    public String toString(){
        String texto="----------------Pilha----------------\n";
        No nodeAux=this.head.getNode();
        while (nodeAux!=null){
            texto+=nodeAux.toString()+"\n";
            nodeAux=nodeAux.getProx();
        }
        return texto;
    }
}
