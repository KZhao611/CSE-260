package cse260;
import java.util.*;

public class SecretShopper {
	public static void main(String[] args) {
		HashMap<String, Integer> shoppingList1 = new HashMap<String,Integer>();
		HashMap<String, Integer> kid = new HashMap<String,Integer>();
		HashMap<String, Double> prices = new HashMap<String,Double>();
		shoppingList1.put("apples",5);
		shoppingList1.put("bananas", 10);
		shoppingList1.put("oatmeal", 1);
		shoppingList1.put("granola bars", 3);
		shoppingList1.put("cheerios", 2);
		kid.put("flip flops", 1);
		kid.put("skittles", 15);
		kid.put("captain crunch", 1);
		prices.put("apples", .25);
		prices.put("bananas", 1.25);
		prices.put("oatmeal", 10.49);
		prices.put("granola bars", 9.68);
		prices.put("cheerios", 2.40);
		prices.put("flip flops", 14.99);
		prices.put("skittles", 1.49);
		prices.put("captain crunch", 3.50);
		prices.put("Twinkies", 1.30);
		System.out.println("Total: $" + String.format("%.2f",groceryShopping(shoppingList1,kid,prices)));
	}
	public static double groceryShopping(HashMap<String, Integer> shoppingList, HashMap<String, Integer> childSneaking, HashMap<String, Double> prices){
		double ret = 0, curr;
		for(Map.Entry<String, Integer> e : shoppingList.entrySet()) {
			curr = e.getValue() * prices.get(e.getKey());
			System.out.println(e.getKey() + ": " + e.getValue() + " * " + prices.get(e.getKey()) + " = $" + curr);
			ret += curr;
		}
		System.out.println("-------------------------------------------------");
		for(Map.Entry<String, Integer> e : childSneaking.entrySet()) {
			curr = e.getValue() * prices.get(e.getKey());
			System.out.println(e.getKey() + ": " + e.getValue() + " * " + prices.get(e.getKey()) + " = $" + curr);
			ret += curr;
		}
		return ret;
	}
}
