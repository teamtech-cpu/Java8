package Functional_Interface;

import java.util.function.Consumer;

class ConsumerI implements Consumer<String>{

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}

	/*
	 * @Override public void accept(String t) { // TODO Auto-generated method stub
	 * System.out.println(t); }
	 */
}

public class ConsumerImpl {
public static void main(String[] args) {
	/*
	 * Consumer<String>consumer=new ConsumerI(); consumer.accept("Hellowworld");
	 */
	Consumer<String>consumer1=(s)->System.out.println(s);
	consumer1.accept("Hari");
}
}
