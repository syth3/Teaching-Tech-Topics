print("Continue Keyword with a while loop")
counter = 0
while counter < 10:
    counter += 1
    if counter == 3:
        print("Not going to print 3")
        continue
    print(counter)

print()

print("Continue Keyword with a for loop")
for i in range(10):
    if i == 5:
        print("Not going to print 5")
        continue
    print(i)
