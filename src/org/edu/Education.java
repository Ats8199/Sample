package org.edu;

public class Education extends Medicine {
private void ug() {
	System.out.println("UG courses are available");
}
private void pg() {
System.out.println("PG courses are available");
}
public static void main(String[] args) {
	Education e=new Education();
	e.ug();
	e.pg();
	e.bSc();
	e.bA();
	e.bEd();
	e.bCom();
	e.bE();
	e.bTech();
	e.mbbs();
	e.dental();
	e.physio();
}
}
