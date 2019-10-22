package com.ydag.test;
/**
 * �������Ľڵ�
 * @author Administrator
 *
 */
public class Node {

	Object data;
	Node leftChild;
	Node rightChild;
	
	
	public Node() {
		super();
	}


	public Node(Object data) {
		super();
		this.data = data;
	}


	public Node(Object data, Node leftChild, Node rightChild) {
		super();
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}


	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}


	public Node getLeftChild() {
		return leftChild;
	}


	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}


	public Node getRightChild() {
		return rightChild;
	}


	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}


	@Override
	public String toString() {
		return "Node [data=" + data + ", leftChild=" + leftChild
				+ ", rightChild=" + rightChild + "]";
	}
	
	
	
	
}
