
public class Operators {

	/*
	 * Arithmetic => +,-,*,/,%
	 * Bitwise => << >>
	 * Relational
	 * Logical
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2,b=3;
		int r1 = a+b; 
		int r2 = a-b;
		int r3 = a*b;
		int r4 = a/b;
		double r5 = (double)a/5;
		int r6 = a%b;
		
		System.out.println(r1);//5
		System.out.println(r2);//-1
		System.out.println(r3);//6
		System.out.println(r4);//0(only gives quotient & deoesn't give decimal value)
		System.out.println(r5);//0.4(so cast the int output into decimal and then store it in double)
		System.out.println(r6);//0(remainder)
		
		
		/*
		 * shorthand operators
		 */
		 
		r6 += 3; //r6=r6+3 //r6++
		System.out.println("Before post increment" + r6);
		System.out.println("Post increment" + r6++); //first value is stored then incremented
		System.out.println("After Post increment" + r6);
		
		System.out.println("Before Pre increment" + r6);
		System.out.println("Pre increment" + ++r6); ////first incremented then value is stored  
		System.out.println("After Pre increment" + r6);

		/*
		 * Instance of => checks whether an object is an instance of a particular class
		 */
		String str = "Instance of Check";
		boolean result = str instanceof String;
		System.out.println("Instance of Check" + " " + result);
		
	}

}
