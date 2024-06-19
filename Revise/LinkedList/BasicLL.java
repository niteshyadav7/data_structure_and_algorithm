public class BasicLL {
  public static void printLL(Node x1) {
    Node temp = x1;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static int countSizeLL(Node head) {
    Node temp = head;
    int counter = 0;
    while (temp != null) {
      counter++;
      temp = temp.next;
    }
    return counter;
  }

  public static Node insertLL(Node head, int data, int pos) {
    Node temp = head;
    Node nn = new Node(data);
    if (pos == 0) {
      nn.next = temp;
      head = nn;
      return head;
    }
    for (int i = 1; i < pos - 1; i++) {
      temp = temp.next;
    }
    Node kPos = temp.next;
    temp.next = nn;
    nn.next = kPos;
    return head;
  }

  public static Node deleteLL(Node head, int pos) {
    Node temp = head;
    if (pos == 0) {
      return head.next;
    }
    for (int i = 1; i < pos - 1; i++) {
      temp = temp.next;
    }
    Node nxt = temp.next.next;
    temp.next = nxt;
    return head;
  }
  /**
   * let's say you want to insert at pos k=3 [1,2,3,newNode,4,5]
   * firstly go to K-1
   * 
   */
  // for (int i = 1; i <= pos - 1; i++) {
  // temp = temp.next;
  // }
  // temp.next = newData;
  // newData.next = temp.next;
  // return head;
}
