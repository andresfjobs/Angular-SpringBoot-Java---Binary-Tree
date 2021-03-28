package com.btree.sortModel;

public class Node {

	public int key;
	public String name;
	
	public Node leftChild;
	public Node rightChild;
	
	public Node(int key, String name){
		
		this.key = key;
		this.name = name;
	
	}
	
	public String toString() {
	
	return name + " has a key " + key;
	
	}
}
