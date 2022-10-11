import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customer = EventDataBaseName.getAll();
		
		//List<Customer> converting to List<String> ->Data transformation 
		//Mapping :customer - > customer.getAllEmail();
		//customer -> customer.getEmail()
		
		List<String> emails = customer.stream()
				.map(customers -> customers.getEmail())
				.collect(Collectors.toList());
		System.out.println(emails);
		
		//customer -> customer.getPhoneNumbers() --> one to many mapping
		//customer -> customer.getPhoneNumbers
		
		List<List<String>> phoneNumber = customer.stream()
				.map(customers -> customers.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(phoneNumber);

		//List<Customer> converting to List<String> ->Data transformation
		//mapping :customer ->phoneNumbers

		List<String> phoneNummbers = customer.stream().flatMap(customers->customers.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(phoneNummbers);
	}

}
