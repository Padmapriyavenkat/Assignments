package test;

import java.util.Scanner;




public class EvenorOdd {

	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in); // get inputs
		System.out.println("Enter the Number, X =");
		int X = myObj.nextInt();
		EvenorOdd E = new EvenorOdd();
		String result = E.evenoradd(X);
		System.out.println("result =" + result);
	}
		 public String evenoradd(int X){
			int S = X % 2;
			if (S==0)
			{
				return "Even";
			}
				else {
					return "Odd";
				}
						
	}
}
