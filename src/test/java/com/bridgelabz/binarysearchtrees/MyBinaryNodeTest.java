package com.bridgelabz.binarysearchtrees;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class MyBinaryNodeTest {

	private MyBinaryTree<Integer> tree;

	@Before
	public void setUp() {
		tree = new MyBinaryTree<>();
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		tree.insert(22);
		tree.insert(40);
		tree.insert(60);
		tree.insert(95);
		tree.insert(11);
		tree.insert(3);
		tree.insert(16);
		tree.insert(65);
		tree.insert(63);
		tree.insert(67);
	}

	@Test
	public void testSize() {
		assertEquals(13, tree.size());
	}

	@Test
	public void testLeafNodeCount() {
		assertEquals(6, tree.leafNodeCount());
	}

	@Test
	public void testLeftAndRightNodes() {
		MyBinaryNode<Integer> root = tree.getRoot();

		// Check the left nodes
		assertEquals(30, root.getLeft().getKey().intValue());
		assertEquals(22, root.getLeft().getLeft().getKey().intValue());
		assertEquals(40, root.getLeft().getRight().getKey().intValue());
		assertEquals(11, root.getLeft().getLeft().getLeft().getKey().intValue());
		assertEquals(3, root.getLeft().getLeft().getLeft().getLeft().getKey().intValue());
		assertEquals(16, root.getLeft().getLeft().getLeft().getRight().getKey().intValue());

		// Check the right nodes
		assertEquals(70, root.getRight().getKey().intValue());
		assertEquals(60, root.getRight().getLeft().getKey().intValue());
		assertEquals(95, root.getRight().getRight().getKey().intValue());
		assertEquals(65, root.getRight().getLeft().getRight().getKey().intValue());
		assertEquals(67, root.getRight().getLeft().getRight().getRight().getKey().intValue());
		assertEquals(63, root.getRight().getLeft().getRight().getLeft().getKey().intValue());

	}

	@Test
	public void testSearch() {
		assertEquals(new Integer(63), tree.search(63).getKey());
	}

}