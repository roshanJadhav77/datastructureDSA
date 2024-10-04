package com.datastructure.datastructureDSA.scenario.node;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Node {

    public int val;
    public List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public Node(int _val, List<Node> _children){
        val = _val;
        children = _children;
    }
}
