package JDBC;
import java.util.Scanner;

public class student {
	private int id;
	private String name;
	private int course;
	private int  ComputerTuitionFees=5000;  
	private int historyTuitionFees=4000;
	private int mathsTuitionFees=3000;
	private int englishTuitionFees=2000; 
	private int PhysicsTuitionFees=6000; 
	
	public student() {
		System.out.println("        WELCOME TO STUDENT MANAGEMENT SYSTEM         ");  
		System.out.println("        ************************************         ");
		System.out.println("");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		this.id = in.nextInt(); 
		
		System.out.println("Enter Student Name: ");   
		this.name = in.next(); 
		
		System.out.println("1 - Computer\n2 - History\n3 - Maths\n4 - English\n5 - Physics\nEnter course to enroll");  
		this.course = in.nextInt();  
		}
		}
