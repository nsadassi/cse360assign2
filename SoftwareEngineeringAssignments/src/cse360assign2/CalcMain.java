package cse360assign2;

public class CalcMain {

	public static void main(String[] args) {

		Calculator myCalculator = new Calculator();
		
		myCalculator.add (4);
		myCalculator.subtract (2);
		myCalculator.multiply (2);
		myCalculator.add(5);
		System.out.println(myCalculator.getTotal());
		System.out.println(myCalculator.getHistory());
		myCalculator.divide(3);
		myCalculator.subtract (8);
		System.out.println(myCalculator.getTotal());
		System.out.println(myCalculator.getHistory());
		myCalculator.divide(0);
		System.out.println(myCalculator.getTotal());
		myCalculator.add (7);
		
		System.out.println(myCalculator.getHistory());
		System.out.println(myCalculator.getTotal());

	}

}
