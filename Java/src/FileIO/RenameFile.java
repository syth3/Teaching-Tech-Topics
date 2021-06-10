package FileIO;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File file = new File("src/FileIO/filename.txt");
        File new_file_name = new File("src/FileIO/new_filename.txt");
        if (new_file_name.exists()) {
            System.out.println("File already exists");
        } else {
            boolean success = file.renameTo(new_file_name);
            if (success) {
                System.out.println("File renamed successfully!");
                System.out.println("New Name: " + new_file_name.getName());
            } else {
                System.out.println("File rename was unsuccessful");
            }
        }
    }
}
