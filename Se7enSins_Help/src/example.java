
public class example {

	//make an array of type String and initialize with all choices
	private String numbers[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

	//method to convert num to string
	public String numToString(int num){
		
		//defaults the string to "out of range"
		String result = "Number out of range";
		
		//if the input number is greater than or equal to array size, skip
		//if statement has no brackets because the inside portion is only one line
		if(num < numbers.length)
			
			//set result string to the string in the position of 'num' in the array
			result = numbers[num];
		
		//return result
		return result;
	}
	
	//main method for testing
	public static void main(String[] args){
		
		//initialize class(bad naming on my part, usually is capitalized)
		example example1 = new example();
		
		//test out each number and print to a separate line
		System.out.println(example1.numToString(0));
		System.out.println(example1.numToString(1));
		System.out.println(example1.numToString(2));
		System.out.println(example1.numToString(3));
		System.out.println(example1.numToString(4));
		System.out.println(example1.numToString(5));
		System.out.println(example1.numToString(6));
		System.out.println(example1.numToString(7));
		System.out.println(example1.numToString(8));
		System.out.println(example1.numToString(9));
		
		//this one should give us our default string because it is too large
		System.out.println(example1.numToString(10));
	}
}
