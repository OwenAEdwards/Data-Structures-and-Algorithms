package data_structures;

// A queue is a FIFO (First In, First Out) ADT (Abstract Data Type) - TODO: what does this mean?

// Time complexities:
// Access: O(n) - TODO: why?
// Search: O(n) - TODO: why?
// Insertion: O(1) - TODO: why?
// Deletion: O(1) - TODO: why?

// Space complexity:
// O(n)

// A limitation of a queue is that you cannot push or pop elements in the middle of the stack.

// Example trace(s) (step-by-step):
// queue = [] (front = 0, rear = -1; empty since rear < front)
// queue.enqueue(7)
// queue = [7] (front = 0, rear = 0)
// queue.enqueue(3)
// queue = [7, 3] (front = 0, rear = 1)
// queue.dequeue()
// queue = [3] (front = 1, rear = 1)
// queue.peek() -> 3
// queue.dequeue()
// queue = [] (front = 2, rear = 1; empty since rear < front)
// TODO: Complete trace example

// Variations - there are several different types of queues and combinations of them, here are some common ones:
// 1. Simple/Linear Queue: a basic queue where elements are inserted at the rear and removed from the front (the one implemented below).
// 2. Circular Queue: a queue that uses a circular array to avoid the overhead of shifting elements (used in OS process scheduling).
// 3. Priority Queue: a queue where elements are removed based on their priority (also used in OS process scheduling).
// 4. Double-ended Queue (Deque): a queue where elements can be inserted and removed from both the front and rear.

// Implementations: a queue can be implemented with an array or a linked list. 
// The array implementation is more common due to its simplicity and efficiency.
// The linked list implementation is more flexible and can grow dynamically (if more size is needed).

// Real-world applications:
// TODO: Complete real-world applications (talk about BFS, schedulers, scripting, buffers, networks, multi-threading etc.)

public class Queue {
  private int[] queue; // Queue implementation using an array
  private int front; // Index of the front element
  private int rear; // Index of the rear element
  private int size;

  // Constructor to initialize the queue with a given size
  public Queue(int size) {
    this.size = size;
    this.queue = new int[size];
    this.front = 0; // Initialize the front index to 0
    this.rear = -1; // Initialize the rear index to -1
  }

  // Check if the queue is empty (when rear index is less than front index)
  public boolean isEmpty() {
    return rear < front;
  }

  // Check if the queue is full (when rear index is equal to the size - 1)
  public boolean isFull() {
    return rear == size - 1;
  }

  // Add a new element to the rear of the queue
  public void enqueue(int value) {
    // Check if the queue is full before adding a new element
    if (isFull()) {
      System.out.println("Queue is full");
      return;
    }

    // Increment the rear index and add the new element to the queue
    rear++;
    queue[rear] = value;
  }

  // Remove and return the front element from the queue
  public int dequeue() {
    // Check if the queue is empty before removing an element
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }

    // Return the front element and increment the front index
    int oldFrontValue = queue[front];
    front++;
    return oldFrontValue;
  }

  // Return the front element of the queue without removing it
  public int peek() {
    // Check if the queue is empty before returning the front element
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }

    // Return the front element
    return queue[front];
  }

  // Print the elements of the queue
  public void print() {
    // Check if the queue is empty before printing the elements
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return;
    }

    // Print the elements of the queue from front to rear
    for (int i = front; i <= rear; i++) {
        System.out.print(queue[i] + " ");
      }
      System.out.println();
    }

    public static void testQueue() {
      Queue queue = new Queue(5);
  
      queue.enqueue(7);
      queue.enqueue(3);
      queue.enqueue(9);
      queue.enqueue(5);
      queue.enqueue(2);
  
      queue.print();
  
      queue.dequeue();
      queue.dequeue();
  
      queue.print();
  
      System.out.println("Front element: " + queue.peek());
    }
}