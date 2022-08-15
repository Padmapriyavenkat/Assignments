package mark;

import java.util.Scanner; //get different methods from  Scanner 

public class Studentreport {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // get inputs
		System.out.println("Science,S=");
		int S = myObj.nextInt();
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Math,M=");
		int M = myObj1.nextInt();
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Socialstudies,SS=");
		int SS = myObj2.nextInt();
		Scanner myObj3 = new Scanner(System.in);
		System.out.println("ELA,E=");
		int E = myObj3.nextInt();
		Studentreport studetreport1 = new Studentreport();
		int Sumofmarks = studetreport1.calculatesum(S, M, SS, E);
		System.out.println("Sum =" + Sumofmarks);
		int averageofmarks = studetreport1.calculateaverage(S, M, SS, E);
		System.out.println("Averag =" + averageofmarks);
	}

	public int calculatesum(int S, int M, int SS, int E) {
		int sum = S + M + SS + E;
		return sum; //it says output of the  method
		

	}
	public int calculateaverage(int S, int M, int SS, int E) {
		int average = (S + M + SS + E)/4;
		return average;

	}
} 
