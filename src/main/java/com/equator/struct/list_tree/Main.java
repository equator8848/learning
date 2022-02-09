package com.equator.struct.list_tree;

import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author: Equator
 * @Date: 2022/1/27 22:29
 **/

public class Main {

    @Data
    public static class Node {
        private Integer id;

        private Integer parentId;

        private String value;

        List<Node> children;
    }

    public static List<Node> getList() {
        List<Node> nodes = new ArrayList<>();

        Node node1 = new Node();
        node1.setId(1);
        node1.setParentId(null);
        node1.setValue("1");
        nodes.add(node1);

        Node node2 = new Node();
        node2.setId(2);
        node2.setParentId(1);
        node2.setValue("2");
        nodes.add(node2);


        Node node3 = new Node();
        node3.setId(3);
        node3.setParentId(1);
        node3.setValue("3");
        nodes.add(node3);


        Node node4 = new Node();
        node4.setId(4);
        node4.setParentId(2);
        node4.setValue("4");
        nodes.add(node4);

        Node node5 = new Node();
        node5.setId(5);
        node5.setParentId(2);
        node5.setValue("5");
        nodes.add(node5);

        return nodes;
    }

    public static Node listToTree(List<Node> nodes) {
        Map<Integer, Node> idMap = nodes.stream().collect(Collectors.toMap(Node::getId, Function.identity()));
        Node root = null;
        for (Node node : nodes) {
            if (node.getParentId() == null) {
                root = node;
                continue;
            }
            if (idMap.containsKey(node.getParentId())) {
                Node parent = idMap.get(node.getParentId());
                if (parent.getChildren() == null) {
                    parent.setChildren(new ArrayList<>());
                }
                parent.getChildren().add(node);
            }
        }
        return root;
    }

    public static List<Node> treeToList(Node root) {
        List<Node> result = new ArrayList<>();
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            Node node = deque.pollFirst();
            Node item = new Node();
            item.setId(node.id);
            item.setParentId(node.getParentId());
            item.setValue(node.getValue());
            result.add(item);
            if (node.getChildren() != null) {
                deque.addAll(node.getChildren());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Node> nodes = getList();
        System.out.println(nodes);

        System.out.println("--------------------");

        Node tree = listToTree(nodes);
        System.out.println(tree);

        System.out.println("--------------------");

        List<Node> list = treeToList(tree);
        System.out.println(list);
    }
}
