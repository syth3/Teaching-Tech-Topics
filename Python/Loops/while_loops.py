print("Basic while loop")
counter = 0
while counter < 10:
    print(counter)
    counter += 1

print()

print("While loop with an else condition")
reached_goal = False
donated_money = 0
while reached_goal is not True:
    test = 101
    donated_money += 100
    print("Current donation amount:", donated_money)
    if donated_money >= 1000:
        reached_goal = True
else:
    print("We reached our donation goal!")
