public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.link = newNode;
        }
        rear = newNode;
        rear.link = front;
    }

    public void deQueue() {
        if (isEmpty()) {
            return;
        }
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
            rear.link = front;
        }
    }
    public void printQueue() {
        if (isEmpty())
            System.out.println("Queue is empty");
        Node current = front;
        do{
            System.out.print(current.data + " ");
            current = current.link;
        } while (current != front);
        System.out.println();
    }
}
