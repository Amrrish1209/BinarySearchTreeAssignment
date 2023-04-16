package com.bridgelabz.binarysearchtrees;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyBinaryNodeTest {

	@Test
	public void testInsert() {
		MyBinaryNode<Integer> root = new MyBinaryNode<Integer>(56);
		root.insert(30);
		root.insert(70);

		assertEquals("Checking root key", Integer.valueOf(56), root.key);
		assertEquals("Checking left key", Integer.valueOf(30), root.left.key);
		assertEquals("Checking right key", Integer.valueOf(70), root.right.key);
	}
}
