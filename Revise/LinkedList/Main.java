public class Main {
  public static void main(String[] args) {
    int A[] = { 1, 2, 3, 4, 5 };
    Node head = new Node(A[0]);
    Node temp = head;
    for (int i = 1; i < A.length; i++) {
      Node x = new Node(A[i]);
      temp.next = x;
      temp = temp.next;
    }
    // System.out.println(head.next.next.data);
    // Node x1 = new Node(A[0]);
    // Node x2 = new Node(A[1]);
    // Node x3 = new Node(A[2]);
    // Node x4 = new Node(A[3]);
    // Node x5 = new Node(A[4]);
    // x1.next = x2;
    // x2.next = x3;
    // x3.next = x4;
    // x4.next = x5;

    // BasicLL.printLL(x1);
    // System.out.println(BasicLL.insertLL(x1, 100, 0));
    // BasicLL.printLL(BasicLL.insertLL(x1, 100, 3));
    // BasicLL.printLL(BasicLL.reverseLL(x1));
    // System.out.println("Size of the linkedList is " + BasicLL.sizeLL(x1));
    // BasicLL.printLL(x1);
    // BasicLL.printLL(BasicLL.insertLL(x1, 3,100));
    // BasicLL.printLL(BasicLL.reverseLL(x1));
    // BasicLL.printLL(head);
    // BasicLL.printLL(BasicLL.deleteFromLastLL(head, 2));
    // System.out.println();
    BasicLL.printLL(BasicLL.removeDuplicates(head));

  }
}
