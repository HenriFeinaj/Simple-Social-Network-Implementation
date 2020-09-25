/**
 * Binary Search Tree class use to create BST using BSTNode
 * 
 * @author
 *
 */
public class BST {

	// instance variable
	BSTNode root;

	// constructor
	public BST() {

		this.root = null;
	}

	/**
	 * Method used to insert new profile into BST
	 * @param p
	 */
	public void insertProfile(Profile p) {

		if (root == null) {

			root = new BSTNode(p);
		} else {
			insertProfile(root, p);
		}
	}

	/**
	 * Helper method to insert profile
	 * @param node
	 * @param p
	 * @return
	 */
	private BSTNode insertProfile(BSTNode node, Profile p) {

		if (node == null) { //if node is empty
			node = new BSTNode(p);
			//compare lastname
		} else if (p.getLastName().compareTo(node.getData().getLastName()) < 0) {
			node.l = insertProfile(node.getL(), p); //add into left node
			
			//compare lastname
		} else if (p.getLastName().compareTo(node.getData().getLastName()) > 0) {
			node.r = insertProfile(node.getR(), p);//add into right node
		}
		return node;//return node
	}
	
	/**
	 * Method used to print BST in alphabatic order
	 */
	public void printAlphabetical() {
        System.out.println("In-order Traversal:");
        printAlphabetical(root);
        System.out.println();
    }
	
	 /**
	  * helper method
	  * @param root
	  */
	 private void printAlphabetical(BSTNode root) {
	        if (root != null) {
	        	printAlphabetical(root.getL()); 
	            System.out.printf("%s ", root.data.toString());
	            printAlphabetical(root.getR());
	        }
	    }
}
