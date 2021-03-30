
package model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;




/**
 * @author Jeremy Brannen - jrbrannen
 *CIS152
 * Mar 22, 2021
 */
public class Tree {
	
	private Node root;
	
	public Tree() {
		super();
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	/**
	 * if the root is null it inserts @ root. If root is not null
	 * method will make a temp node and compare it to the current
	 * node looping thru until there is a null value to insert the
	 * new node
	 * @param id
	 * @param name
	 */
	public void insert(int id, String name) {
		
		Node newNode = new Node();
		newNode.iData = id;
		newNode.sData = name;
		
		if(root == null) {
			root = newNode;
		}else {
			Node thisNode = root;
			Node tempNode;
			
			while(true) {
				
				tempNode = thisNode;
				if(name.compareTo(thisNode.sData) < 0) {
					thisNode = thisNode.left;
					if(thisNode == null) {
						tempNode.left = newNode;
						break;
					}
				}else {
					thisNode = thisNode.right;
					if(thisNode == null) {
						tempNode.right = newNode;
						break;
					}
					
				}
				
			}
			
		}
		
	}
	
	/**
	 * start with a temp node at the root and loops through all
	 * nodes going right or left depending on the value comparison.
	 * If found it will return the node. If not found it will return null
	 * @param lookingFor
	 * @return
	 */
	public Node search(String lookingFor) {
		
		Node tempNode = root;
		
		while(tempNode.sData != lookingFor) {
			if(lookingFor.compareTo(tempNode.sData) < 0) {
				tempNode = tempNode.left;
			}else {
				tempNode = tempNode.right;
			}
			if(tempNode == null) {
				return null;
			}
			
		}
		return tempNode;
		
	}
	
	/**
	 * bfs search put root node in the queue and compares it to looking for
	 * if not found it will add it's children to the queue and remove it from 
	 * the queue.  It repeats until found or until the queue is empty (not found)
	 * and then returns null
	 * 
	 * @param lookingFor
	 * @return node or null
	 */
	public Node bfsSearch(String lookingFor) {
		
		Queue<Node> searchNext = new LinkedList<Node>();
		Node tempNode = root;
		
		searchNext.add(tempNode);
		
		while(!searchNext.isEmpty()) {
			if(!tempNode.sData.equals(lookingFor)) {
				if(tempNode.left != null) {
					searchNext.add(tempNode.left);
				}
				if(tempNode.right != null) {
					searchNext.add(tempNode.right);
				}
				searchNext.remove();
				tempNode = searchNext.peek();
			}else {
				return tempNode;
			}
		}
		return null;		
	}
	
	/**
	 * DFS searches down the left side of tree until it reaches the deepest left node.  It will
	 * search the entire left subtree and then search the entire right subtree if 
	 * it wasn't found on the left side.  If it's not found on either the left or right
	 * it will return null
	 * @param lookingFor
	 * @return
	 */
	public Node dfsSearch(String lookingFor) {
		
		Stack<Node> searchNext = new Stack<Node>();
		Node tempNode = root;
		
		searchNext.push(tempNode);
		
		while(!searchNext.isEmpty()) {
			while(tempNode.left != null) {
				tempNode = tempNode.left;
				searchNext.push(tempNode);
			}
			tempNode = searchNext.pop();
			if(tempNode.sData.equals(lookingFor)) {
				return tempNode;
			}
			if(tempNode.right != null) {
				tempNode = tempNode.right;
				searchNext.push(tempNode);
			}
		}return null;

	}

	@Override
	public String toString() {
		return "Tree [root=" + root + "]";
	}
}
