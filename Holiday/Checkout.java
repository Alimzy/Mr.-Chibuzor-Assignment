import java.util.Scanner;

public class Checkout{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("HI! who is the cashier for this ivoice? ");
String cashierName = input.nextLine();


System.out.print("What is the customer's Name? ");
String customerName = input.nextLine();


String[] itemNames = new String[40];
int[] numberOfItems = new int[40];
double[] amountPerUnits = new double[40];
double[] totals = new double[40];

int count = 0;


while(true){

System.out.println("What did the user buy? ");
itemNames[count] = input.nextLine();


System.out.println("How many pieces? ");
//int numberOfItem = input.nextInt();
amountPerUnits[count] = input.nextInt();

System.out.println("How much per unit? ");
//double amountPerUnit = input.nextDouble();
numberOfItems[count] = input.nextInt();

totals[count] = amountPerUnits[count] * numberOfItems[count];

 input.nextLine();

System.out.println("Add more item? (YES/NO)");
String add = input.nextLine().trim();

count++;
if(add.equalsIgnoreCase("NO")){
break;
}


}

System.out.println("How much discount will he/she get? ");
 double inputDiscount = input.nextDouble();

double subTotal = 0;




System.out.println();
System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%s%n%s%s%n","SEMICOLON STORES","MAIN BRANCH", "LOCATION: 312 HERBERT MACAULAY, SABO YABA, LAGOA", "08056906817","DATE: 18-Dec-22 8:48:11pm","cashier: ",cashierName,"Customer Name: ",customerName);

System.out.println("================================================================================");

System.out.printf("%20s%10s%10s%15s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");

//System.out.printf("%20s%10s%10s%15s\n",itemName, numberOfItem, amountPerUnit,total);
for(int counter = 0; counter < count;counter++){
System.out.printf("%20s%10d%10f%15f\n",itemNames[counter], numberOfItems[counter], amountPerUnits[counter],totals[counter]);

subTotal += totals[counter];
}

double discount = (inputDiscount / 100) * subTotal;

double vat = (17.50 / 100) * subTotal;

double totalBill = (subTotal + vat) - discount;


System.out.println("--------------------------------------------------------------------------------");
System.out.printf("%30s%15f\n","Sub Total: ", subTotal);
System.out.printf("%30s%15f\n" ,"Discout: ",discount);
System.out.printf("%30s%15f\n" ,"VAT @17.50%: ",vat);

System.out.println("================================================================================");

System.out.printf("%30s%15f\n" ,"Bill Total: ", totalBill);
System.out.println("================================================================================");
System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + totalBill);
System.out.println("================================================================================");

System.out.println("How much did the customer give to you? ");
double amountPaid = input.nextDouble();
double  balance = amountPaid - totalBill;
System.out.println();
System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%s%n%s%s%n","SEMICOLON STORES","MAIN BRANCH", "LOCATION: 312 HERBERT MACAULAY, SABO YABA, LAGOA", "08056906817","DATE: 18-Dec-22 8:48:11pm","cashier: ",cashierName,"Customer Name: ",customerName);

System.out.println("================================================================================");

System.out.printf("%20s%10s%10s%15s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");

for(int counter = 0; counter < count;counter++){
System.out.printf("%20s%10d%10f%15f\n",itemNames[counter], numberOfItems[counter], amountPerUnits[counter],totals[counter]);

subTotal += totals[counter];
}

System.out.println("--------------------------------------------------------------------------------");
System.out.printf("%30s%15f\n","Sub Total: ", subTotal);
System.out.printf("%30s%15f\n" ,"Discout: ",discount);
System.out.printf("%30s%15f\n" ,"VAT @17.50%: ",vat);

System.out.println("================================================================================");

System.out.printf("%30s%15f\n" ,"Bill Total: ", totalBill);
System.out.printf("%30s%15f\n" ,"Amount Paid: ", amountPaid);

System.out.printf("%30s%15f\n" ,"Balance: ", balance);




System.out.println("================================================================================");
System.out.printf("%30s\n","THANK YOU FOR YOUR PATRONAGE");
System.out.println("================================================================================");





}


}
