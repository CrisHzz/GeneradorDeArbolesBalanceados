package classes;

public class Queue {
    NodeIntTree first;
    NodeIntTree last;
    int size;

    public Queue() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(NodeIntTree newNode) {
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.kidRight = newNode; 
            last = newNode;
        }
        size++;
    }

    public NodeIntTree dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        NodeIntTree temp = first;
        first = first.kidRight; 
        size--;
        return temp;
    }

    public void display() {
        displayR(first);
    }

    private void displayR(NodeIntTree current) {
        if (current == null) {
            return;
        }
        System.out.print(current.value + " ");
        displayR(current.kidRight); 
    }
}
