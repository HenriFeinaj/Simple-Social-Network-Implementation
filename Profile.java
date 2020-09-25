import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class is used to hold the User profile details
 * @author 
 *
 */
public class Profile {

	//instance variables
	private String lastName;
	private String firstName;
	private int day;
	private int month;
	private int year;
	private String email;
	private String[] interests;
	private String[] activities;
	private ArrayList<Profile> friends;
	
	//constructor
	public Profile(String lastName, String firstName, int day, int month, int year, String email, String[] interests,
			String[] activities) {
		
		this.lastName = lastName;
		this.firstName = firstName;
		this.day = day;
		this.month = month;
		this.year = year;
		this.email = email;
		this.interests = interests;
		this.activities = activities;
		this.friends = new ArrayList<>();
	}
	
	//setter and getter methods
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getInterests() {
		return interests;
	}

	public void setInterests(String[] interests) {
		this.interests = interests;
	}

	public String[] getActivities() {
		return activities;
	}

	public void setActivities(String[] activities) {
		this.activities = activities;
	}

	public ArrayList<Profile> getFriends() {
		return friends;
	}

	public void setFriends(ArrayList<Profile> friends) {
		this.friends = friends;
	}
	
	/**
	 * Method used to get DOB
	 * @return
	 */
	public String getDateOfBirth() {
		
		return this.day +"/"+this.month +"/"+this.year;
	}
	
	/**
	 * Method used to add new profile
	 * @param p
	 */
	public void addFriend (Profile p) {
		
		friends.add(p);
		
	}
	
	/**
	 * Method used to get specific friend
	 * @param i
	 * @return
	 */
	public Profile getFriend (int i) {
		
		return friends.get(i);
	}
	
	/**
	 * Find the number of friends
	 * @return
	 */
	public int numOfFriends () {
		
		return friends.size();
	}
	
	@Override
	public String toString() {
		
		return this.lastName +", " + this.firstName +", " +this.getDateOfBirth() +", " + Arrays.toString(this.interests)
		+", " + this.email +", " + Arrays.toString(this.activities) +"\n";
	}
	
	
	
	
}
