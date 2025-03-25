package data_structures;

// A stack is a LIFO (Last In, First Out) ADT (Abstract Data Type) - TODO: what does this mean?

// Time complexities:
// Access: O(n) - TODO: why?
// Search: O(n) - TODO: why?
// Insertion: O(1) - TODO: why?
// Deletion: O(1) - TODO: why?

// Space complexity:
// O(n)

// A limitation of a stack is that you cannot push or pop elements in the middle of the stack.

// Example trace(s) (step-by-step):
// stack = [-1]
// stack.push(7)
// stack = [7  (top of stack)
//         -1] (bottom of stack)
// TODO: Complete trace example

// Implementations: a stack can be implemented with an array or a linked list. 
// The array implementation is more common due to its simplicity and efficiency.
// The linked list implementation is more flexible and can grow dynamically (if more size is needed).

// Real-world applications:
// TODO: Complete real-world applications (talk about recursion, undo functionality, DFS, backtracking, compilers/parsing, etc.)

public class Stack {
  private int[] stack; // Stack implementation using an array
  private int top; // Index of the top element
  private int size;

  // Constructor to initialize the stack with a given size
  public Stack(int size) {
    this.size = size;
    this.stack = new int[size];
    this.top = -1; // Initialize the top index to -1 (the bottom of the stack)
  }

  // Check if the stack is empty (when top index is -1, we see the bottom of the stack)
  public boolean isEmpty() {
    return top == -1;
  }

  // Check if the stack is full (when top index is equal to the size - 1)
  public boolean isFull() {
    return top == size - 1;
  }

  // Push a new element onto the stack
  public void push(int value) {
    // Check if the stack is full before pushing a new element
    if (isFull()) {
      System.out.println("Stack is full");
      return;
    }

    // Increment the top index and add the new element to the stack
    top++;
    stack[top] = value;
  }

  // Pop the top element from the stack
  public int pop() {
    // Check if the stack is empty before popping an element
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
    }

    // Return the top element and decrement the top index
    int oldTopValue = stack[top];
    top--;
    return oldTopValue;
  }

  // Peek (return) the top element of the stack
  public int peek() {
    // Check if the stack is empty before peeking the top element
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
    }

    // Return the top element without removing it
    return stack[top];
  }

  // Display the elements of the stack
  public void display() {
    // Check if the stack is empty before displaying the elements
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return;
    }

    // Display the elements of the stack from top to bottom
    System.out.println("Stack elements:");
    for (int i = top; i >= 0; i--) {
      System.out.println(stack[i]);
    }
  }

  public static void testStack(String[] args) {
    Stack stack = new Stack(5);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    stack.display();

    System.out.println("Popped: " + stack.pop());
    System.out.println("Popped: " + stack.pop());

    stack.display();

    System.out.println("Peek: " + stack.peek());
  }
}
