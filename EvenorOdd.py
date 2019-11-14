print("Welcome to the even or odd integer checking software!")
print("Please enter an integer")
while True:
    
    integer = int(input()) 
    integer = (integer % 2)
    if integer == 0:
        print("This is an even integer")
        print("Please enter another integer")
    elif integer != 0:
        print("This is an odd integer")
        print("Please enter another integer")
