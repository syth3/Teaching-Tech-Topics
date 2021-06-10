def print_country_capital(**country):
    print("The capital of " + country["country_name"] + " is " + country["capital"])


def main():
    print_country_capital(country_name="The United States of America", capital="Washington D.C.")


if __name__ == '__main__':
    main()
