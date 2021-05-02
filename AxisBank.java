package org.college;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("deposit Acc");
	}
	
	public static void main(String[] args) {
	
	AxisBank axisbank=new AxisBank();
	axisbank.saving();
	axisbank.fixed();
	axisbank.deposit();
	
	}
	
}
