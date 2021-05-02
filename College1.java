package org.college;

public class College1 extends University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College1 College=new College1();
		College.pg("MBA");
		College.ug("BE");

	}

	public void ug(String ug)
	{
		System.out.println(ug);
	}
	
	

}
