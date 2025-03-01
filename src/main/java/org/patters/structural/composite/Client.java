package org.patters.structural.composite;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        FileSystemItem file = new File("file.txt");
        FileSystemItem file2 = new File("file2.txt");
        FileSystemItem file3 = new File("file3.txt");

        FileSystemItem folder1 = new Folder("folder2", Arrays.asList(file, file2));
        FileSystemItem folder = new Folder("folder3", Arrays.asList(folder1, file3));

        folder.print("");
    }
}
