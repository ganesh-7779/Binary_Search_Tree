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
		element.add(22);
		element.add(40);
		element.add(60);
		element.add(95);
		element.add(11);
		element.add(65);
		element.add(3);
		element.add(16);
		element.add(63);
		element.add(67);
		element.printNodes();
		int size = element.getSize();
		System.out.println("Size of tree "+" " +size);
		boolean search = element.search(63);
		System.out.println("it is node of tree ? True/false : " +search);

	}
}