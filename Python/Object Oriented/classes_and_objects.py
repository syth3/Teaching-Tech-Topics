class Car:
    def __init__(self, make, model):
        self.make = make
        self.model = model

    def __str__(self):
        return "Make: " + self.make + ";" + " Model: " + self.model


car1 = Car("Honda", "Civic")
print(car1)
print()

car1.model = "Accord"
print(car1)
