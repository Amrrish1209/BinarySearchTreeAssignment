package com.bridgelabz.binarysearchtrees;

public class MyBinaryTree<Key extends Comparable<Key>> {

	private MyBinaryNode<Key> root;

	public void insert(Key key) {
		root = insert(root, key);
	}

	private MyBinaryNode<Key> insert(MyBinaryNode<Key> node, Key key) {
		if (node == null) {
			return new MyBinaryNode<Key>(key);
		} else if (key.compareTo(node.key) < 0) {
			node.left = insert(node.left, key);
		} else if (key.compareTo(node.key) > 0) {
			node.right = insert(node.right, key);
		}
		return node;
	}

	public int size() {
		return size(root);
	}

	private int size(MyBinaryNode<Key> node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + size(node.left) + size(node.right);
		}
	}

	public int leafNodeCount() {
		return leafNodeCount(root);
	}

	private int leafNodeCount(MyBinaryNode<Key> node) {
		if (node == null) {
			return 0;
		} else if (node.left == null && node.right == null) {
			return 1;
		} else {
			return leafNodeCount(node.left) + leafNodeCount(node.right);
		}
	}

}
