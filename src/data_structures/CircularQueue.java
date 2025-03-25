package data_structures;

// A circular queue is a queue that uses a circular array to avoid the overhead of shifting elements.
// It accomplishes it like this:
// front = (front + 1) % capacity
// rear = (rear + 1) % capacity

// Example trace(s) (step-by-step):
// TODO: Complete trace example

// Real-world applications:
// TODO: Complete real-world applications

public class CircularQueue {
  private int[] queue;
  private int front;
  private int rear;
  private int size;
  private int capacity;

  public CircularQueue(int capacity) {
    this.capacity = capacity; // Set the largest possible capacity of the queue (fixed size of the array)
    this.queue = new int[capacity];
    this.front = 0; // Initialize the front index to 0
    this.rear = -1; // Initialize the rear index to -1
    this.size = 0; // Initialize the size of the queue to 0
  }

  // Check if the circular queue is empty (when the size is 0)
  public boolean isEmpty() {
    return size == 0;
  }

  // Check if the circular queue is full (when the size is equal to the capacity)
  public boolean isFull() {
    return size == capacity;
  }

  // Add a new element to the rear of the circular queue
  public void enqueue(int value) {
    if (isFull()) {
      System.out.println("Queue is full");
      return;
    }

    // Increment the rear index in a circular manner and add the new element to the queue
    rear = (rear + 1) % capacity; // Increment the rear index in a circular manner
    queue[rear] = value;
    size++; // We stop when size == capacity (full)
  }

  // Remove and return the front element from the circular queue
  public int dequeue() {
    // Check if the circular queue is empty before removing an element
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }

    // Return the front element and increment the front index in a circular manner
    int value = queue[front];
    front = (front + 1) % capacity; // Increment the front index in a circular manner
    size--; // We stop when size == 0 (empty)
    return value;
  }

  // Return the front element of the circular queue without removing it
  public int peek() {
    // Check if the circular queue is empty before returning the front element
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }

    // Return the front element
    return queue[front];
  }

  // Print the elements of the circular queue
  public void display() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return;
    }

    int i = front; // Start from the front index
    System.out.print("Queue elements: ");
    while (i != rear) {
      System.out.print(queue[i] + " ");
      i = (i + 1) % capacity; // Increment the index in a circular manner
    }
    System.out.println(queue[rear]);
  }

  public static void testCircularQueue() {
    CircularQueue queue = new CircularQueue(5);

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    queue.display(); // Queue elements: 1 2 3 4 5

    queue.dequeue();
    queue.dequeue();
    queue.display(); // Queue elements: 3 4 5

    queue.enqueue(6);
    queue.enqueue(7);
    queue.display(); // Queue elements: 3 4 5 6 7

    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.display(); // Queue is empty

    queue.dequeue(); // Queue is empty
  }
}
