class Animal{ 
   void makeSound(){}} 
class Dog extends Animal { 
   void makeSound() { 
       System.out.println("Dog: bark bark bark");} 
} 
class Cat extends Animal { 
   void makeSound() { 
       System.out.println("Cat: meow meow meow");} 
} 
public class Two { 
   public static void main(String[] args){ 
       Animal sakib=new Dog(); 
       Animal adid=new Cat(); 
       sakib.makeSound(); 
       adid.makeSound();} 
} 
