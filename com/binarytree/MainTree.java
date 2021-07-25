package com.binarytree;


public class MainTree {

	public static void main(String[] args) {
		//creating instances
				BinaryTree bst = new BinaryTree();
				Node root = null;
				/*Inserting node in the Binary tree*/
				
				root = bst.insert(root, 56);
				root = bst.insert(root, 30);
				root = bst.insert(root, 70);
				bst.print(root);
				}
	}


