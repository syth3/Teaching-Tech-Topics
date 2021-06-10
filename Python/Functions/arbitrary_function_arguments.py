def print_all_numbers_passed(*numbers):
    for number in numbers:
        print(number)


def main():
    print_all_numbers_passed(1, 345, 34563, 2, 6753)


if __name__ == '__main__':
    main()
