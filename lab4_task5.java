class Employee1 { 
   String n, i; 
   double s; 
   Employee1(String a, String b, double c) { 
       this.n = b; this.i = a; this.s = c;} 
   double calculateSalary() { 
       return 0;} 
   void show() {} 
} 
class FullTimeEmployee1 extends Employee1 { 
   FullTimeEmployee1(String a,String b, double c){ 
       super(a,b,c);} 
   double calculateSalary() { 
       return s*0.1+s;} 
   void show() { 
       System.out.println("ID: "+i+"\n"+"Name: "+n+"\n"+"salary per 
month: "+s+"\n"+"Total salary: "+calculateSalary()+"\n");} 
} 
class PartTimeEmployee1 extends Employee1 { 
   PartTimeEmployee1(String a,String b, double c){ 
       super(a,b,c);} 
   double calculateSalary() { 
       return s*0.05+s;} 
   void show() { 
       System.out.println("ID: "+i+"\n"+"Name: "+n+"\n"+"salary per 
month: "+s+"\n"+"Total salary: "+calculateSalary()+"\n");} 
} 
public class Five { 
   public static void main(String[] args){ 
       Employee1 sakib=new FullTimeEmployee1("101","Sakib",12000); 
       Employee1 adid=new PartTimeEmployee1("102","Adid",12000); 
       sakib.show(); 
       adid.show();} 
} 
