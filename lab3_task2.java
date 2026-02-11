import java.util.Scanner;
public class Two {
	static class Complex{
    	int real,imag;
    	Complex(){
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter real and imaginary numbers respectively: ");
        	this.real=sc.nextInt();
        	this.imag=sc.nextInt();
    	}
    	Complex(Complex ob1,Complex ob2){
        	this.real=ob1.real+ ob2.real;
        	this.imag=ob1.imag+ ob2.imag;
    	}
    	void show() {
        	System.out.println("Sum: "+real+" + "+imag+"i");
    	}
	}
	public static void main(String[] args){
    	Complex a1 = new Complex();
    	Complex a2 = new Complex();
    	Complex a3 = new Complex(a1,a2);
    	a3.show();
	}
}
