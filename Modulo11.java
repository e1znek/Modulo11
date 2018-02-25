import java.util.Scanner; 

public class Modullo11 {
   public static void main(String[] args) {
	   
   	int[] check = {2, 3, 4, 5, 6, 7};
   	Scanner reader = new Scanner(System.in);  // Reading from System.in
	System.out.println("Please enter account number for validation.");
	//Takes in user input.	
	String account_OG = reader.nextLine();
	reader.close(); 

	String account = account_OG.replace(".", ""); //removes "." from line.
	int len = account.length();
	

	
	//Ensure number at end.
	if(!Character.isDigit(account.charAt(len-1))){
		System.out.println(account_OG + " contains non-digits and is not a valid account number.");
		System.exit(0);
	}
	//Get control number
	int control = Character.getNumericValue(account.charAt(len-1));
	System.out.println("control number is: " + control);
	int sum = 0;
	int j = 0; //Used for weighted number array: check.
	
	for(int i = len-2; i>=0; i--){
		if(!Character.isDigit(account.charAt(i))){
			System.out.println(account_OG + " contains non-digits and is not a valid account number.");
			System.exit(0);
		}
		sum = sum + (check[j%6] * (Character.getNumericValue(account.charAt(i))));
  		j++;
	}
	   
	//Compares sum calculations to original control number.
	if(11-(sum%11) == control){
		System.out.println(account_OG + " is a valid account number.");
	}else{
		System.out.println(account_OG + " is not a valid account number.");
	}

   }
}




