package control;
import java.util.Scanner;
public class ifelse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Custemer type 'guest ' or 'regular'");
		String customerType =scan.next() ;
		System.out.println("Enter the quantity: ");
			int quantity = scan.nextInt();
			int unitPrice = 10;
			int totalCost = 0;
			int discount = 5;
			int deliveryCharge = 5;
			totalCost = (unitPrice * quantity);
			if (customerType.equals("regular")) {
				totalCost = totalCost - (totalCost * discount / 100);
				System.out.println("You are a regular customer and have got 5% discount");
				System.out.println("The total cost to be paid is " + totalCost);
				if (totalCost >= 20) {
					System.out.println("You have got a gift voucher!!!!");
				}
			} else if (customerType.equals("guest")) {
				totalCost = totalCost + deliveryCharge;
				System.out.println("You need to pay an additional delivery charge of $5");
				System.out.println("The total cost to be paid is " + totalCost);
			} else {
				System.out.println("Invalid selection");
			}
		}
	}

