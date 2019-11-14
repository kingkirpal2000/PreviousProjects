import random

print("Welcome to the Dice Rolling Simulator!")
print("This simulator will pick a number for your from 1 to 6, mirroring an actual die")

print("Press enter if you're ready to roll the dice!")
roll = input()
roll = True
while roll == True:
    rolledNumber= random.randint(1,6)
    print(rolledNumber)
    break
print("Press Enter to get a new number")
newNumber = input()
newNumber = True
if newNumber == True:
    while newNumber == True:
        rolledNumber= random.randint(1,6)
        print(rolledNumber)
        print("Press Enter to get a new number")
        newNumber = input()
        newNumber = True
        if newNumber == True:
            rolledNumber= random.randint(1,6)
        else:
            break
       
        

