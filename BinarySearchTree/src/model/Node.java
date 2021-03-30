/**
 * 
 */
package model;

/**
 * @author Jeremy Brannen - jrbrannen
 *CIS152
 * Mar 22, 2021
 */
public class Node {
	
	String sData;	// rep name
	int iData;		// rep place on top ten list
	Node left;		// left child
	Node right;		// right child
	
	public Node() {
		super();
	}

	public Node(String sData, int iData, Node left, Node right) {
		super();
		this.sData = sData;
		this.iData = iData;
		this.left = left;
		this.right = right;
	}

	public String getsData() {
		return sData;
	}

	public void setsData(String sData) {
		this.sData = sData;
	}

	public int getiData() {
		return iData;
	}

	public void setiData(int iData) {
		this.iData = iData;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [sData=" + sData + ", iData=" + iData + "]";
	}	

}
