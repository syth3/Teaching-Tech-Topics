class CustomException(Exception):
    pass


x = -1
if x < 0:
    raise CustomException("Negative number is not allowed")