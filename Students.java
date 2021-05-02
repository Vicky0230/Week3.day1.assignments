package org.college;

public class Students {
	
	
	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println(id + name);
	}
	
	public void getStudentInfo(String email, long ph)
	{
		System.out.println(email + ph );
	}
	
	public static void main(String[] args) {
		
		Students students=new Students();
		students.getStudentInfo(2345);
		students.getStudentInfo(2345, " Mari Vignesh");
		students.getStudentInfo("mtm.vignesh.js@gmail.com  ", 950070288);
		
		
	}
	

}
