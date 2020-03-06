package com.bvrith.CustomCollections;
import java.util.*;

public class CustomList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new List<Integer>();
		
		boolean read = true;
		while(read) {
			System.out.println("Enter your choice : \n1. Add element to the list \n2. Get list element by index\n3. Remove element from list\n4. Display all the elements of the list\n5. No operation required");
			int n;
			n = sc.nextInt();
			switch(n) {
			case 1 : System.out.println("Enter element to be added : ");
			int ele = sc.nextInt();
			list.add(ele);
			break;
			case 2 : System.out.println("Enter the index of the element to be found : ");
			int ind = sc.nextInt();
			if(ind > list.getSize()-1) {
				System.out.println("List index out of bounds");
			} else {
				System.out.println(list.get(ind));
			}
			break;
			case 3 : System.out.println("Enter index of the element to be removed");
			int e = sc.nextInt();
			if(e > list.getSize()-1) {
				System.out.println("List index out of bounds");
			} else {
			list.remove(e);
			}
			break;
			case 4 : System.out.println("The list is : " + list);
			break;
			case 5 : read = false;
			break;
			}
		}
	}
}