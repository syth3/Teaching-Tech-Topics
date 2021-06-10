print("For loop with range (starting and ending index)")
for i in range(2, 10):
    print(i)

print()

print("For loop with range part (only ending index)")
for i in range(10):
    print(i)

print()

print("For loop with range (with step)")
for i in range(5, 50, 5):
    print(i)

print()

print("For loop through a list")
fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
    print(fruit)

print()

print("For loop through a string")
for letter in "Tutoring":
    print(letter)

print()

print("For loop with an else statement")
for i in range(5):
    print(i)
else:
    print("Finished!")
