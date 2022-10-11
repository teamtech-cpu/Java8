package optional;

import java.util.Arrays;
import java.util.List;

public class Optional {
	public static Customer getcustomerByEmailId(String email) {
		List<Customer> custom = EventDataBaseName.getAll();
		 return (Customer) custom.stream()
				 .filter(customer ->customer.getEmail().equals(email))
				 //.findAny().orElse(new Customer);
				 .findAny().get();
			
		
	}
	public static void main(String[] args) throws IllegalAccessException {
		Customer customer = new Customer(101, "john", null, Arrays.asList("732652735", "98424"));
		// empty
		java.util.Optional<Object> emp = java.util.Optional.empty();
		System.out.print(true);
		java.util.Optional.empty();
		// of
		java.util.Optional<String> customerOptional = java.util.Optional.of(customer.getEmail());
		System.out.println(customerOptional);
		// ofNullable
		java.util.Optional<String> customers = java.util.Optional.ofNullable(customer.getEmail());
		System.out.println(customers);
		/*
		 * if(emailOptional2.isPresent()){ System.out.println(emailOptional2.get()); }
		 */
// System.out.println(emailOptional2.orElse("default@email.com"));

// System.out.println(emailOptional2.orElseThrow(()->new IllegalArgumentException("email not present")));

		System.out.println(customers.orElseThrow(() -> new IllegalAccessException("customer not found exception")));
		System.out.println(customers.map(String::toUpperCase).orElseGet(() -> "default email..."));

		getCustomerByEmailId("pqr");
	}

	private static void getCustomerByEmailId(String string) {
		// TODO Auto-generated method stub

	}
}
