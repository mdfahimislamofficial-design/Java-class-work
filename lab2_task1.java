import java.util.Scanner;

public class Fahim {
	static class customer{
    	private int customerID;
    	private String name;
    	private bankAccount account[];
    	private int accountnumber;
    	customer(String a,int b){
        	this.name=a;
        	this.customerID=b;
        	this.accountnumber=0;
        	this.account= new bankAccount[5];
    	}
    	void addBankAccount(int ac) {
        	if (accountnumber < account.length) {
            	account[accountnumber] = new bankAccount(ac);
            	System.out.println("Bank account added successfully");
            	accountnumber++;
        	} else {
            	System.out.println("Account limit reached");
        	}
    	}
    	void deposit(int ac,double d){
        	bankAccount target= find(ac);
        	if(target==null){
            	System.out.println("account not found\n");
            	return;
        	}
        	else{
            	target.cdepositmoney(d);
        	}
    	}
    	void withdraw(int ac,double wd){
        	bankAccount target= find(ac);
        	if(target==null){
            	System.out.println("account not found\n");
            	return;
        	}
        	else{
            	target.cwithdrawmoney(wd);
        	}
    	}
    	bankAccount find(int a){
        	if(accountnumber>0){
            	for(int i=0;i<accountnumber;++i){
                	if(account[i].accountNumber==a){
                    	return account[i];
                	}else {
                    	return null;
                	}
            	}
        	}else{
            	return null;
        	}
        	return null;
    	}
    	void show(){
        	System.out.println("Customer id: "+customerID+"\n"+"customer name: "+name+"\n"+"Number of account: "+accountnumber+"\n");
        	for (int i=0;i<accountnumber;++i){
                	account[i].show();
        	}
        	return;
    	}

	}
	static class bankAccount{
    	private int accountNumber;
    	private double balance;
    	bankAccount(int x){
        	this.accountNumber=x;
        	this.balance=0.0;
    	}
    	void depositmoney(){
        	double amount=0.0;
        	Scanner sc = new Scanner(System.in);
        	System.out.println("enter deposit amount: ");
        	amount=sc.nextInt();
        	if(amount>0) {
            	this.balance += amount;
            	System.out.println("amount deposited\n");
        	}else {
            	System.out.println("invalid amount\n");
        	}
    	}
    	void withdrawmoney(){
        	double amount=0.0;
        	Scanner sc = new Scanner(System.in);
        	System.out.println("enter withdraw amount: ");
        	amount=sc.nextInt();
        	if(amount>0 && amount<=balance) {
            	this.balance -= amount;
            	System.out.println("amount withdrawed\n");
        	}else {
            	System.out.println("invalid amount\n");
        	}
    	}void cdepositmoney(double amount){
        	if(amount>0) {
            	this.balance += amount;
            	System.out.println("amount deposited\n");
        	}else {
            	System.out.println("invalid amount\n");
        	}
    	}
    	void cwithdrawmoney(double amount){
        	if(amount>0 && amount<=balance) {
            	this.balance -= amount;
            	System.out.println("amount withdrawed\n");
        	}else {
            	System.out.println("invalid amount\n");
        	}
    	}
    	void show(){
        	System.out.println("account number: "+accountNumber+"\n"+"account balance: "+balance+"\n");
    	}
	}
	public static void main(String[] args){
    	customer c1 = new customer("fahim",101);
    	c1.addBankAccount(1001);
    	c1.addBankAccount(1002);
    	c1.deposit(1001, 5000);
    	c1.deposit(1002, 3000);
    	c1.withdraw(1001, 1500);
    	c1.show();
	}
}
