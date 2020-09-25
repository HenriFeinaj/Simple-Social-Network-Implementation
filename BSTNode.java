/**
 * Class used to create Binary search tree node for profile
 * @author 
 *
 */
public class BSTNode {

	//instance variables
	Profile data;
	BSTNode l;
	BSTNode r;
	
	//constructor
	public BSTNode(Profile data) {
		this.data = data;
	}

	//getter and setter methods
	public BSTNode getL() {
		return l;
	}

	public void setL(BSTNode l) {
		this.l = l;
	}

	public BSTNode getR() {
		return r;
	}

	public void setR(BSTNode r) {
		this.r = r;
	}

	public Profile getData() {
		return data;
	}
	
	
}
