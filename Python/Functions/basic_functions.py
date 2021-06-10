def find_longest_string_in_list(list):
    longest_string = ""
    longest_string_length = 0
    for string in list:
        if len(string) > longest_string_length:
            longest_string = string
            longest_string_length = len(string)
    return longest_string


def main():
    list = ["one", "two", "three", "four", "five"]
    longest_string = find_longest_string_in_list(list)
    print(longest_string)


if __name__ == '__main__':
    main()
