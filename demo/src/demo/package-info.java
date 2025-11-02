package demo;




#include <iostream>

const int MAX_SIZE = 100; // Maximum size of the queue

class Queue {
private:
    int arr[MAX_SIZE];
    int front, rear;

public:
    // Constructor to initialize the queue
    Queue() : front(-1), rear(-1) {}

    // Function to check if the queue is full
    bool isFull() {
        return (rear == MAX_SIZE - 1);
    }

    // Function to check if the queue is empty
    bool isEmpty() {
        return (front == -1 && rear == -1);
    }

    // Function to enqueue (insert) an element into the queue
    void enqueue(int value) {
        if (isFull()) {
            std::cout << "Queue is full. Cannot enqueue." << std::endl;
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }

        arr[rear] = value;
        std::cout << "Enqueued: " << value << std::endl;
    }

    // Function to dequeue (remove) an element from the queue
    void dequeue() {
        if (isEmpty()) {
            std::cout << "Queue is empty. Cannot dequeue." << std::endl;
            return;
        }

        int dequeuedValue = arr[front];

        if (front == rear) {
            // Last element in the queue
            front = rear = -1;
        } else {
            front++;
        }

        std::cout << "Dequeued: " << dequeuedValue << std::endl;
    }
};

int main() {
    // Example usage
    Queue myQueue;

    std::cout << "Is the queue empty? " << (myQueue.isEmpty() ? "Yes" : "No") << std::endl;

    myQueue.enqueue(10);
    myQueue.enqueue(20);
    myQueue.enqueue(30);

    std::cout << "Is the queue full? " << (myQueue.isFull() ? "Yes" : "No") << std::endl;

    myQueue.dequeue();
    myQueue.dequeue();
    myQueue.dequeue();
    myQueue.dequeue(); // This will print an error message

    return 0;
}

