import java.text.DecimalFormat;
import java.util.Scanner;

public class IncomeTax {

	
	public static void main(String[] args) {
		System.out.print("Please enter your taxable annual income: $");
		Scanner s = new Scanner(System.in);
		double intax = s.nextDouble();
		double tax;
		if(intax>=379150){
			tax = 0.35*intax;
		}
		else if (intax >=174400){
			tax = 0.33*intax;
		}
		else if (intax >=83600){
			tax = 0.28*intax;
		}
		else if (intax >=34500){
			tax = 0.25*intax;
		}
		else if (intax >=8500){
			tax = 0.15*intax;
		}
		else{
			tax = 0.10*intax;
		}
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("The taxable income of $"+df.format(intax) +" has a total tax due of $"+df.format(tax));

	}

}



