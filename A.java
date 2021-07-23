package assignment2;
import java.util.Scanner;

class Simple_A {
	void addition(double x,double y){
		double c=0;
		c=x+y;
		System.out.println("Class A Addition= "+c);
	}
	void subtraction(double x,double y) {
		double c=0;
		if(x>=y) {
			c=x-y;
			System.out.println("Class A Subtraction= "+c);
		}
		else {
			c=y-x;
			System.out.println("Class A Subtraction= -"+c);
		}
	}	
}

class Complex_A extends A{
	private final double r;
	private final double i;
	Complex_A(double r,double i){
		this.r=r;
		this.i=i;
	}
	
	public Complex_A sum(Complex_A other) {
		
		
		double r=this.r+other.r;
		double i=this.i+other.i;
		
		return new Complex_A(r,i);
	}
	
	public Complex_A sub(Complex_A other) {
		
		
		double r=this.r-other.r;
		double i=this.i-other.i;
		
		return new Complex_A(r,i);
	}
	
	public String toString() {
		return r+" + "+i+"i";
	}
	
	 void printComplexNumber()
	    {
	        System.out.println("Complex number: " + r + " + " + i + "i");
	    }
}

public class A{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		
		System.out.print("\nEnter the 1st real & imaginary part respectively: ");
		double r1=sc.nextDouble();
		double i1=sc.nextDouble();
		
		System.out.print("\nEnter the 2nd real & imaginary part respectively: ");
		double r2=sc.nextDouble();
		double i2=sc.nextDouble();
		
		Simple_A a=new Simple_A();
		a.addition(x,y);
		a.subtraction(x,y);
		System.out.println();
		
		Complex_A c1=new Complex_A(r1,i1);
		c1.printComplexNumber();
		
		Complex_A c2=new Complex_A(r2,i2);
		c2.printComplexNumber();
		
		Complex_A sum=c1.sum(c2);
		Complex_A sub=c1.sub(c2);
		
		System.out.println("\nAddition of two complex numbers: " + sum);
		System.out.println("Subtraction of two complex numbers: " + sub);
		
	}

}
