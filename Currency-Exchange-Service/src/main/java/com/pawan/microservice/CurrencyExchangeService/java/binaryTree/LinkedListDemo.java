package binaryTree;

public class LinkedListDemo {

    public static void main(String[] args) {

         /*
        Create two linked lists

        1st 3.6.9.15.30
        2nd 10.15.30

        15 is the intersection point
    */

        Node newNode;

        // Addition of new nodes
        Node head1 = new Node();
        head1.data = 10;

        Node head2 = new Node();
        head2.data = 3;

        newNode = new Node();
        newNode.data = 6;
        head2.next = newNode;

        newNode = new Node();
        newNode.data = 9;
        head2.next.next = newNode;

        newNode = new Node();
        newNode.data = 15;
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node();
        newNode.data = 30;
        head1.next.next = newNode;

        head1.next.next.next = null;

        int intersectionNode =LinkedListDSA.getIntesectionNode(head1, head2);

        System.out.print("intersectionNode::: " + intersectionNode);
    }
}
