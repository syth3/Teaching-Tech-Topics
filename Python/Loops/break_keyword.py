print("Break Keyword with a while loop")
counter = 0
while counter < 10:
    counter += 1
    if counter == 3:
        print("Exit the loop entirely")
        break
    print(counter)

print()

print("Break Keyword with a for loop")
for i in range(10):
    if i == 5:
        print("Exit the loop entirely")
        break
    print(i)
