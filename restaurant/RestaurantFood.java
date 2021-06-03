package com.assignment1.restaurant;

public class RestaurantFood 
{
	public String foodName;
	public int foodPrice;
	public RestaurantFood(String foodName, int foodPrice) {
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}
	@Override
	public String toString() {

		return "["+"Food Item: "+foodName+", Food price:"+foodPrice+"]";
	}
	
	
	
}
