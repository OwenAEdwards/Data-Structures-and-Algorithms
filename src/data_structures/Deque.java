package data_structures;

// Deque stands for doubly-ended queue.
// A deque is both FIFO and LIFO, you can add or remove from both ends of the deque.

// Example trace(s) (step-by-step):
// TODO: Complete trace example

// Real-world applications:
// TODO: Complete real-world applications

// NOTE: This implementation uses a fixed-size array (circular) to store the elements of the deque.
public class Deque {
  private int[] deque;
  private int front;
  private int rear;
  private int size;
  private int capacity;

  public Deque(int capacity) {
    this.capacity = capacity; // Set the largest possible capacity of the deque (fixed size of the array)
    this.deque = new int[capacity];
    this.front = 0; // Initialize the front index to 0
    this.rear = -1; // Initialize the rear index to -1
    this.size = 0; // Initialize the size of the deque to 0
  }

  // Check if the deque is empty (when the size is 0)
  public boolean isEmpty() {
    return size == 0;
  }

  // Check if the deque is full (when the size is equal to the capacity)
  public boolean isFull() {
    return size == capacity;
  }

  // Add a new element to the front of the deque
  public void insertFront(int value) {
    if (isFull()) {
      System.out.println("Deque is full");
      return;
    }

    // Decrement the front index in a circular manner and add the new element to the deque
    front = (front - 1 + capacity) % capacity; // Decrement the front index in a circular manner
    deque[front] = value;
    size++;
  }

  public void insertRear(int value) {
    // Check if the deque is full before adding a new element
    if (isFull()) {
      System.out.println("Deque is full");
      return;
    }

    // Increment the rear index in a circular manner and add the new element to the deque
    rear = (rear + 1) % capacity; // Increment the rear index in a circular manner
    deque[rear] = value;
    size++;
  }

  // Remove and return the front element from the deque
  public int deleteFront() {
    // Check if the deque is empty before removing an element
    if (isEmpty()) {
      System.out.println("Deque is empty");
      return -1;
    }

    // Return the front element and increment the front index in a circular manner
    int value = deque[front];
    front = (front + 1) % capacity; // Increment the front index in a circular manner
    size--;
    return value;
  }

  // Remove and return the rear element from the deque
  public int deleteRear() {
    // Check if the deque is empty before removing an element
    if (isEmpty()) {
      System.out.println("Deque is empty");
      return -1;
    }

    // Return the rear element and decrement the rear index in a circular manner
    int value = deque[rear];
    rear = (rear - 1 + capacity) % capacity; // Decrement the rear index in a circular manner
    size--;
    return value;
  }

  // Return the front element of the deque without removing it (similar to peek)
  public int getFront() {
    // Check if the deque is empty before returning the front element
    if (isEmpty()) {
      System.out.println("Deque is empty");
      return -1;
    }

    return deque[front];
  }

  // Return the rear element of the deque without removing it (similar to peek)
  public int getRear() {
    // Check if the deque is empty before returning the rear element
    if (isEmpty()) {
      System.out.println("Deque is empty");
      return -1;
    }

    return deque[rear];
  }

  // Return the current size of the deque
  public int getSize() {
    return size;
  }

  // Print the elements of the deque
  public void printDeque() {
    // Check if the deque is empty before printing the elements
    if (isEmpty()) {
      System.out.println("Deque is empty");
      return;
    }

    // Print the elements of the deque from front to rear
    int i = front;
    while (i != rear) {
      System.out.print(deque[i] + " ");
      i = (i + 1) % capacity; // Increment the index in a circular manner
    }
    System.out.println(deque[rear]);
  }

  static public void testDeque() {
    Deque deque = new Deque(5);

    deque.insertFront(1);
    deque.insertFront(2);
    deque.insertRear(3);
    deque.insertRear(4);
    deque.insertFront(5);

    deque.printDeque(); // 5 2 1 3 4

    System.out.println(deque.deleteFront()); // 5
    System.out.println(deque.deleteRear()); // 4

    deque.printDeque(); // 2 1 3

    System.out.println(deque.getFront()); // 2
    System.out.println(deque.getRear()); // 3

    System.out.println(deque.getSize()); // 3
  }
}