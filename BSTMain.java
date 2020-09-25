
public class BSTMain {

	public static void main(String[] args) {
		
		String[] interest = {"football","Reading"};
		String[] activities = {"walking","playing"};
		Profile profile = new Profile("Clark","Tom",4,05,1999, "clark@yahoo.com", interest, activities);
		BST bst = new BST();
		
		bst.insertProfile(profile);
		bst.printAlphabetical();
	}
}
