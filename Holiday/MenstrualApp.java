import java.util.Scanner;

public class MenstrualApp{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the current day of your cycle? N/B:The start of your cycle start when you start bleeding ");
int currentDay = input.nextInt();

System.out.println("How many days does your bleeding last? ");
int periodDuration = input.nextInt();

System.out.println("How many days does your last cycle last? ");
int lastPeriodCycle = input.nextInt();

int nextCycle = lastPeriodCycle - currentDay;


int ovulationDay = lastPeriodCycle  - 14;
int whenOvulationDay = ovulationDay - currentDay;
if(whenOvulationDay < 0){
whenOvulationDay += lastPeriodCycle;
}

int fertilePeriodStart =  ovulationDay - 5;
int whenFertilePeriodStart = fertilePeriodStart - currentDay;
if(whenFertilePeriodStart < 0){
whenFertilePeriodStart += lastPeriodCycle;
}

int fertilePeriodEnd =  ovulationDay;
int whenFertilePeriodEnd = fertilePeriodEnd - currentDay;
if(whenFertilePeriodEnd < 0){
whenFertilePeriodEnd += lastPeriodCycle;
}


int safePeriodOneStart = periodDuration;
int whenSafePeriodOneStart = safePeriodOneStart - currentDay;
if( whenSafePeriodOneStart < 0){
whenSafePeriodOneStart += lastPeriodCycle;
}

int safePeriodOneEnd = fertilePeriodStart - 1;
int whenSafePeriodOneEnd = safePeriodOneEnd - currentDay;
if( whenSafePeriodOneEnd < 0){
whenSafePeriodOneEnd += lastPeriodCycle;
}

int safePeriodTwoStart = ovulationDay + 1;
int whenSafePeriodTwoStart = safePeriodTwoStart - currentDay;
if( whenSafePeriodTwoStart < 0){
whenSafePeriodTwoStart += lastPeriodCycle;
}


int safePeriodTwoEnd = lastPeriodCycle;
int whenSafePeriodTwoEnd = safePeriodTwoEnd - currentDay;
if( whenSafePeriodTwoEnd < 0){
whenSafePeriodTwoEnd += lastPeriodCycle;
}

System.out.println();


if(currentDay >= 1 && currentDay <= periodDuration){
System.out.println("You are in your flow period always go around with pads, and stay safe!");
}else if(currentDay >= periodDuration && currentDay <= safePeriodOneEnd){
System.out.println("You are in your safe period, fuck well and fuck safe and note this does not mean you can't have pregnant but it is low risk");
}else if(currentDay >= fertilePeriodStart && currentDay <= fertilePeriodEnd){
System.out.println("You are in your fertile period. Avoid men this period, there is high chance you get pregnant this period");
}else if(currentDay == ovulationDay){
System.out.println("You are in your ovulation period");
}else if(currentDay >= safePeriodTwoStart && currentDay <= lastPeriodCycle){
System.out.println("You are in your safe period, fuck well and fuck safe and note this does not mean you can't have pregnant but it is low risk");
}

System.out.println();

System.out.println("Your next menstrual cycle is happenng in " + nextCycle + " days ");
System.out.println();

System.out.println("Your next ovulation day is happenng in " + whenOvulationDay + " days ");
System.out.println();

System.out.println("Your first safe period is starting in " + whenSafePeriodOneStart  + " days and end in " + whenSafePeriodOneEnd + " days ");
System.out.println();

System.out.println("Your second safe period is happenng in " + whenSafePeriodTwoStart + " days and end in " + whenSafePeriodTwoEnd+" days ");
System.out.println();

System.out.println("Your next fertile period is starting in " + whenFertilePeriodStart + " days and end in " + whenFertilePeriodEnd + " days ");
System.out.println();

}

}
