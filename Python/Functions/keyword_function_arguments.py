def print_name(first_name, last_name):
    print("Hello " + first_name + " " + last_name + ", it's nice to meet you")


def main():
    my_first_name = "Jake"
    my_last_name = "Brown"
    print_name(my_first_name, my_last_name)
    print_name(last_name=my_last_name, first_name=my_first_name)


main()
