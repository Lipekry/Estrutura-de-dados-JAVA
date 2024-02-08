public class Main {
    public static void main(String[] args) {
        No<String> node = new No<String>("1");
        No<String> node2 = new No<String>("2");
        node.refNo = node2;
        System.out.println(node.toString());
    }
}