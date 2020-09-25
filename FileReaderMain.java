
public class FileReaderMain {

	public static void main(String[] args) {
		   
			FileReader reader = new FileReader();
			BST myBST = reader.readProfileSet("src/profiles_01.txt");
			myBST.printAlphabetical();
		
	}
}
