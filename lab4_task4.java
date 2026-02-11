abstract class shape{ 
   double h,w,r; 
   shape(double a, double b, double c){ 
       this.h=a; this.w=b; this.r=c;} 
   abstract void draw(); 
   abstract double perimeter(); 
   abstract double area(); 
} 
class Circle extends shape { 
   Circle(double a) { 
       super(0, 0, a);} 
   double perimeter(){ 
       return 2*3.14*r;} 
   double area(){ 
       return 3.14*r*r;} 
   void draw() { 
       System.out.println("Circle"+"\n"+"Radious: "+r+"\n"+"Perimeter: 
"+perimeter()+"\n"+"Area: "+area()+"\n");} 
} 
class Rectangle extends shape { 
   Rectangle(double x, double y){ 
       super(x,y,0);} 
   double perimeter(){ 
       return 2*(h+w);} 
   double area(){ 
       return h*w;} 
   void draw() { 
       System.out.println("Rectangle"+"\n"+"Hight: "+h+"\n"+"Width: 
"+w+"\n"+"Perimeter: "+perimeter()+"\n"+"Area: "+area()+"\n");} 
} 
public class Four { 
   public static void main(String[] args){ 
       Circle sakib=new Circle(3.5); 
       Rectangle adid=new Rectangle(2,4); 
       sakib.draw(); 
       adid.draw();} 
} 
