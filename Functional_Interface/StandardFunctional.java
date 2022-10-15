package Functional_Interface;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctional {
	public static void main(String[] args) {
		List<Person>people=Arrays.asList(
				new Person("kiran","kumar",40),
				new Person("sai","kumar",30),
				new Person("sekhar","mucharla",42),
				new Person("viny","nara",20)
				);
		//if we want sort the based on only lastName
		Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		//to print all employess list
		performFunctionalOperation(people,p->true,p->System.out.println(p));
		//to print employess whose firstname start with  s
		performFunctionalOperation(people,p->p.getLastName().startsWith("k"),p->System.out.println(p.getLastName()));
	}
	
	private static void performFunctionalOperation(List<Person> people,Predicate<Person> predicate
			,Consumer<Person>consumer) {
		for(Person p:people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
		
	}

}
