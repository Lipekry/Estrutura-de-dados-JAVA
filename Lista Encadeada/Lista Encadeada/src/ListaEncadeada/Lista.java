package ListaEncadeada;

public class Lista {

    private Head head;

    public Lista() {
        this.head = new Head();
    }

    public boolean isEmpty(){
        return this.head.getTopo()==null;
    }

    public Integer Count(){
        Integer cont=0;
        No noAux=this.head.getTopo();
        while (noAux!=null){
            ++cont;
            noAux=noAux.getProx();
        }
        return cont;
    }

    public void add(No noAdd){
        No noAux=this.head.getTopo();
        if (isEmpty()){
            this.head.setTopo(noAdd);
        }else{
            while (noAux.getProx()!=null){
                noAux=noAux.getProx();
            }
            noAux.setProx(noAdd);
        }
    }

    public void add(No noAdd, Integer index){
        if (index<=this.Count()){
            No noAux=this.head.getTopo();
            for (Integer i=1; i<index; i++){
                noAux=noAux.getProx();
            }
            noAdd.setProx(noAux.getProx());
            noAux.setProx(noAdd);
        }
        throw new RuntimeException("O índice informado é maior que o número de itens na lista");
    }

    public No Remove(){
        No noAux=this.head.getTopo();
        if (noAux!=null){
            this.head.setTopo(noAux.getProx());
            noAux.setProx(null);
            return noAux;
        }
        return null;
    }

    public No Remove(Integer index){
        if (!isEmpty()) {
            No noAux= this.head.getTopo();
            if (index==0){
                this.head.setTopo(noAux.getProx());
                return noAux;
            }
            No noAnt=null;
            while (noAux.getProx()!=null){
                noAnt=noAux;
                noAux=noAux.getProx();
            }
            noAnt.setProx(noAux.getProx());
            noAux.setProx(null);
            return noAux;
        }
        throw new RuntimeException("O índice informado é maior que o número de itens na lista");
    }

    public No Remove(No removeNo){
        if (!isEmpty()) {

            No noAux= this.head.getTopo();
            No noAnt=null;
            boolean equal=true;
            Integer contList=this.Count();
            Integer cont=0;

            if (noAux.equals(removeNo)){
                this.head.setTopo(noAux.getProx());
                return noAux;
            }
            while(!noAux.equals(removeNo)){
                cont++;
                noAnt=noAux;
                noAux=noAux.getProx();
                if (noAux==null || cont>contList){
                    break;
                }
                equal=noAux.equals(removeNo);
            }
            if (!equal){throw new RuntimeException("Objeto não encontrado na lista");}
            noAnt.setProx(noAux.getProx());
            return noAux;
        }
        throw new RuntimeException("O índice informado é maior que o número de itens na lista");
    }

    public String Stringify(){
        if (isEmpty()){ return "lista vazia";}
        No noAux=this.head.getTopo();
        String str="";
        while (noAux!=null){
            str+=noAux.toString()+"\n";
            noAux=noAux.getProx();
        }
        return str;
    }
}
