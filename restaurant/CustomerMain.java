package com.assignment1.restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMain 
{
	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		ArrayList<RestaurantFood> al = new ArrayList<RestaurantFood>();

		String res = null;

		do {
			System.out.println("Enter the name of the food: ");
			String foodName = sc.next();

			System.out.println("Enter the food price: ");
			int foodPrice = sc.nextInt();

			RestaurantFood rf = new RestaurantFood(foodName, foodPrice);

			boolean rs = al.add(rf);
			if(rs) {
				System.out.println("Food added successfully");
			}else {
				System.out.println("Failed to add");
			}
			System.out.println("Do you wish to add more Food Items?(yes/no)");
			res = sc.next();
		}while(res.equalsIgnoreCase("yes"));

		System.out.println("The Restaurant menu: ");
		for(int i=0;i<al.size();i++) {
			System.out.println((i+" "+al.get(i)));
		}

		ArrayList<RestaurantFood> al1 = new ArrayList<RestaurantFood>();

		String res1 = null;

		do {
			System.out.println("Enter the item no to order: ");
			int itemNo = sc.nextInt();

			Object obj = al.get(itemNo);
			boolean rs1 = al1.add((RestaurantFood) obj);
			if(rs1) {
				System.out.println("Food No: "+al.get(itemNo)+" added successfully.");
			}else {
				System.out.println("Failed to add items.");
			}
			System.out.println("Do you wish to add more items?(yes / no)");
			res1 = sc.next();
		}while(res1.equalsIgnoreCase("yes"));

		System.out.println("Your Food items are listed below: ");
		for(int i=0;i<al1.size();i++) {
			System.out.println(i+" "+al1.get(i));
		}



		System.out.println("Your ordered food items are:");
		for(int i=0;i<al1.size();i++) {
			System.out.println(i+" "+al1.get(i));
		}
		System.out.println("Billing is in process...");
		double totalPrice = 0;
		for(int i=0;i<al1.size();i++) {
			RestaurantFood rt = al1.get(i);
			totalPrice=totalPrice+rt.foodPrice;
		}
		System.out.println("Your total amount:"+totalPrice);
		
		sc.close();

	}
}
