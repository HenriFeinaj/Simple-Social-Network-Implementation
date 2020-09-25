
public class AlphaMain {

	public static void main(String[] args) {
		String[] interest = {"football","Reading"};
		String[] activities = {"walking","playing"};
		Profile profile = new Profile("Clark","Tom",4,05,1999, "clark@yahoo.com", interest, activities);
		Profile profile2 = new Profile("Addy","Mick",14,10,2000, "addy@yahoo.com", interest, activities);
		BST bst = new BST();
		
		bst.insertProfile(profile);
		bst.insertProfile(profile2);
		bst.printAlphabetical();
	}
}
