import os


created_file = open("rename_and_delete_me.txt", "a+")
created_file.close()

os.rename("rename_and_delete_me.txt", "file_has_been_renamed.txt")

os.remove("file_has_been_renamed.txt")
