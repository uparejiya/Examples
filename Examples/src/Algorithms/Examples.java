package Algorithms;
import java.util.Scanner;

public class Examples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Examples examples = new Examples();
		examples.fibonacci(number);

	}
	
	public void fibonacci(int number){
		System.out.print(0+" ");
		System.out.print(1+" ");
		int n1 = 0,n2 = 1,n3;
		
		for(int i=2;i<number;i++){
			n3 = n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
	

}
