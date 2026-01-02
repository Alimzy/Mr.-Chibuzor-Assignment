import java.util.Scanner;
import java.util.ArrayList;

public class MiniParkingSystem{
public static void main(String... args){
Scanner input = new Scanner(System.in);


int[] parkingSpace = new int[20];

 
while(true){


String menu = """
  1. Park your car
  2. Drive off your car
  3. Check available Space
  4. check occupied Space
  5. Stop programme
""";
System.out.println(menu);

System.out.println("Enter your option");
int option = input.nextInt();

if(option == 1){
System.out.println("Enter the slot you want to park your car? ");
int parkCar = input.nextInt();

if(parkingSpace[parkCar] == 1){
System.out.println("Slot is occupied");
}else{
parkingSpace[parkCar] = 1;
System.out.println("you have succesfully parked your car");

}

}else if(option == 2){
System.out.println("Enter the slot where your car is? ");
int removeCar = input.nextInt();

if(parkingSpace[removeCar] == 0){
System.out.println("Slot is empty! ");
}else {
parkingSpace[removeCar] = 0;
System.out.println("you have succesfully unparked your car");
}
}else if(option == 3){
ArrayList<Integer> availableSpace = availableSpace(parkingSpace);
System.out.println("These are the available spaces");
System.out.println(availableSpace);


}else if(option == 4){
System.out.println("These are the occupied spaces");
ArrayList<Integer> occupiedSpace = occupiedSpace(parkingSpace);
System.out.println(occupiedSpace);
}else if(option == 5){
System.out.println("Hope you had an amazing experience?");
break;
}else{
System.out.println("Invalid input, Enter option again! ");
}

}
}


public static ArrayList<Integer> availableSpace(int[] myArray ){
ArrayList<Integer> availableSpace = new ArrayList<>();
for(int counter = 0; counter < myArray.length;counter++){
if (myArray[counter] == 0){
availableSpace.add(counter );

}
}
return availableSpace;

}

public static ArrayList<Integer>  occupiedSpace(int[] myArray ){
ArrayList<Integer> occupiedSpace = new ArrayList<>();
for(int counter = 0; counter < myArray.length;counter++){
if (myArray[counter] == 1){
occupiedSpace.add(counter );

}

}
return occupiedSpace;
}
}
