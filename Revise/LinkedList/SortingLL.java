public class SortingLL {
  // given LinkedList you have to sort the
  // linkedList .
  /**
   * Algorithm:
   * first of all break the linkedList
   * from it's middle then sort using merge sort
   * then merge both linkedList
   */
  public static Node middleLL(Node head) {
    Node slow = head;
    Node fast = head;
    while (slow.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static Node merge(Node A, Node B) {
    // Create a dummy node to form the new sorted list
    Node dummy = new Node(0);
    Node current = dummy;

    // Traverse both lists and insert the smaller value into the new list
    while (A != null && B != null) {
      if (A.data <= B.data) {
        current.next = A;
        A = A.next;
      } else {
        current.next = B;
        B = B.next;
      }
      current = current.next;
    }

    // If one of the lists is not null, append it to the end of the new list
    if (A != null) {
      current.next = A;
    } else {
      current.next = B;
    }

    // The merged list is next to the dummy node
    return dummy.next;
  }

  public static Node mergeSort(Node head) {
    if (head == null || head.next == null)
      return head;
    Node mid = SortingLL.middleLL(head);
    Node temp = mid.next;
    mid.next = null;
    head = mergeSort(head);
    // BasicLL.printLL(head);
    temp = mergeSort(temp);
    // BasicLL.printLL(temp);
    return merge(head, temp);

  }
}
