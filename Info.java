import java.util.Scanner;

public class Info {
	
	private int baseZipCodeCost;
	
	public Info() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("First name (Required): ");
		String firstName = input.nextLine(); 
		
		System.out.println("Last name (Required): ");
		String lastName = input.nextLine(); 

		System.out.println("Email (Required): ");
		String email = input.nextLine(); 

		System.out.println("Phone number (Required): ");
		String phoneNumber = input.nextLine(); 
	}
	
	public double getZipCodeCost() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Zip code (Required): ");
		int zipCode = input.nextInt(); 
		
		if (95110 <= zipCode && zipCode <= 95120 ) {
	        baseZipCodeCost = 150;
	        System.out.println("The base cost in your area is: $" + baseZipCodeCost + "\n");
	    } else if (95121 <= zipCode && zipCode <= 95129) {
	        baseZipCodeCost = 200;
	        System.out.println("The base cost in your area is: $" + baseZipCodeCost + "\n");
		} else if (95130 <= zipCode && zipCode <= 95139) {
			baseZipCodeCost = 400;
			System.out.println("The base cost in your area is: $" + baseZipCodeCost + "\n");
		} else {
			System.out.println("Invalid zipcode, please try again.");
		}
		
		return baseZipCodeCost;
	}
}
