class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    } 
}
 
class SinglyLinkedList{
    private Node head;

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
    }
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
        }
        temp.next = newNode;
    } 
    public void deleteFromBeginning(){
        if (head == null) {
            System.out.println("List empty");
            return;
            }
            head = head.next;
    }
    public void display(){
        if (head == null){
            System.out.println("List empty");
            return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
                }
                System.out.println("null");
        }
    public static void main (String[] args){
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);

        System.out.println("Linked list after insertions:");
        list.display();

        list.deleteFromBeginning();
        System.out.println("Linked List after deletion from beginning:");
        list.display();

    }    

}

