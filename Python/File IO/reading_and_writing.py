# Open a file only for reading
with open("test_file.txt", "r") as test_file:
    for line in test_file:
        print("Line:", line.strip())

# Open a file for appending
with open("test_file.txt", "a") as test_file:
    test_file.write("\nAppending text to a file with Python\n")

# Open a file for writing
with open("test_file.txt", "w") as test_file:
    test_file.write("Writing text to a file with Python\n")