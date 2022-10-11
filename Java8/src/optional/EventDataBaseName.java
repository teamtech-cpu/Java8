package optional;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EventDataBaseName {

	public static List<Customer> getAll(){
		return Stream.of(
				new Customer(101,"john","john.mk@gmail.com",Arrays.asList("9058384","6739936")),
				new Customer(102,"abhi","abhi.jk@gmail.com",Arrays.asList("37684","68796906")),
				new Customer(103,"sai","sai.jk@gmail.com",Arrays.asList("56737684","6879906")),
				new Customer(104,"pani","pani.jk@gmail.com",Arrays.asList("76337684","796906"))
				).collect(Collectors.toList());
		
	}
}
