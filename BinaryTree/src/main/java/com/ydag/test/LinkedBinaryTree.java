package com.ydag.test;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedBinaryTree implements BinaryTree {

	private Node root;

	public LinkedBinaryTree() {
		super();
	}

	public LinkedBinaryTree(Node root) {
		super();
		this.root = root;
	}

	public void ergodicTree() {
		this.ergodicTree(root);
		System.out.println();
	}

	private void ergodicTree(Node root) {
		if(root == null){
			return;
		}
		//输出根节点的值
		System.out.print(root.data+"  ");
		//遍历左子树
		this.ergodicTree(root.leftChild);

		//遍历右子树
		this.ergodicTree(root.rightChild);

	}
}
