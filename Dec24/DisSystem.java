package dec17practice;

import java.util.Scanner;

public class DisSystem {
	static float findFinalPricePremieme(float price) {
		int discount = 20;
		//calculates the discount
		float discountprice = (price * discount) / 100;    
		//returns price after discount
		return price - discountprice;				
	}

	static float findFinalPriceGold(float price) {
		int discount = 15;
		float discountprice = (price * discount) / 100;
		return price - discountprice;
	}

	static float findFinalPriceSilver(float price) {
		int discount = 10;
		float discountprice = (price * discount) / 100;
		return price - discountprice;
	}

	public static void main(String[] args) {
		int price;
		int discount;

		Scanner sc = new Scanner(System.in);
		//input by user
		System.out.println("Enter price of the product :");
		price = sc.nextInt();
		//printing the values after discount on original price
		System.out.println("Final price premieme after 20% Discount is" + findFinalPricePremieme(price));
		System.out.println("Final price Gold after 15% Discount is " + findFinalPriceGold(price));
		System.out.println("Final price Silver after 10% Discount is " + findFinalPriceSilver(price));
	}

} 	    
