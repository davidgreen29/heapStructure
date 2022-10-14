package heapStructure;

import java.util.Scanner;

import heapStructure.DatabaseAccess;

public class Main {
//main class for the user to interact with the heap structure 
	public static void main(String[] args) {
		
		
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		//instance of database access 
		DatabaseAccess<String> db = new DatabaseAccess<String>();
	      
	        
//switch cases to allow the user to interact with the heap structure 
	        while (true) {
	            System.out.println("Please enter an action you'd like to take:");
	            System.out.println("\t-1) quit program");
	            System.out.println("\t1) insert a new element into the heap structure");
	            System.out.println("\t2) delete the max heap and print");
	            System.out.println("\t3) heap sort and print");
	            System.out.println("\t4) Print the heap structure");
	           int userOption = scanner.nextInt();
	            scanner.nextLine();  

	            switch (userOption){
	                case -1:
	                    break;
	                case 1:
	                	//enter the object to insert 
	                    System.out.println("Please enter a object to insert into the heap structure");
	                    String object = scanner.next();
	                    db.addEntry(object);
	                    break;
	                case 2:
	                	//removes the max of the heap structure and prints it 
	                	System.out.println("heap structure after max deletion ");
	                	db.removeMax();
						break;
						// sorts the heap and prints it 
	                case 3:
	                    System.out.println("heap sructure after heap sort");
						db.sortHeap();
						db.printDB();
	                    
	                    break;
	                case 4:
	                    //Print the heap structure 
	                	System.out.println("print the heap structure");
	                	db.printDB();
	                    break;
					default:
						break;
	             
	            }

	            if (userOption == -1){
	            	//end the program 
	            	System.out.println("the program has ended");
	                break;
	            }
	        }
	    }


	}

	


