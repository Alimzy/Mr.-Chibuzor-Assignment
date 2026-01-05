

currentDay = int(input("Enter the current day of your cycle? N/B:The start of your cycle start when you start bleeding"))


periodDuration = int(input("How many days does your bleeding last? "))


lastPeriodCycle = int(input("How many days does your last cycle last? "))


nextCycle = lastPeriodCycle - currentDay


ovulationDay = lastPeriodCycle  - 14
whenOvulationDay = ovulationDay - currentDay
if whenOvulationDay < 0:
    whenOvulationDay += lastPeriodCycle


fertilePeriodStart =  ovulationDay - 5
whenFertilePeriodStart = fertilePeriodStart - currentDay
if whenFertilePeriodStart < 0:
    whenFertilePeriodStart += lastPeriodCycle


fertilePeriodEnd =  ovulationDay
whenFertilePeriodEnd = fertilePeriodEnd - currentDay
if whenFertilePeriodEnd < 0:
    whenFertilePeriodEnd += lastPeriodCycle



safePeriodOneStart = periodDuration
whenSafePeriodOneStart = safePeriodOneStart - currentDay;
if whenSafePeriodOneStart < 0:
    whenSafePeriodOneStart += lastPeriodCycle


safePeriodOneEnd = fertilePeriodStart - 1
whenSafePeriodOneEnd = safePeriodOneEnd - currentDay
if whenSafePeriodOneEnd < 0:
    whenSafePeriodOneEnd += lastPeriodCycle


safePeriodTwoStart = ovulationDay + 1
whenSafePeriodTwoStart = safePeriodTwoStart - currentDay
if whenSafePeriodTwoStart < 0:
    whenSafePeriodTwoStart += lastPeriodCycle


safePeriodTwoEnd = lastPeriodCycle
whenSafePeriodTwoEnd = safePeriodTwoEnd - currentDay
if whenSafePeriodTwoEnd < 0:
    whenSafePeriodTwoEnd += lastPeriodCycle


print()


if currentDay >= 1 and currentDay <= periodDuration:
    print("You are in your flow period always go around with pads, and stay safe!")
elif currentDay >= periodDuration and currentDay <= safePeriodOneEnd:
    print("You are in your safe period, fuck well and fuck safe and note this does not mean you can't have pregnant but it is low risk")
elif currentDay >= fertilePeriodStart and currentDay <= fertilePeriodEnd:
    print("You are in your fertile period. Avoid men this period, there is high chance you get pregnant this period")
elif currentDay == ovulationDay:
    print("You are in your ovulation period")
elif currentDay >= safePeriodTwoStart and currentDay <= lastPeriodCycle:
    print("You are in your safe period, fuck well and fuck safe and note this does not mean you can't have pregnant but it is low risk")


print();

print("Your next menstrual cycle is happenng in ", nextCycle , " days ")
print()

print("Your next ovulation day is happenng in ", whenOvulationDay ," days ")
print()

print("Your first safe period is starting in ", whenSafePeriodOneStart  , " days and end in " , whenSafePeriodOneEnd , " days ")
print()

print("Your second safe period is happenng in " , whenSafePeriodTwoStart , " days and end in " , whenSafePeriodTwoEnd , " days ")
print()

print("Your next fertile period is starting in " , whenFertilePeriodStart , " days and end in " , whenFertilePeriodEnd , " days ")
print()

