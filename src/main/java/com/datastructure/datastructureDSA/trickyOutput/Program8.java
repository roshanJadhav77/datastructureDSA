package com.datastructure.datastructureDSA.trickyOutput;

// Input: head: 1 -> 3 -> 4 -> 3
// Output: true
public class Program8 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        head.next.next.next = head.next; // 4 -> 3

        System.out.println(hasLoop(head));

    }

    public  static boolean hasLoop(Node head){
        Node node1 = head;
        Node node2 = head;

        while(node2 != null && node2.next != null){
            node1 = node1.next;
            node2 = node2.next.next;

            if(node1 == node2){
                return true;
            }
        }

        return false;

    }
}
