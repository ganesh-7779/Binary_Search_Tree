/*************************************************
 * Purpose: Implementation of Binary search tree
 * @author Ganesh Gavhad
 * @varsion 1.0
 *************************************************/
package com.bridgelabz;

public class Runner {
	public static void main(String[] args) {
		BinarySearchTree<Integer> element = new BinarySearchTree<>();
		element.add(56);
		element.add(30);
		element.add(70);
		element.printNodes();
	}
}