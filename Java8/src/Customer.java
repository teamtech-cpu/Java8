import java.util.List;

/**
 * 
 */

/**
 * @author UD70BC
 *
 */
public class Customer {

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String email, List<String> phoneNumbers) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}

	private int id;
	
	private String Name;
	
	private String email;
	
	 private List<String> phoneNumbers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
}
