package org.patters.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {

    protected String name;
    protected List<FileSystemItem> children = new ArrayList<>();

    public Folder(String name, List<FileSystemItem> children) {
        this.name = name;
        this.children = children;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        for (FileSystemItem child : children) {
            child.print(structure + " |");
        }
    }
}
