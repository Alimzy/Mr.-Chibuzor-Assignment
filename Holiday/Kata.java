public class Kata{
public static void main(String[] args){

System.out.println(isEven(2));
System.out.println(isPrime(11));
System.out.println(subtract(2,7));
System.out.println(divide(14,7));
System.out.println(factorOf(10));
System.out.println(palindrome(54145));
System.out.println(squareNumber(5));
System.out.println(factorialOf(5));
System.out.println(isSquare(16));
}

public static boolean isEven(int number){
if(number % 2 == 0)
return true;
else if(number % 2 != 0){
}
return false;
}


public static boolean isPrime(int number){

for(int count = 2;count < number;count++)
if(number % count == 0){
return false;
}


return true;
}


public static int subtract(int numberOne,int numberTwo){
int subtraction = numberOne - numberTwo;

return Math.abs(subtraction);
}


public static int divide(int numberOne, int numberTwo){
if(numberTwo == 0){

return numberTwo;
}

int division = numberOne / numberTwo;

return division;
}

public static int factorOf(int number){
int count = 0;
for(int counter =1; counter <= number; counter++){
if(number % counter == 0)
count += 1;
}
return count;
}

public static boolean palindrome(int number){
int firstNumber = number / 10000;
int secondNumber = (number / 1000) % 10;
int thirdNumber = (number / 100) % 10;
int fourthNumber = (number / 10) % 10;
int fifthNumber = number % 10;

if(firstNumber == fifthNumber && secondNumber == fourthNumber){
return true;
}

return false;
}
public static int factorialOf(int number){
int factorial = 1;
for(int count =1; count <= number;count++){
factorial *= count;

}

return factorial;
}

public static long squareNumber(long number){

long square = number * number;

return square;
}

public static boolean isSquare(int number){
for(int counter = 1; counter < number; counter++){
if(counter * counter == number){

return true;
}


}
return false;
}





}
