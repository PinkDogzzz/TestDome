package com.ydag.test;

public class TestBinaryTree {

	public static void main(String[] args) {
		//创建节点
		Node node5 = new Node(5);
		Node node4 = new Node(4, null, node5);
		Node node7 = new Node(7);
		Node node6 = new Node(6, null, node7);
		Node node3 = new Node(3);
		Node node2 = new Node(2,node3,node6);
		Node root = new Node(1,node4,node2); 
		//创建一颗二叉树
		BinaryTree btree = new LinkedBinaryTree(root);

		btree.ergodicTree();
		
	}
}
