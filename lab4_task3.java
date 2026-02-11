class Payment{ 
   void pay(){}} 
class CreditCardPayment extends Payment { 
   void pay() { 
       System.out.println("Paid by Credit Card");} 
} 
class PayPalPayment extends Payment { 
   void pay() { 
       System.out.println("Paid by Pay Pal");} 
} 
public class Three { 
   public static void main(String[] args){ 
       Payment sakib=new CreditCardPayment(); 
       Payment adid=new PayPalPayment(); 
       sakib.pay(); 
       adid.pay();} 
} 
