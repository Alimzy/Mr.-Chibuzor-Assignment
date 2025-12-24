import java.util.Scanner;
import java.util.Arrays;

public class CreditCard{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Hello, Kindy Enter card details to verify");
String cardDetails = input.nextLine();
System.out.println(Arrays.toString(turnToArray(cardDetails)));

System.out.println(cardType(turnToArray(cardDetails)));
System.out.println(additionFirst(turnToArray(cardDetails)));
System.out.println(additionSecond(turnToArray(cardDetails)));
System.out.println(finalAddition(turnToArray(cardDetails)));
System.out.println(divisible(turnToArray(cardDetails)));
}

public static int[] turnToArray(String input){
int[] arrayCard = new int [input.length()];
for(int counter =0;counter < input.length(); counter++){
arrayCard[counter] = input.charAt(counter) - '0';
}

return arrayCard;
}

public static String cardType(int[] arrayCard){
if(arrayCard[0] == 4){
return "Visa Card";
}else if( arrayCard[0] == 5){
return "MasterCards";
}else if(arrayCard[0] == 3 && arrayCard[1] == 7){
return "American Express Cards";
}else if(arrayCard[0] == 6){
return "Discover cards";
}
 
return "invalid Card Type";
}


public static int additionFirst(int[] arrayCard){
int totalSum = 0;
int multiplication = 1;
int sum;
for(int counter = arrayCard.length -1;counter >= 0; counter-=2){

  multiplication = arrayCard[counter] * 2;
  if(multiplication > 9){
   sum = (multiplication /10) + (multiplication % 10);
    totalSum += sum;

}else{
sum = multiplication;
}
 totalSum += sum;

}

return totalSum;

}
public static int additionSecond(int[] arrayCard){

int totalSum = 0;

for(int counter = arrayCard.length -1; counter >= 0; counter--){
if(counter %2 != 0){
totalSum += arrayCard[counter];
}
}
return totalSum;
}

public static int finalAddition(int[] arrayCard){
int additionOne = additionFirst( arrayCard);
int additionTwo = additionSecond(arrayCard);

int addition = additionOne + additionTwo;

return addition;

}

public static String divisible(int[] arrayCard){

if(finalAddition(arrayCard) % 10 == 0 ){
return "valid";
}
return "invalid";
}



} 
