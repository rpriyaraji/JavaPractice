
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		float flatvar = 5.5f; //'f' should be appended to store double type value in float
		double doublevar = 5.5;
		
		//optimization on memory 
		long l = 5000000000l; //8bytes stores whole numbers of range => -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		int i = 5; //4bytes ->32 bits -> range => -2,147,483,648 to 2,147,483,647
		short s = 5;//2bytes -> 16 bits -> range => -32,768 to 32,767
		byte b =5; //1byte -> 8bits -> range => -128 to 127
		
		// Inference: If we need to store only value 5 then we can use byte 
		
		char c = 'R';
		c = 65; //Ascii(American Standard code for information interchange) value of 'A'
		/*
		 * Decimal Ascii value range for small letter a - z => 97 to 122
		 * capital letter A -Z => 65 to 90
		 * numbers 0-9 => 48 to 57
		 */
		System.out.println(c);
		
		double d1 = 5; //implicit type conversion from int(low) to double (high)
		int k = (int)5.5; //type casting 
		System.out.println(d1); //5
		System.out.println(k); //5.0
		
		// Example code for Underscores in Numeric Literals
		long ccNumber = 1234_5678_9012_3456L;
		long ssn = 999_99_9999L;
		float pi = 	3.14_15F;
		long hexadecimalBytes = 0xFF_EC_DE_5E;
		long hexadecimalWords = 0xCAFE_BABE;
		long maxOfLong = 0x7fff_ffff_ffff_ffffL;
		byte byteInBinary = 0b0010_0101;
		long longInBinary = 0b11010010_01101001_10010100_10010010;
		int add = 12_3 + 3_2_1;
		System.out.println("ccNumber="+ccNumber);
		System.out.println("ssn="+ssn);
		System.out.println("pi="+pi);
		System.out.println("hexadecimalBytes="+hexadecimalBytes);
		System.out.println("hexadecimalWords="+hexadecimalWords);
		System.out.println("maxOfLong="+maxOfLong);
		System.out.println("byteInBinary="+byteInBinary);
		System.out.println("longInBinary="+longInBinary);
		System.out.println("add="+add);
		/*The above program compiles fine and here is the output:
			ccNumber=1234567890123456
			ssn=999999999
			pi=3.1415
			hexadecimalBytes=-1253794
			hexadecimalWords=-889275714
			maxOfLong=9223372036854775807
			byteInBinary=37
			longInBinary=-764832622
			add=444
		 */
	}

}
