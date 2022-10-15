package Functional_Interface;

public class CalcuSample {
public static void main(String[] args) {
	Square square=(int x)->x*x;
	System.out.println(square.calculate(5));
	
	Square square1=(int x)->{
		if(x%2==0) {
			System.out.println("ev3n nnumber");
		}
		else {
			System.out.println("check number");
		}
		return x;
		
};
square1.calculate(18);
}
}
