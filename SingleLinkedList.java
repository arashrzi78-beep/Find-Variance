public class SingleLinkedList {
    Node head;

    public void addAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addBetween(int index, int data) {
        if (index < 0 || index > size()) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            addAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    public boolean search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public double findVariance() {
        if (head == null) {
            System.out.println("Empty List");
            return 0;
        }
        Node temp = head;
        int count =0;
        double sum = 0;
        while (temp != null) {
            sum=sum+temp.data;
            count++;
            temp = temp.next;
        }
        // average
        double avr =  sum/count;

        temp = head;
        double varianceSum = 0;
        while (temp != null) {
            varianceSum+=Math.pow(temp.data-avr,2);
            temp=temp.next;
        }
        return varianceSum/count;
    }

}
