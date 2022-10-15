package Functional_Interface.Sample;
@FunctionalInterface
public interface SampleInterface {
	 void test(String msg);
	 //public int test1(int id);
	 static void test1() {
		 System.out.println("");
	 }
	 static void test2() {
		System.out.println("hi this is venkat"); 
	 }
	 default void test3() {
		 System.out.println("this is naveen");
	 }
}
