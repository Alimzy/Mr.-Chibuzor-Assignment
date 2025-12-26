import java.util.Scanner;

public class Checkout{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("HI! who is the cashier for this ivoice? ");
String cashierName = input.nextLine();


System.out.print("What is the customer's Name? ");
String customerName = input.nextLine();


boolean count = true;

//while(count){

System.out.println("What did the user buy? ");
String itemName = input.nextLine();


System.out.println("How many pieces? ");
int numberOfItem = input.nextInt();

System.out.println("How much per unit? ");
double amountPerUnit = input.nextDouble();


System.out.println("Add more item? ");
String repeat = input.nextLine();

if(repeat.equalsIgnoreCase("yes")){
count = false;

System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n","SEMICOLON STORES","MAIN BRANCH", "LOCATION: 312 HERBERT MACAULAY, SABO YABA, LAGOA", "08056906817","DATE: 18-Dec-22 8:48:11pm",cashierName,customerName);

//}

}

double total = amountPerUnit * numberOfItem;
double subTotal = total;

double discount = 0.08 * total;

double vat = (17.50 / 100) * total;

double totalBill = (subTotal + vat) - discount;


System.out.println();
System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%s%n%s%s%n","SEMICOLON STORES","MAIN BRANCH", "LOCATION: 312 HERBERT MACAULAY, SABO YABA, LAGOA", "08056906817","DATE: 18-Dec-22 8:48:11pm","cashier: ",cashierName,"Customer Name: ",customerName);

System.out.println("================================================================================");

System.out.printf("%20s%10s%10s%15s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");

System.out.printf("%20s%10s%10s%15s\n",itemName, numberOfItem, amountPerUnit,total);
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
double amountPerUnit = input.nextDouble();

}


}
