print("If/Else Statement")
bank_balance = 100
if bank_balance < 0:
    print("You owe us money!")
else:
    print("Your bank balance is $" + str(bank_balance))

print()

print("If/Elif/Else Statement")
weather = "rainy"
if weather.lower() == "rainy":
    print("Bring your umbrella!")
elif weather.lower() == "snowy":
    print("Bring your boots!")
elif weather.lower() == "sunny":
    print("Bring your sunglasses!")
else:
    print("Don't bring anything")
