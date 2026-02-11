class Vehicle{ 
   void start(){}} 
class Car extends Vehicle { 
   void start() { 
       System.out.println("car: car car car");} 
} 
class Bike extends Vehicle { 
   void start() { 
       System.out.println("bike: bike bike bkie");} 
} 
public class One { 
   public static void main(String[] args){ 
      Vehicle sakib=new Car(); 
      Vehicle adid=new Bike(); 
      sakib.start(); 
      adid.start();} 
} 
