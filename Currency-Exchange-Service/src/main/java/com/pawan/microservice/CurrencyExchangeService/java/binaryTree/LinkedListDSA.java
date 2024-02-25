package binaryTree;

public class LinkedListDSA {

    static int getIntesectionNode(Node head1, Node head2)
    {


        // 1nd 10.15.30
        // 2st 3.6.9.15.30
        Node current1 = head1;
        Node current2 = head2;

        if (current1 == null || current2 == null ) {
            return -1;
        }


        while (current1 != null && current2 != null && current1 != current2)
        {
            current1 = current1.next;
            current2 = current2.next;

            if (current1 == current2) {
                return current1.data;
            }

            if (current1 == null ) {
                current1 = head2;
            }
            if (current2 == null ) {
                current2 = head1;
            }
        }

        return current1.data;
    }
}
