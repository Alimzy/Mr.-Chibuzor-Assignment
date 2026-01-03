const prompt = require('prompt-sync')()
def available_space(myArray):
    available_space_box = []
    for count in range(0,len(myArray)):
        if myArray[count] == 0:
            available_space_box.append(count)
    return available_space_box


def occupied_space(myArray):
    occupied_space_box = []
    for count in range(0,len(myArray)):
        if myArray[count] == 1:
            occupied_space_box.append(count)
    return occupied_space_box





parking_space = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
while(True):
    menu ="""
        1. Park your car
        2. Drive off your car
        3. Check available Space
        4. check occupied Space
        5. Stop programme
        """
    print(menu)

    option = int(input("Enter an option"))

    if option == 1:
        park_car = int(input("Enter the slot you want to park your car? "))
        if park_car < 0 or park_car >len(parking_space):
            print("Slot number does not exist, there is only 20 valid spot!")
        elif parking_space[park_car] == 1:
            print("Space is already occupied!")
        else: 
            parking_space[park_car] = 1
            print("You have successfully parked your car")
    elif option == 2:
        remove_car = int(input("Enter the slot where you want to unpark your car? "))
        if park_car < 0 or park_car >len(parking_space):
            print("Slot number does not exist,there is only 20 valid spot!")
        elif parking_space[remove_car] == 0:
            print("Space is empty!")
        else: 
            parking_space[remove_car] = 0
            print("you have succesfully unparked your car")
    elif option == 3:
        available_slot = available_space(parking_space)
        print("These are the available space")
        print(available_slot)
    elif option == 4:
        occupied_slot = occupied_space(parking_space)
        print("These are the occupied space")
        print(occupied_slot)
    elif option == 5:
        print("Hope you had an amazing experience? ")
        break
    else:
        print("ivalid input,Enter option again! ")







