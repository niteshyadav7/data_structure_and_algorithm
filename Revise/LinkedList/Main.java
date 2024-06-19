public class Main {
  public static void main(String[] args) {
    int A[] = { 11, 12, 13, 14, 15 };
    Node x1 = new Node(A[0]);
    Node x2 = new Node(A[1]);
    Node x3 = new Node(A[2]);
    Node x4 = new Node(A[3]);
    Node x5 = new Node(A[4]);
    x1.next = x2;
    x2.next = x3;
    x3.next = x4;
    x4.next = x5;

    BasicLL.printLL(x1);
    // System.out.println(BasicLL.insertLL(x1, 100, 0));
    // BasicLL.printLL(BasicLL.insertLL(x1, 100, 3));
    BasicLL.printLL(BasicLL.deleteLL(x1, 0));
  }
}
