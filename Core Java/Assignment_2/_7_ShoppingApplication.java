package Assignment_2;

import java.util.Scanner;

public class _7_ShoppingApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		_7_Candy Candies = new _7_Candy();
		_7_Cookie Cookies = new _7_Cookie();
		_7_IceCream IceCreams = new _7_IceCream();
		while (true) {
			System.out.println("Enter owner or customer:");
			String name = sc.next();
			if (name.equalsIgnoreCase("owner")) {
				System.out.println("Welcome Owner");
				System.out.println(Candies.candies + " candies, " + Cookies.cookies + " cookies, " + IceCreams.iceCreams
						+ " ice creams are in the storage");
				System.out.println("Please enter number of candy, cookie and icecream in order to add it to storage:");
				int candies = sc.nextInt();
				int cookies = sc.nextInt();
				int iceCreams = sc.nextInt();
				Candies.addLoad(candies);
				Cookies.addLoad(cookies);
				IceCreams.addLoad(iceCreams);
				System.out.println("Added successfully:\n" + Candies.candies + " candies, " + Cookies.cookies
						+ " cookies, " + IceCreams.iceCreams + " ice creams are in the storage after adding");
			} else if (name.equalsIgnoreCase("customer")) {
				System.out.println("Welcome Customer");
				while (true) {
					if (Candies.candies == 0 && Cookies.cookies == 0 && IceCreams.iceCreams == 0) {
						System.out.println("Sorry for the inconvenience! All sold out! Kindly visit later");
						break;
					}
					System.out.println(
							"Please enter number of candy, cookie and icecream in order to add it to cart for invoice:");
					int candies = sc.nextInt();
					int cookies = sc.nextInt();
					int iceCreams = sc.nextInt();
					float cost = 0;
					if (Candies.candies >= candies && Cookies.cookies >= cookies && IceCreams.iceCreams >= iceCreams) {
						cost = Candies.getCost(candies) + Cookies.getCost(cookies) + IceCreams.getCost(iceCreams);
						Candies.candies = Candies.candies - candies;
						Cookies.cookies = Cookies.cookies - cookies;
						IceCreams.iceCreams = IceCreams.iceCreams - iceCreams;
					} else {
						System.out.println("Only " + Candies.candies + " candies, " + Cookies.cookies + " cookies,"
								+ IceCreams.iceCreams + " ice creams left out! Kindly enter less");
						continue;
					}
					System.out.println("The Total Amount is Rs." + cost + "/-. Kindly checkout!");
					break;
				}
			} else {
				System.out.println("Invalid!");
				continue;
			}
			int n=0;
			while(true) {
			System.out.println("Enter 1 to exit and 2 to relogin");
			n = sc.nextInt();
			if (n == 1 || n==2)
				break;
			else 
				System.out.println("Invalid!");
			}
			if (n == 1)
				break;
			else if (n == 2)
				continue;
			
		}
		sc.close();
	}

}
