
def is_even(number):
    if number % 2 == 0:
        return True
    elif number % 2 != 0:
        return False

print(is_even(3))

def is_prime(number):
    for count in range(2,number):
        if number % count == 0:
            return False
        else:
            return True
print(is_prime(7))

def substract(number_one, number_two):
    subtraction = number_one - number_two
    return abs(subtraction) 

print(substract(2,4))


def divide(number_one, number_two):
    if number_two == 0:
        return number_two
    else:
        divide = number_one // number_two
        return divide

print(divide(16,4))

def factor_of(number):
    counter = 0
    for count in range(1,number):
        if count % 2 == 0:
            counter +=1
    return counter

print(factor_of(10))

def palindrome(number):
    first_number = number // 10000
    second_number = (number // 1000) % 10
    third_number = (number // 100) % 10
    fourth_number = (number // 10) % 10
    last_number = number % 10
    
    if first_number == last_number and second_number == fourth_number:
        return True
    return False

print(palindrome(54145))

def factorial_of(number):
    factorial = 1
    for count in range(1,number + 1):
        factorial *=count
    return factorial

print(factorial_of(5))


def square_of(number):
    square = number * number
    return square

print(square_of(5))

def is_square(number):
    for count in range(1,number):
        if count * count == number:           
            return True
    return False

print(is_square(25))
