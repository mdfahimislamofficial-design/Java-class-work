public class One {
   static class Smartphone{
       private String brand, model;
       private int storageCapacity;
       void setter(String a, String b,int c){
           this.brand=a;
           this.model=b;
           this.storageCapacity=c;
       }
       void getter(){
           System.out.println("Brand name: "+brand+"/n"+"Model name: "+model+"\n"+"Storage Capacity: "+storageCapacity);
       }
       void increaseStorage(int a) {
           this.storageCapacity += a;
           System.out.println("Storage Capacity increased");
       }
   }
   public static void main(String[] args){
       Smartphone s1=new Smartphone();
       Smartphone s2=new Smartphone();
       Smartphone s3=new Smartphone();
       s1.setter("Sammsung","P9 Pro",128);
       s2.setter("Realme","C21 Pro",16);
       s3.setter("Nokia","E10",16);
       s1.getter();
       s2.getter();
       s3.getter();
       s2.increaseStorage(48);
       s2.getter();
   }
}
