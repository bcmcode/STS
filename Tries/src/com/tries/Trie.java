package com.tries;

import java.util.Set;

public class Trie {
	public Node root;
	
	public Trie() {
		this.root = new Node();
	}
	
	public void insertWord(String word) {
		Node currentNode = this.root;
		
		for(int i=0; i<word.length(); i++) {
			Character currentLetter = word.charAt(i);
			Node child = currentNode.children.get(currentLetter);
			if(child == null) {
				child = new Node();
				currentNode.children.put(currentLetter, child);
			}
			currentNode = child;
		}
		currentNode.isCompleteWord = true;
	}
	
	public boolean isPrefixValid(String prefix) {
		Node currentNode = this.root;
		
		for(int i=0; i<prefix.length(); i++) {
			Character currentLetter = prefix.charAt(i);
			Node child = currentNode.children.get(currentLetter);
			if(child == null) {
				return false;
			}
			currentNode = child;
		}
		return true;
	}
	
	public boolean isWordValid(String word) {
		Node currentNode = this.root;
		
		for(int i=0; i<word.length(); i++) {
			Character currentLetter = word.charAt(i);
			Node child = currentNode.children.get(currentLetter);
			if(child == null) {
				return false;
			}
			currentNode = child;
		}
		if(currentNode.isCompleteWord) {
			return true;
		}
		return false;
	}
	
	private void printAllChildren(Node node) {
		if(node == null) {
			return;
		}
		Set<Character> keys = node.children.keySet();
		
		for(Character key : keys) {
			System.out.println(key);
			Node nextNode = node.children.get(key);
			this.printAllChildren(nextNode);
		}

	}
	
	public void printAllKeys() {
		Node top = this.root;
		this.printAllChildren(top);
	}
}
