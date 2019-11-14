
from datetime import date
print("Hello, I will be telling you the year you will be turning 100!")
print("Let's start by introducing yourself... What is your name?")
myName = input()
print("It's great to meet you " + myName + "!" + " Enter your current age")
currentAge = int(input())
finalAge = int(100) 
sub = finalAge - currentAge
sub = str(sub)
print("According to my calculations " + myName + ", you will be 100 years old in " + sub + " years!")
sub = int(sub)
thisYear = int(2019)
yearHundred = thisYear + sub
yearHundred = str(yearHundred)
print("Hence you will be 100 years old in the year, " + yearHundred)



