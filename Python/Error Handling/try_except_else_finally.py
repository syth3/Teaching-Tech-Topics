try:
    print(x)
except NameError:
    print("Something went wrong")
finally:
    print("The 'try except' is finished")

print()

y = 0
try:
    print(y)
except NameError:
    print("Something went wrong")
else:
    print("No errors here!")
finally:
    print("The 'try except' is finished")
