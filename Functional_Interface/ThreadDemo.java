package Functional_Interface;
class ThreadSample implements Runnable{

	@Override
	public void run() {
System.out.println("Hi This is kiran");		
	}
	
}
public class ThreadDemo {
public static void main(String[] args) {
	Thread thread=new Thread(new ThreadSample());
	thread.start();
	
	Runnable runnable=()->{
		System.out.println("Hii I am naveen");
	};
	
	Thread threadDemo=new Thread(runnable);
	threadDemo.start();
}
}
