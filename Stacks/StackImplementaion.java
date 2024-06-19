package Stacks;

public class StackImplementaion {
  /**
   * create the stacks using the array
   * so we need size of array then an array
   * then top =-1
   * 
   */
  /**
   * private int size;
   * private int[] stack;
   * private int top;
   * 
   * // creating the constructor
   * public StackImplementaion(int size) {
   * this.size = size;
   * this.stack = new int[size];
   * this.top = -1;
   * }
   * 
   * // now creating the method for push
   * void push(int x) {
   * top++;
   * stack[top] = x;
   * }
   * 
   * // now creating the method for pop
   * int pop() {
   * top--;
   * return stack[top];
   * }
   * 
   * // creating the method for find the size
   * int length() {
   * return top + 1;
   * }
   * 
   * // creating the peek
   * int peek() {
  //  * top--;
   * return stack[top];
   * }
   * 
   * // main funvtion
   * public static void main(String[] args) {
   * StackImplementaion stack = new StackImplementaion(10);
   * stack.push(11);
   * stack.push(12);
   * stack.push(13);
   * stack.push(14);
   * System.out.println(stack.length());
   * }
   */
  Node top = null;

  public void push(int data) {
    Node newNode = new Node(data);
    newNode.next = top;
    top = newNode;
  }

  public int pop() {
    int topdata = top.data;
    top = top.next;
    return topdata;
  }

  public int peek() {
    return top.data;
  }

  public static void main(String[] args) {

    StackImplementaion st = new StackImplementaion();
    st.push(12);
    st.push(14);
    st.pop();
    System.out.println(st.pop());
  }
}
