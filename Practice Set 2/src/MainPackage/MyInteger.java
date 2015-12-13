package MainPackage;

public class MyInteger {
	
	private int value;
	
	//getter for value
	public int getValue() {
		return value;
	}
	
	public MyInteger(int value){
		this.value = value;}
	
	//tests if given value is even
	public boolean isEven(){
		if(this.value % 2 == 0)return true;
		else {return false;}}
		
	//tests if given value is odd
	public boolean isOdd(){
		if(value % 2 != 0)return true;
		else {return false;}}
	
	//tests if given value is prime	
	public boolean isPrime(){
		if(isEven() == true) return false;
		for (int i = 2; i < Math.sqrt(this.value); i++)
			if (this.value % i == 0) return false;
		return true;		
		}
	
	
	public static boolean isEven(int value){
		return isEven(value);
		}
	
	public static boolean isOdd(int value){
		return isOdd(value);
	}
	
	public static boolean isPrime(int value){
		return isPrime(value);
	}
	
	public static boolean isEven(MyInteger myInt){
		return myInt.isEven(myInt.getValue());
	}
	
	public static boolean isOdd(MyInteger myInt){
		return myInt.isOdd(myInt.getValue());
	}

	public static boolean isPrime(MyInteger myInt){
		return myInt.isPrime(myInt.getValue());
	}
	
	public boolean equals(int integer){
		return value == integer;
	}
	
	public boolean equals(MyInteger myInt){
		return equals(myInt.getValue());
	}
	
	
	
}
	

