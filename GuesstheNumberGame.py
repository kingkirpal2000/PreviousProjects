import random

print("Let's play a game!")
print("Please enter your name to begin.")
playerName = input()
print("In this game you will be guessing a number between 1 and 100")
print("Nice to meet you " + playerName + ", please enter your initial guess.")
theNumber = random.randint (1,100)
playerGuess = int(input())
while playerGuess > theNumber:
    print("The number is too high, please try again.")
    playerGuess = int(input())
while playerGuess < theNumber:
    print("The number is too low, please try again.")
    playerGuess = int(input())
else:
    print("That is correct!")
