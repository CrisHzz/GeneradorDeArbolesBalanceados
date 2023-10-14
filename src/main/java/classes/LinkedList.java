package classes;

public class LinkedList {
    node head;
    int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(int data) {
        node node1 = new node(data);
        if (head == null) {
            head = node1;
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node1;
        }
        size++;

    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index > size) {
            return -1;
        }
        node current = head;
        int counter = 0;
        while (counter < index) {
            current = current.next;
            counter++;
        }
        return current.value;
    }

}