import java.util.Scanner;

public class BobcatHotel {

	public static void main(String[] args) {
		System.out.println("Hello and welcome to Bobcat Hotel! Please enter your name.");
		
		Scanner input = new Scanner(System.in);
		
		//Getting the user name
		String name;
		name = input.nextLine();
		//Viewing the rooms available
		System.out.println("We offer multiple room packages " + name + ". Press 1 to view the room packages now.");
		int viewPackages;
		viewPackages = input.nextInt();
		
		if (viewPackages == 1) {
			System.out.println("Signle: $50.50 per night");
			System.out.println("Double: $75.00 per night");
			System.out.println("Queen: $100.75 per night");
			System.out.println("King: $150.25 per night");
			System.out.println("Master Suite: $225.50 per night");
			
		}
		
		else {
			System.out.println("Ok lets proceed to the next step");
			
		}
		//Viewing the meals available
		System.out.println("If you would like to view the meal packages now " + name + " please press 1 now");
		int mealPackages;
		mealPackages = input.nextInt();
		
		if (mealPackages == 1) {
			System.out.println("Complementary: Free");
			System.out.println("Standard: $30.00 per guest");
			System.out.println("Deluxe: $50.00 per guest");
			System.out.println("Indulgence: $85 per guest (only available for guests who reserve the Master Suite)");
			
		}
		
		else {
			System.out.println("Ok lets proceed to the next step");
		}
		//How many guests are they bringing
		System.out.println("How many guests are in your party " + name + "?");
		int numberGuests;
		numberGuests = input.nextInt();
		
		System.out.println("Sounds good! I have a reservation for " + name + ". This party is for " + numberGuests + " people.");
		System.out.println("Next I will need to know what room you would like. \n Press 1 for Single \n Press 2 for Double \n Press 3 for Queen \n Press 4 for King \n Press 5 for Master Suite");
		//Picking their rooms 
		int roomOption = 0;
		roomOption = input.nextInt();
		
		int numberNights;
		String whatRoom = null;
		double roomCost = 0;
		switch(roomOption) {
			case 1:
				System.out.println("You have chosen a single room! That is $50.50 per night");
				whatRoom = "Single Room";
				roomCost = 50.50;
				break;
			case 2:
				System.out.println("You have chosen a double room! That is $75.00 per night");
				whatRoom = "Double Room";
				roomCost = 75.00;
				break;
			case 3:
				System.out.println("You have chosen the queen room! That is $100.75 per night");
				whatRoom = "Queen Room";
				roomCost = 100.75;
				break;
			case 4:
				System.out.println("You have chosen a king room! That is $150.25 per night");
				whatRoom = "King Room";
				roomCost = 150.25;
				break;
			case 5:
				System.out.println("You have chosen a Master Suite! That is $225.50 per night");
				whatRoom = "Master Suite";
				roomCost = 225.50;
				break;
			default:
				System.out.print("Somethings not right... Goodbye!");
				break;
				
		}
		
		//How many nights are they staying
		System.out.println("How many nights will you be staying?");
		numberNights = input.nextInt();
		
		
		System.out.println("So I have you down for " + whatRoom + " for " + numberNights + " nights");
		System.out.println("Before we proceed to the checkout I'll need more information from you.");
		System.out.println("Are you a AAA member? Just enter 1 for yes and 2 for no");
		//aaaMember discount
		int aaaMember; 
		
		aaaMember = input.nextInt();
		
		if (aaaMember == 1) {
			System.out.println("Great! You qulify for our AAA discount");
			System.out.println("This discount will be applied at the end.");
			
		}
		
		else if (aaaMember == 2) {
			System.out.println("No worries, lets move on");
		}
		
		else {
			System.out.println("I don't know what that means so I don't have you down for the AAA discount. If you are a triple AAA member either start the application over again or you are more than welcome to call our front desk for help.");
		}
		
		
		//club member discount
		System.out.println("Are you a Club member? Just enter 1 for yes and 2 for no");
		
		int clubMember; 
		
		clubMember = input.nextInt();
		
		if (clubMember == 1) {
			System.out.println("Great! We have a special event going on in which you get enetered into a drawing for chance to recieve a Buy 4 nights get 1 free promostion.");
			System.out.println("This discount will be applied at the end.");
			
		}
		
		else if (clubMember == 2) {
			System.out.println("No worries, lets move on");
		}
		
		else {
			System.out.println("I don't know what that means so I don't have you down for the club member discount. If you are a triple AAA member either start the application over again or you are more than welcome to call our front desk for help.");
		}
		
	//Picking meal packages
		System.out.println("Now I need to know what meal package you would like to get");
		int mealOption;
		if (roomOption == 5) {
			System.out.println("\tMEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)\n \t0. Complementary @ $0 per guest\n \t1. Standard @ $30 per guest\n \t2. Deluxe @ $50 per guest\n \t3. Indulgence @ $85 per guest");
			System.out.println("Please enter your choice now!");
			mealOption = input.nextInt();
			if (mealOption < 4) {
				System.out.println("Ok this will be totaled during your final checkout.");
		
			}
			else {
				System.out.println("Sorry I don't know what that means. Please try again later");
			}
		}
		else {
			System.out.println("\tMEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)\n \t0. Complementary @ $0 per guest\n \t1. Standard @ $30 per guest\n \t2. Deluxe @ $50 per guest");
			System.out.println("Please enter your choice now!");
			mealOption = input.nextInt();
			if (mealOption < 3) {
				System.out.println("Ok this will be totaled during your final checkout.");
			}
			else {
				System.out.println("Sorry your request is invalid. Please try again later.");
			}
		}
		//Calculating Total Costs (Variables Only)
		
		double roomCheckout;
		roomCheckout = (double)(roomCost * numberNights);
		
		double mealCost = 0.00;
		switch(mealOption) {
			case 0:
				mealCost = 0.00;
				break;
			case 1:
				mealCost = 30.00;
				break;
			case 2:
				mealCost = 50.00;
				break;
			case 3:
				mealCost = 85.00;
				break;
			default:
				System.out.print("The choice was invalid, try again later");
				break;
		}
				
				
		double mealCheckout;
		mealCheckout = (double)(mealCost * numberNights * numberGuests);
		
		double preliminaryCost;
		preliminaryCost = (double)(roomCheckout + mealCheckout);
		
		double aaaCalculation = 0.00;
		if (aaaMember == 1) {
			aaaCalculation = (double)(preliminaryCost * 0.10);
		}
		else {
			aaaCalculation = 0.00;
		}
		
		
		float cmDiscount = (float)(0.00);
		int randInt;
		randInt = (int)(Math.random()* (9 - 0));
		if (clubMember == 1 && randInt >= 4) {
			int discount;
			discount = (int)(numberNights/4);
			cmDiscount = (float)(discount * roomCost);	
			System.out.println("Congrats!! You won the drawing for the Club Member discount!");
		}
		
		else if(clubMember == 1 && randInt < 4) {
			cmDiscount = (float)(0.00);
			System.out.println("Unfortunately you didn't win the drawing for the Club Member discount");
		}
		
		else {
			cmDiscount = (float)(0.00);
		}
		
		float totalCost;
		totalCost = (float)(preliminaryCost - (cmDiscount + aaaCalculation));
		
		//Printing Final Costs
		System.out.println("\n\n\n\t\t\t*CHECKOUT*\n\n\tRoom Cost:\t\t+$" + roomCheckout + "\n\tMeal Cost:\t\t+$" + mealCheckout + "\n\tPreliminary Total Cost:\t$" + preliminaryCost + "\n\tAAA Discount:\t\t-$" + aaaCalculation + "\n\tClub Member Discout:\t-$" + cmDiscount + "\n\tTotal Cost of Booking:\t$" + totalCost );
		
		
		
	}

}

/* TODO: 
 * Display an intro message to the users displaying the various room options that are available.
 * Ask the user the following information:
 * 		Number of guests. numberGuests
 * 		Their choice of room. roomOption
 * 		How many nights they would like to stay. numberNights
 * 		Whether they are a AAA member. AAA discount is calculated based on answer.
 * 		Whether they are a club member. Club member discount is calculated based on answer.
 * 		What type of meal package they would like to purchase. Note: not all choices will be available for all
room types.
* Depending on the user’s choices, compute the base room cost, meal cost, preliminary total cost,
applicable discounts, and final total cost of booking as explained below.
* Display checkout messages with all costs and discounts.
*/
