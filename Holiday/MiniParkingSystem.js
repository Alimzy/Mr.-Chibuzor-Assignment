const prompt = require('prompt-sync')()
function availableSpace(myArray){

availableSpaceBox = []
for(let count = 0; count <= myArray.length;count++){
if (myArray[count] == 0){

availableSpaceBox[count] = 1
}

   
}
 return availableSpaceBox
}
       
    


function occupiedSpace(myArray){

occupiedSpace_box = []
for(let count = 0; count <= myArray.length; count++ ){
if( myArray[count] == 1){
occupiedSpaceBox[count] = 1
}

}
        
    return occupiedSpaceBox
}
    





parkingSpace = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
while(true){

let menu =`
        1. Park your car
        2. Drive off your car
        3. Check available Space
        4. check occupied Space
        5. Stop programme
        `
    console.log(menu)

let option = parseInt(prompt("Enter an option"))

if (option == 1){

let parkCar = parseInt(prompt("Enter the slot you want to park your car? "))
if (parkCar < 0 || parkCar  > parkingSpace.length){
console.log("Slot number does not exist, there is only 20 valid spot!")
} else if(parkingSpace[parkCar] == 1){
console.log("Space is already occupied!")
}else{
parkingSpace[parkCar] = 1
console.log("You have successfully parked your car")

}
} else if(option == 2){
let removeCar = parseInt(prompt("Enter the slot where you want to unpark your car? "))
if (removeCar < 0 || removeCar > parkingSpace.lenth){
console.log("Slot number does not exist,there is only 20 valid spot!")
} else if( parkingSpace[removeCar] == 0){
console.log("Space is empty!")
}else{
parkingSpace[removeCar] = 0
console.log("you have succesfully unparked your car")
}
}else if(option == 3){
let availableSlot = availableSpace(parkingSpace)
       console.log("These are the available space")
        console.log(availableSlot)
} else if(option == 4){
        occupiedSlot = occupiedSpace(parking_space)
        console.log("These are the occupied space")
        console.log(occupiedSlot)
}else if( option == 5){ 
        console.log("Hope you had an amazing experience? ")
        break
}else{
  print("ivalid input,Enter option again! ")
}
      
}

