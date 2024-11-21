package com.datastructure.datastructureDSA.scenario.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Codec {
    // Method to serialize an n-ary tree to a string

    public String serialise(Node root){
        StringBuilder stringBuilder = new StringBuilder();
        serializeHelper(root, stringBuilder);
        return stringBuilder.toString();
    }

    // Helper method for serialization (pre-order traversal)
    private void serializeHelper(Node node, StringBuilder sb) {
        if (node == null) {
            sb.append("# "); // Special character for null
            return;
        }

        // Append the value of the node and the number of its children
        sb.append(node.val).append(" ").append(node.children.size()).append(" ");

        // Recursively serialize each child
        for (Node child : node.children) {
            serializeHelper(child, sb);
        }
    }

    public Node deserialise(String data){
        if(data == null || data.isEmpty()){
            return null;
        }

        // Split the string into tokens
        String[] tokens = data.split("\\s+");
        LinkedList<String> queue = new LinkedList<>(Arrays.asList(tokens));
        return deserializeHelper(queue);

    }

    private Node deserializeHelper(LinkedList<String> queue) {
        String valStr = queue.poll();
        if(valStr.equals("#")){
            return  null;
        }

        // Create the current node
        int val = Integer.parseInt(valStr);
        int numChildren = Integer.parseInt(queue.poll());
        Node node = new Node(val);

        // Recursively deserialize each child
        for (int i = 0; i < numChildren; i++) {
            node.children.add(deserializeHelper(queue));
        }

        return node;
    }

}
