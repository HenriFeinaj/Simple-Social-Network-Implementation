
public class BSTNodeMain {

	public static void main(String[] args) {
		
		String[] interest = {"football","Reading"};
		String[] activities = {"walking","playing"};
		Profile profile = new Profile("Clark","Tom",4,05,1999, "clark@yahoo.com", interest, activities);
		
		BSTNode node = new BSTNode(profile);
		System.out.println(node.getData().toString());
	}
}
