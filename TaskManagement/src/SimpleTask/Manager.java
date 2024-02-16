package SimpleTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	
	private static ArrayList<Task> tasks=new ArrayList<>();
	
	private static Scanner scn=new Scanner(System.in);
	
	public static void main(String []args) {
	 
		Scanner scn=new Scanner(System.in);
		while(true) {
			Manager.Display();
			int choice=scn.nextInt();
			
			switch (choice) {
			case 1: {
				AddTask();
				break;
			}
			case 2:{
				RemoveTask();
				break;
			}
			case 3:{
				ListTask();
				break;
			}
			default:
				System.out.println("Invalid choice");
			}
			
		}
		
	}
			
	private static void Display() {
		System.out.println(" Choose the below Options ");
		System.out.println("1: Add Task ");
		System.out.println("2: Remove Task ");
		System.out.println("3: List Task ");
		System.out.println("4: Exit ");
		System.out.println("------ENTER YOUR CHOICE------");
		
	}
	
	private static void AddTask() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=scn.nextLine();
		System.out.println("Enter decription ");
		String decription=scn.nextLine();
		System.out.println("Enter duedate");
		String duedate=scn.nextLine();
		
		Task task=new Task(name, decription, duedate);
		tasks.add(task);
		System.out.println("Task added successfully \n----------------------------");
		
	}
	
	private static void RemoveTask() {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the task name to remove ");
        String name=scn.nextLine();
        
        Task task=findtaskbyname(name);
       
    	   
           if(task==null) {
           	System.out.println("Task not found ");
           	return;
          	}
		tasks.remove(task);
		System.out.println("Task removed successfully ");
	}
	private static void ListTask() {
		
		for(Task task:tasks) {
			System.out.println(task);
		}
	}
	
	private static Task findtaskbyname(String name) {
		for(Task task:tasks) {
			if(task.getName().equals(name)) return task;
		}
		return null;
	}

}
	
