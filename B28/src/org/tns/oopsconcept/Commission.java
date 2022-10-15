package org.tns.oopsconcept;
import java.util.Scanner;



	public class Commission
	{
	    String name;
	    String address;
	    int phone;
	    double sales_amount;
	    double comm;
	    
	    void input() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter employee name: ");
	        name = in.nextLine();
	        System.out.print("Enter employee address: ");
	        address= in.nextLine();
	        System.out.print("Enter employee phone number");
	        phone=in.nextInt();
	        System.out.print("Enter Sales amount: ");
	        sales_amount = in.nextInt();
	    }
	    
	    void compute() {
	        if (sales_amount >= 100000) {
	            comm = (10.0 / 100.0) * sales_amount;
	        }
	        else if ((sales_amount <= 50000)&&(sales_amount<100000)) {
	            comm = (5.0 / 100.0 )* sales_amount;
	        }
	        else if ((sales_amount<= 30000)&&(sales_amount<50000)) {
	            comm = (3.0 / 100.0 )* sales_amount;
	        }
	        else {
	            System.out.println("No Commission");
	        }
	    }
	    
	    void display() {
	        System.out.println("Employee name: " + name);
	        System.out.println("Employee address: " + address);
	        System.out.println("Emplyee Phine number: " + phone);
	        System.out.println("Sales: " + sales_amount);
	        System.out.println("Commission: " + comm);
	    }
	    
	    public static void main(String args[]) {
	        Commission obj = new Commission();
	        obj.input();
	        obj.compute();
	        obj.display();
	    }
	}


