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

  public static boolean checkPalindromeLL(Node head) {
    /**
     * ALgo: first find the length then find middle ,then
     * if length is even then take middle length/2.
     * if length is odd then take middle (length+1)/2.
     */
    int length = BasicLL.sizeLL(head);
    int mid = length / 2;
    Node temp = head;
    for (int i = 0; i < mid; i++) {
      temp = temp.next;
    }
    Node reversed = BasicLL.reverseLL(temp);
    Node first = head;
    while (first != null && reversed != null) {
      if (first.data != reversed.data)
        return false;
      reversed = reversed.next;
      first = first.next;
    }
    // BasicLL.printLL(reversed);
    return true;
  }

  public static Node deleteFromLastLL(Node head, int pos) {
    Node rev = BasicLL.reverseLL(head);
    Node temp = rev;
    for (int i = 1; i < pos - 1; i++) {
      temp = temp.next;
    }
    Node joiner = temp.next.next;
    temp.next = joiner;
    return BasicLL.reverseLL(rev);
  }

  public static Node removeDuplicates(Node head) {
    Node temp = head;
    while (temp != null && temp.next != null) {
      if (temp.data == temp.next.data) {
        temp.next = temp.next.next;
      } else {
        temp = temp.next;
      }
    }
    return head;
  }

  public static int middleLL(Node head) {
    Node fast = head;
    Node slow = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow.data;
  }

}