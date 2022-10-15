package Functional_Interface;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{

	@Override
	public Integer apply(String t) {
		return t.length();
	}

	/*
	 * @Override public Integer apply(String t) { // TODO Auto-generated method stub
	 * return t.length(); }
	 */
	
}
public class FunctionDemo {
	public static void main(String[] args) {
		/*
		 * Function<String, Integer>function=new FunctionImpl();
		 * System.out.println(function.apply("Ramesh"));
		 */
		/*
		 * Function<String,Integer>function=(String s)->s.length();
		 * System.out.println(function.apply("Kiran"));
		 */
	}

}
