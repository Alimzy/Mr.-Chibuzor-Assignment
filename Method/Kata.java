public class Kata{
public static void main(String[] args){


System.out.println(isEven(7));
System.out.println(subtract(3,7));
System.out.println(isPrimeNumber(7));
System.out.println(divide(7,0));
System.out.println(squareOf(5));
System.out.println(factorialOf(5));
System.out.println(factorOf(4));
System.out.println(isPalindrone(12321));
}

public static boolean isEven(int a){
if(a % 2 == 0){
return true;
}else{
return false;
}
}

public static boolean isPrimeNumber(int number){
for(int counter = 2; counter < number; counter++){
if(number % counter == 0){
//System.out.println("false");
return false;
}
}

return true;
}

public static int subtract(int numberOne , int numberTwo){
int subtraction = numberOne - numberTwo;
 return Math.abs(subtraction);
}


public static float divide(int numberOne, int numberTwo){
if(numberTwo == 0){
return 0;
}else{
return numberOne / numberTwo;
}
}


public static long factorialOf(int number){
long factorial = 1;
for(int counter = 1; counter <= number; counter++){
  factorial = factorial * counter;
}
return factorial;
}

public static boolean isPalindrone(int number){
 int firstDigit = number / 10000;
 int secondDigit = (number / 1000)% 10;
 int thirdDigit = (number / 100)% 10;
 int fourthDigit = (number / 10)% 10;
 int fifthDigit = number % 10;

if(firstDigit == fifthDigit && secondDigit == fourthDigit){
return true;
}else{
return false
;
}


}

public static long squareOf(int number){
return number * number;
}


public static int factorOf(int number){
int numOfFactorial = 1;
 for(int counter =1; counter < number; counter++){
   if( number % counter == 0){
    numOfFactorial += 1;
}
}
 return numOfFactorial;

}






}
