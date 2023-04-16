package com.bridgelabz.binarysearchtrees;

public class MyBinaryTree<T extends Comparable<T>> {

	private MyBinaryNode<T> root;

	public void insert(T key) {
		if (root == null) {
			root = new MyBinaryNode<T>(key);
		} else {
			insert(key, root);
		}
	}

	private void insert(T key, MyBinaryNode<T> node) {
		if (key.compareTo(node.getKey()) < 0) {
			if (node.getLeft() == null) {
				node.setLeft(new MyBinaryNode<T>(key));
			} else {
				insert(key, node.getLeft());
			}
		} else {
			if (node.getRight() == null) {
				node.setRight(new MyBinaryNode<T>(key));
			} else {
				insert(key, node.getRight());
			}
		}
	}

	public MyBinaryNode<T> getRoot() {
		return root;
	}

	public int size() {
		return size(root);
	}

	private int size(MyBinaryNode<T> node) {
		if (node == null) {
			return 0;
		} else {
			return size(node.getLeft()) + 1 + size(node.getRight());
		}
	}

	public int leafNodeCount() {
		return leafNodeCount(root);
	}

	private int leafNodeCount(MyBinaryNode<T> node) {
		if (node == null) {
			return 0;
		} else if (node.getLeft() == null && node.getRight() == null) {
			return 1;
		} else {
			return leafNodeCount(node.getLeft()) + leafNodeCount(node.getRight());
		}
	}

}
