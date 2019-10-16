package org.bank;

public class AxisBank extends BankInfo {
	public void deposit(int id) {
		// TODO Auto-generated method stub
System.out.println("deposit amount is"+id);
	}
	public static void main(String[] args) {
		AxisBank b=new AxisBank();
		b.deposit(30);
		b.saving();
		b.fixed();
	}
}
