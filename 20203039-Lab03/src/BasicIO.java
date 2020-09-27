import java.util.*;

// An exploration of basic input and output.
class BasicIO {
	//Reads and processes string input.
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		// get first input
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		System.out.print("Enter your age: ");
		int years = stdin.nextInt();
		System.out.print("Enter your height: ");
		int height = stdin.nextInt();
		
		// display output on console
		System.out.println("your name is "+name);
		System.out.println("your age is "+years);
		System.out.println(years+"Y = "+(years*365)+"D");
		System.out.println("your height is "+height);
		System.out.printf("2020년 9월 28일 현재 "+name+"("+years+")"+"의 키는 "+height+"cm 입니다.");
	}	//method main
} // class BASIC_IO
