public class No<T> {

    public No(T generico) {
        this.num=generico;
        this.refNo=null;
    }

    public T num;
    public No<T> refNo;

    @Override
    public String toString() {
        return "No{" +
                "num=" + num +
                ", refNo=" + refNo +
                '}';
    }
}
