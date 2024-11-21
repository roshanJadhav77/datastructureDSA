package com.datastructure.datastructureDSA.scenario.node;

public class TestMain {
    public static void main(String[] args) {
        Node root = new Node(1);

        //create n-ary tree
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.get(1).children.add(new Node(4));
        root.children.get(1).children.add(new Node(5));

        Codec codec = new Codec();
        String serialiseData = codec.serialise(root);
        System.out.println("Serialised: "+serialiseData);

        Node deserialiseTree = codec.deserialise(serialiseData);
        System.out.println("deserialiseTree: "+deserialiseTree);

        String reserialiseData = codec.serialise(deserialiseTree);
        System.out.println("re-serialised: "+reserialiseData);

    }
}
