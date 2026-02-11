import java.util.Scanner;
public class Four {
	static class Person{
    	String F,L;
    	Person(String a, String b){
        	this.F=a;
        	this.L=b;
    	}
    	String getFirstName(){
        	return F;
    	}
    	String getLastName(){
        	return L;
    	}
	}
	static class Employee extends Person{
    	String job;
    	int id;
    	Employee(String a, String b, String c, int d){
        	super(a,b);
        	this.job=c;
        	this.id=d;
    	}
    	int getEmployeeId(){
        	return id;
    	}
    	String getLastName(){
        	String tem= L+" "+job;
        	return tem;
    	}
	}
	public static void main(String[] args){
    	Employee e1= new Employee("Fahim","Islam","student",3035);
    	System.out.println("Id: "+ e1.getEmployeeId()+"/n"+"Name: "+e1.getFirstName()+" "+e1.getLastName());
	}
}
