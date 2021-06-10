import pathlib

print("Current Directory:", pathlib.Path.cwd())
print()

# Creating a Path
path = pathlib.Path(r'C:\Users\jake\Documents\IMRAN-S\Python\File IO')
print("path:", path)
print("path Type:", type(path))
print()

# Joining Paths Together with a /
joined_path = pathlib.Path.home() / 'Documents' / 'IMRAN-S' / 'Python' / 'File IO'
print("joined_path:", joined_path)
print("joined_path Type:", type(joined_path))
print()

joined_path_different_way = pathlib.Path.home().joinpath('Documents', 'IMRAN-S', 'Python', 'File IO')
print("joined_path_different_way:", joined_path_different_way)
print("joined_path_different_way Type:", joined_path_different_way)
print()

print("Picking out different components of a Path")
path = pathlib.Path(r'C:\Users\jake\Documents\IMRAN-S\Python\File IO\file_paths.py')
print("Path used:", path)
print("path.name:", path.name)
print("path.stem:", path.stem)
print("path.suffix:", path.suffix)
print("path.parent:", path.parent)
print("path.parent.parent:", path.parent.parent)
print("path.anchor:", path.anchor)
