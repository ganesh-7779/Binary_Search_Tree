/*************************************************
 * Purpose: Implementation of Binary search tree
 * @author Ganesh Gavhad
 * @varsion 1.0
 *************************************************/
package com.bridgelabz;

public class BinarySearchTree<k extends Comparable<k>> {
	MyBinaryNode<k> root;

	/**
	 * adding key to the tree
	 */
	public void add(k key) {
		this.root = this.insert(root, key);
	}

	/**
	 * @param root  is a root key for left and right side key
	 * @param value is value / data of tree node
	 * @return Adding key to the node of tree
	 */
	private MyBinaryNode<k> insert(MyBinaryNode<k> root, k value) {
		if (root == null) {
			return new MyBinaryNode<>(value);
		}
		int compareResult = value.compareTo(root.value);
		if (compareResult == 0) {
			return root;
		}
		if (compareResult < 0) {
			root.left = insert(root.left, value);
		} else if (compareResult > 0) {
			root.right = insert(root.right, value);
		}
		return root;

	}
	public int  getSize() {
		return this.getSizeRecursive(root);
	}
	public int getSizeRecursive(MyBinaryNode<k> root) {
		if(root==null) {
			return 0;	
		}
		return 1 + getSizeRecursive(root.left)+getSizeRecursive(root.right);
	}

	/**
	 * It displays the node
	 */

	public void printNodes() {
		printNodes(root);
	}

	private void printNodes(MyBinaryNode<k> root) {
		if (root != null) {
			printNodes(root.left);
			System.out.println(root.value);
			printNodes(root.right);

		}
	}
}
