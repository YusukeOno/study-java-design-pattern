package com.example.factory.linux;

import com.example.factory.OsFileSystem;

public class LinuxFileSystem extends OsFileSystem {
    @Override
    public String getFileSeparator() {
        return "/";
    }

    @Override
    public String getRootPath() {
        return "/";
    }

    @Override
    public void saveFile(String fileName) {
        String directory = getRootPath() + "usr"
                + getFileSeparator() + fileName;
        System.out.println("save:" + directory);
    }
}
