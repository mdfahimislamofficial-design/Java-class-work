public class Five {
	abstract class Shape{
    	abstract getPerimeter();
    	abstract getArea();
	}
	static class Circle extends Shape{
    	double r;
    	Employee(double a){
        	this.r=a;
    	}
    	void getPerimeter(){
        	System.out.println("Perimeter: "+(r*2*3.14));
    	}
    	void getArea(){
        	System.out.println("Area: "+(r*r*3.14));
    	}
	}
	public static void main(String[] args){
    	Circle e1= new Circle(3.5);
    	e1.getPerimeter();
    	e1.getArea();
	}
}
