package com.bridgelabz.binarysearchtrees;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MyBinaryNodeTest {

	private MyBinaryTree<Integer> tree;

	@Before
	public void setUp() {
		tree = new MyBinaryTree<Integer>();
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		tree.insert(22);
		tree.insert(40);
		tree.insert(60);
		tree.insert(95);
	}

	@Test
	public void testSize() {
		assertEquals(7, tree.size());
	}

	@Test
	public void testLeafNodeCount() {
		assertEquals(4, tree.leafNodeCount());
	}
}