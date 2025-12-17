myArray = [2,3,59,9,4]

def maximum_in(myArray = []):
    maximum = myArray[0]
    for count in range(0,len(myArray)):
        if myArray[count] > maximum:
            maximum = myArray[count]
    return maximum

print(maximum_in(myArray))


def minimum_in(myArray = []):
    minimum = myArray[0]
    for count in range(0,len(myArray)):
        if myArray[count] < minimum:
            minimum = myArray[count]
    return minimum

print(minimum_in(myArray))


def sum_of_array(myArray = []):
    sum = 0
    for count in range(0,len(myArray)):
        sum += myArray[count]
    return sum

print(sum_of_array(myArray))


def sum_of_even(myArray = []):
    sum = 0
    for count in range(0,len(myArray)):
        if myArray[count] % 2 == 0:
            sum += myArray[count]
    return sum

print(sum_of_even(myArray))


def sum_of_odd(myArray = []):
    sum = 0
    for count in range(0,len(myArray)):
        if myArray[count] % 2 != 0:
            sum += myArray[count]
    return sum

print(sum_of_odd(myArray))


def maximum_minimum(myArray = []):
    maximum = myArray[0]
    minimum = myArray[0]
    newArray = []
    for count in range(0,len(myArray)):
        if myArray[count] > maximum:
            maximum = myArray[count]
        if myArray[count] < minimum:
            maximum = myArray[count]
    newArray.append(maximum)
    newArray.append(minimum)  
    return newArray

print(maximum_minimum(myArray))


def number_of_odd(myArray = []):
    counter = 0
    for count in range(0,len(myArray)):
        if myArray[count] % 2 != 0:
            counter +=1
    return counter

print(number_of_odd(myArray))


def number_of_even(myArray = []):
    counter = 0
    for count in range(0,len(myArray)):
        if myArray[count] % 2 == 0:
            counter +=1
    return counter

print(number_of_even(myArray))

def array_of_even(myArray = []):
    newArray = []
    for count in range(0,len(myArray)):
        if myArray[count] % 2 == 0:
            newArray.append(myArray[count])
    return newArray

print(array_of_even(myArray))

def array_of_odd(myArray = []):
    newArray = []
    for count in range(0,len(myArray)):
        if myArray[count] % 2 != 0:
            newArray.append(myArray[count])
    return newArray

print(array_of_odd(myArray))


def square_of_array(myArray = []):
    newArray = []
    for count in range(0,len(myArray)):
        square = myArray[count] * 2
        newArray.append(square)
    return newArray

print(square_of_array(myArray))

