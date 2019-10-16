package org.bank;

public class BankInfo {
	public void saving() {
		// TODO Auto-generated method stub
System.out.println("saving interest is 2%");
	}
	public void fixed() {
		// TODO Auto-generated method stub
System.out.println("fixed interest is 3%");
	}
	public void deposit(int id) {
		// TODO Auto-generated method stub
System.out.println("deposit amount is"+id);
	}
	public static void main(String[] args) {
		BankInfo a=new BankInfo();
		a.deposit(10);
	}
}
