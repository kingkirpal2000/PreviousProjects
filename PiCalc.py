from tkinter import *

# root is your main window
root = Tk()
root.title("My Calculator")
root.geometry('500x600')
root.resizable(True, True)

# 'unpack' the buttons here
# We used lambda in order to add multiple arguments and numbers store it within "equation"
button1 = Button(root, text="1", fg="red", width=10, height=5, command=lambda: btnPress(1))
button1.place(x=10, y=400)

button2 = Button(root, text="2", fg="red", width=10, height=5, command=lambda: btnPress(2))
button2.place(x=110, y=400)

button3 = Button(root, text="3", fg="red", width=10, height=5, command=lambda: btnPress(3))
button3.place(x=210, y=400)

button4 = Button(root, text="4", fg="red", width=10, height=5, command=lambda: btnPress(4))
button4.place(x=10, y=300)

button5 = Button(root, text="5", fg="red", width=10, height=5, command=lambda: btnPress(5))
button5.place(x=110, y=300)

button6 = Button(root, text="6", fg="red", width=10, height=5, command=lambda: btnPress(6))
button6.place(x=210, y=300)

button7 = Button(root, text="7", fg="red", width=10, height=5, command=lambda: btnPress(7))
button7.place(x=10, y=200)

button8 = Button(root, text="8", fg="red", width=10, height=5, command=lambda: btnPress(8))
button8.place(x=110, y=200)

button9 = Button(root, text="9", fg="red", width=10, height=5, command=lambda: btnPress(9))
button9.place(x=210, y=200)

button0 = Button(root, text="0", fg="red", width=21, height=5, command=lambda: btnPress(0))
button0.place(x=10, y=500)

buttonD = Button(root, text=".", fg="red", width=10, height=5, command=lambda: btnPress("."))
buttonD.place(x=210, y=500)

buttonEq = Button(root, text="=", fg="red", width=18, height=3, command=lambda: equalPress())
buttonEq.place(x=315, y=531)

buttonMult = Button(root, text="X", fg="red", width=18, height=3, command=lambda: btnPress("*"))
buttonMult.place(x=315, y=470)

buttonDiv = Button(root, text="/", fg="red", width=18, height=3, command=lambda: btnPress("/"))
buttonDiv.place(x=315, y=410)

buttonSub = Button(root, text="-", fg="red", width=18, height=3, command=lambda: btnPress("-"))
buttonSub.place(x=315, y=292)

buttonAdd = Button(root, text="+", fg="red", width=18, height=3, command=lambda: btnPress("+"))
buttonAdd.place(x=315, y=350)

buttonClear = Button(root, text="C", fg="red", width=18, height=5, command=lambda: clearbtn())
buttonClear.place(x=315, y=200)
# setting buttons= nameButton= tk.Button(call main window+ text="", fg= color, width, height, command)
# Tkinter comes with three geometry managers: grid, pack, and place
# calcScreen.pack() what ever you create wether that be buttons or labels you have to pack them to show or use grid or place

result = ""
equation = StringVar()
clear = ""


# Now I will attempt to link the buttons to the display
# .set will change the integer to a string to store it in the same format
# Because .set was linked with an equation variable we defined the equation variable outside of


def btnPress(numb):
    global result
    result = result + str(numb)
    equation.set(result)


# Methods created in order to store btnPress keys in result. i.e result = result+str(numb)
# To translate these keyed in numbers to an evaluable equation we created an equation which holds a String variable
# We then set that equation to hold the initial data from result

def equalPress():
    global result
    total = str(eval(result))
    equation.set(total)
    result = total


# For equalPress we create a variable to be the total which is the string type of the result evaluated
# The equation is then set for a value type called total which result gets kept in total after result

def clearbtn():
    global result
    equation.set(clear)
    result = str("")


# Now I will attempt to make a display screen for the calculator
# Because tk.label didn't add a removable 0 in the screen I used tk.Entry
# For the substitution of a height parameter, I padded the Text Box

CalcDisplay = StringVar()
CalcDisplay = Entry(root, width=50, borderwidth=2, relief="groove", textvariable=equation)
CalcDisplay.grid(row=0, column=1, padx=15, pady=10, ipady=75)

root.mainloop()
