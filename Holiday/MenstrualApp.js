const prompt = require('prompt-sync')()

let currentDay = Number(prompt("Enter the current day of your cycle? N/B:The start of your cycle start when you start bleeding"))


let periodDuration = Number(prompt("How many days does your bleeding last? "))


let lastPeriodCycle = Number(prompt("How many days does your last cycle last? "))


let nextCycle = lastPeriodCycle - currentDay


let ovulationDay = lastPeriodCycle  - 14
let whenOvulationDay = ovulationDay - currentDay;
if(whenOvulationDay < 0){
whenOvulationDay += lastPeriodCycle;
}

let fertilePeriodStart =  ovulationDay - 5;
let whenFertilePeriodStart = fertilePeriodStart - currentDay;
if(whenFertilePeriodStart < 0){
whenFertilePeriodStart += lastPeriodCycle;
}

let fertilePeriodEnd =  ovulationDay;
let whenFertilePeriodEnd = fertilePeriodEnd - currentDay;
if(whenFertilePeriodEnd < 0){
whenFertilePeriodEnd += lastPeriodCycle;
}


let safePeriodOneStart = periodDuration;
let whenSafePeriodOneStart = safePeriodOneStart - currentDay;
if( whenSafePeriodOneStart < 0){
whenSafePeriodOneStart += lastPeriodCycle;
}

let safePeriodOneEnd = fertilePeriodStart - 1;
let whenSafePeriodOneEnd = safePeriodOneEnd - currentDay;
if( whenSafePeriodOneEnd < 0){
whenSafePeriodOneEnd += lastPeriodCycle;
}

let safePeriodTwoStart = ovulationDay + 1;
let whenSafePeriodTwoStart = safePeriodTwoStart - currentDay;
if( whenSafePeriodTwoStart < 0){
whenSafePeriodTwoStart += lastPeriodCycle;
}


let safePeriodTwoEnd = lastPeriodCycle;
let whenSafePeriodTwoEnd = safePeriodTwoEnd - currentDay;
if( whenSafePeriodTwoEnd < 0){
whenSafePeriodTwoEnd += lastPeriodCycle;
}

console.log();


if(currentDay >= 1 && currentDay <= periodDuration){
console.log("You are in your flow period always go around with pads, and stay safe!");
}else if(currentDay >= periodDuration && currentDay <= safePeriodOneEnd){
console.log("You are in your safe period, fuck well and fuck safe and note this does not mean you can't have pregnant but it is low risk");
}else if(currentDay >= fertilePeriodStart && currentDay <= fertilePeriodEnd){
console.log("You are in your fertile period. Avoid men this period, there is high chance you get pregnant this period");
}else if(currentDay == ovulationDay){
console.log("You are in your ovulation period");
}else if(currentDay >= safePeriodTwoStart && currentDay <= lastPeriodCycle){
console.log("You are in your safe period, fuck well and fuck safe and note this does not mean you can't have pregnant but it is low risk");
}

console.log();

console.log("Your next menstrual cycle is happenng in " + nextCycle + " days ");
console.log();

console.log("Your next ovulation day is happenng in " + whenOvulationDay + " days ");
console.log();

console.log("Your first safe period is starting in " + whenSafePeriodOneStart  + " days and end in " + whenSafePeriodOneEnd + " days ");
console.log();

console.log("Your second safe period is happenng in " + whenSafePeriodTwoStart + " days and end in " + whenSafePeriodTwoEnd+" days ");
console.log();

console.log("Your next fertile period is starting in " + whenFertilePeriodStart + " days and end in " + whenFertilePeriodEnd + " days ");
console.log();

