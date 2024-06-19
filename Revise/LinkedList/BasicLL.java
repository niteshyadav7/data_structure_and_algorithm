/**
 * BasicLL
 */
public class BasicLL {

  /**
   * Note: Whenever you apply any types of operation firstly store that variable
   * above , so that no error .
   * 
   * 
   * @param head
   * @return
   */

  // find the length of LinkedList
  public static int sizeLL(Node head) {
    int count = 0;
    Node temp = head;
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

  public static void printLL(Node head) {
    Node temp = head;
    while (temp != null) {
      if (temp.next == null) {
        System.out.print(temp.data);
      } else {
        System.out.print(temp.data + "->");
      }
      temp = temp.next;
    }
    System.out.println();
  }

  public static Node deleteLL(Node head, int pos) {
    Node temp = head;
    if (pos == 1) {
      temp = temp.next;
      head = temp;
      return head;
    }
    for (int i = 1; i < pos - 1; i++) {
      temp = temp.next;
    }
    Node joiner = temp.next.next;
    temp.next = joiner;
    return head;
  }

  public static Node insertLL(Node head, int pos, int data) {
    Node temp = head;
    Node nn = new Node(data);
    if (pos == 1) {
      nn.next = temp;
      head = nn;
      return head;
    }
    for (int i = 1; i < pos - 1; i++) {
      temp = temp.next;
    }
    Node joiner = temp.next;
    temp.next = nn;
    nn.next = joiner;
    return head;
  }

  public static Node reverseLL(Node head) {
    Node curr = head;
    Node prev = null;
    while (curr != null) {
      Node currNext = curr.next;
      curr.next = prev;
      prev = curr;
      curr = currNext;
    }
    return prev;
  }
}