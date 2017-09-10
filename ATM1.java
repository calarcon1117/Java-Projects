import java.util.Scanner;

public class ATM1 {


	public static void main(String[] args) {
		System.out.println("Hello, welcome to Bank of America.");
		System.out.println("Please select one of the following options:");
		
		System.out.println();
		double currentBal =1500;
		
		do{
			Scanner scan = new Scanner(System.in);
			System.out.println("1 for Balance");
			System.out.println("2 for Deposit");
			System.out.println("3 for Withdrawal");
			System.out.println();
			System.out.print("Enter the choice: ");
			String option = scan.nextLine();
			switch(option){
			case "1":
				System.out.println("Your current Balance: $" +currentBal);
				break;
				// not in the pseudo code but inputting a negative value for deposit seemed counter intuitive so added a if statement to balance
			case "2":
				System.out.print("Please enter the amount you would like to deposit: $");
				double bal = scan.nextDouble();
				if(bal<0){
					System.out.println("Deposit amount cannot be less than 0");
				}
				else{
				currentBal = currentBal + bal;
				}
				
				System.out.println("Your current Balance: $" +currentBal);
				scan.nextLine();
				break;
			case "3":
				System.out.print("Please enter the amount you want to withdraw: $");
				 bal = scan.nextDouble();
				//also not in the pseudo code but I wanted to make sure you can't over draw
				 if(bal> currentBal){
					 System.out.println("Withdrawal amount cannot be greater than current balance amount");
				 /*
				  * struggled with using the word withdraw or withdrawal in this last line not related to java but important to me....
				  * found out withdraw is more of a verb and withdrawal is more of a noun.
				  * I've always pronounced it the same which caused the confusion :D
				  */
				 }
				 else{
				currentBal = currentBal - bal;
				 }
				System.out.println("The current Balance: $" +currentBal);
				scan.nextLine();
				break;
				default : System.out.println("You have entered a incorrect value");
			}
			System.out.println();
			System.out.print("Would you like to make another transaction(Y/N)?  ");
			option = scan.nextLine();
			if(!"Y".equalsIgnoreCase(option)){
				break;
			}
		}while(true);	
		System.out.println("Thank you! And come back soon.");
	}
}
