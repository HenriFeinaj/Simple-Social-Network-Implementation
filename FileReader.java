import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class used to read data from input file and form the BST 
 * @author 
 *
 */
public class FileReader {

	
	/**
	 * Method used to read file and populate the profile from file into bst
	 * @param filename
	 * @return
	 */
	public BST readProfileSet (String filename) {
		File inFile = new File(filename);
		BST bst = new BST();
		Scanner scanner = null;  

        try 
        {
            scanner = new Scanner(inFile);
            
            while(scanner.hasNextLine())
            {
            	
            String line = scanner.nextLine().trim(); //read line
            
            Scanner scannerB =  new Scanner(line);
            scannerB.useDelimiter(",");
            Profile myProfile = null;
            while (scannerB.hasNext()) {
            	
            	System.out.println();
            	String lname = replaceSign(scannerB.next());
            	String fname = replaceSign(scannerB.next());
            	int d = Integer.parseInt(replaceSign(scannerB.next()));
            	int m = Integer.parseInt(replaceSign(scannerB.next()));
            	int y = Integer.parseInt(replaceSign(scannerB.next()));
            	String email = replaceSign(scannerB.next());
            	String interest = scannerB.next();
            	String[] interestArray = interest.split(";");
            	String activity = scannerB.next();
            	String[] activityArray = activity.split(";");
            	
            	myProfile = new Profile(lname, fname, d, m, y, email, interestArray, activityArray);
            	bst.insertProfile(myProfile);//insert profile to BST
            }
            
            }
           
        }
        catch(FileNotFoundException ex)
        {
            System.err.println("\n\n*** FileNotFoundException ***");
            System.err.println("Data file <" + filename + "> does NOT exist");
            System.err.println("Please try again");

        }  
	  
	  
	  
	  return bst;
		
	}
	
	/**
	 * Method used to replace < > sign from string
	 * @param txt
	 * @return
	 */
	public static String replaceSign(String txt) {
		
		String newString = "";
		newString = txt.substring(1, txt.length()-1);
		return newString;
	}
	
	public void printBST() {
		
	}
	
	
}
