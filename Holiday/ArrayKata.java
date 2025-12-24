import java.util.Arrays;

public class ArrayKata{
public static void main(String[] args){

int[] myArray = {4,5,8,9,3,2,7,6};

System.out.println(maximumIn(myArray));
System.out.println(minimumIn(myArray));
System.out.println(sumOfArray(myArray));
System.out.println(sumOfEven(myArray));
System.out.println(sumOfOdd(myArray));
System.out.println(Arrays.toString(maximumAndMinimum(myArray)));
System.out.println(numberOfEven(myArray));
System.out.println(numberOfOdd(myArray));
System.out.println(Arrays.toString(arrayOfOdd(myArray)));
System.out.println(Arrays.toString(arrayOfEven(myArray)));
System.out.println(Arrays.toString(squareArray(myArray)));
}

public static int maximumIn(int[] myArray){

int maximum = myArray[0];

for(int counter = 0;counter < myArray.length;counter++){
if(myArray[counter] > maximum)

maximum = myArray[counter];

}

return maximum;
}


public static int minimumIn(int[] myArray){
 
int minimum = myArray[0];

for(int counter = 0;counter < myArray.length;counter++){
if(myArray[counter] < minimum)

minimum = myArray[counter];

}

return minimum;

}



public static int sumOfArray(int[] myArray){

int sum = 0;                                                    

for(int counter = 0;counter < myArray.length;counter++){
sum += myArray[counter];
}

return sum;

}



public static int sumOfEven(int[] myArray){

int sum = 0;                                                    

for(int counter = 0;counter < myArray.length;counter++){

if(myArray[counter] % 2 == 0){
sum += myArray[counter];
}

}

return sum;

}



public static int sumOfOdd(int[] myArray){

int sum = 0;
                                                    

for(int counter = 0;counter < myArray.length;counter++){

if(myArray[counter] % 2 != 0){
sum += myArray[counter];
}

}

return sum;

}



public static int[] maximumAndMinimum(int[] myArray){

int number = myArray[0];


int[] newArray = new int[2];

for(int counter = 0;counter < myArray.length;counter++){
if(myArray[counter] < number)

newArray[0] = myArray[counter];

}
for(int counter = 0;counter < myArray.length;counter++){
if(myArray[counter] > number)

newArray[1] = myArray[counter];

}

return newArray;

}



public static int numberOfEven(int[] myArray){

int count = 0;                                                    

for(int counter = 0;counter < myArray.length;counter++){

if(myArray[counter] % 2 == 0){
count += 1;
}

}

return count;

}


public static int numberOfOdd(int[] myArray){

int count = 0;                                                    

for(int counter = 0;counter < myArray.length;counter++){

if(myArray[counter] % 2 != 0){
count += 1;
}

}

return count;

}


public static int[] arrayOfOdd(int[] myArray){

int index = 0;

int[] newArray = new int[(myArray.length / 2)];                                                    

for(int counter = 0;counter < myArray.length;counter++){

if(myArray[counter] % 2 != 0){
newArray[index] = myArray[counter];
index++;
}

}

return newArray;

}

public static int[] arrayOfEven(int[] myArray){

int index = 0;

int[] newArray = new int[(myArray.length / 2)];                                                    

for(int counter = 0;counter < myArray.length;counter++){

if(myArray[counter] % 2 == 0){
newArray[index] = myArray[counter];
index++;
}

}

return newArray;

}

public static int[] squareArray(int[] myArray){

int[] newArray = new int[(myArray.length)];                                                    

for(int counter = 0;counter < myArray.length;counter++){

newArray[counter] = myArray[counter] * 2;

}

return newArray;

}

}
