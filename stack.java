/**
 * stack
 */
public class stack {

  int capacity;
  int[] st;
  int top;

  public stack(int capacity) {
    this.capacity = capacity;
    this.st = new int[capacity];
    this.top = -1;
  }

  // method for empty
  public boolean isEmpty() {
    return top == -1;
  }

  // method for full
  public boolean isFull() {
    return top == capacity - 1;
  }

  // method for push
  public void push(int x) {
    if (isFull())
      System.out.println("Stack is OverFlow");
    top++;
    st[top] = x;
  }

  // method for pop
  public int pop() {
    if (isEmpty())
      System.out.println("Stack is under flow.");
    top--;
    return st[top];
  }

  // method for peek
  public int peek() {
    // top--;
    if (isEmpty())
      System.out.println("Under Flow.");
    return st[top];
  }

  public static void main(String[] args) {
    stack st = new stack(10);
    st.push(12);
    st.push(11);
    st.pop();
    System.out.println(st.peek());
  }
}