abstract class Marks { 
   int m1, m2, m3, m4; 
   Marks(int m1, int m2, int m3, int m4) { 
       this.m1 = m1; this.m2 = m2; this.m3 = m3; this.m4 = m4;} 
   abstract double getPercentage();} 
class A extends Marks { 
   A(int x, int y, int z) { 
       super(x,y,z,0);} 
   double getPercentage() { 
       return (m1 + m2 + m3) / 3;} 
} 
class B extends Marks { 
   B(int w, int x, int y, int z) { 
       super(w,x,y,z);} 
   double getPercentage() { 
       return (m1 + m2 + m3 + m4) / 4.0;} 
} 
public class Six { 
   public static void main(String[] args) { 
       Marks A = new A(85, 90, 80); 
       Marks B = new B(75, 85, 80, 90); 
       System.out.println("Percentage of Student A: " + A.getPercentage() 
+ "%"); 
System.out.println("Percentage of Student B: " + B.getPercentage() 
+ "%");} 
}
