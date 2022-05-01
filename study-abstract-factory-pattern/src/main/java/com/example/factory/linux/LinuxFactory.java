package com.example.factory.linux;

import com.example.factory.OsDisplaySystem;
import com.example.factory.OsFactory;
import com.example.factory.OsFileSystem;

public class LinuxFactory extends OsFactory {
    @Override
    public OsFileSystem createFileSystem() {
        return new LinuxFileSystem();
    }

    @Override
    public OsDisplaySystem createDisplaySystem() {
        return new LinuxDisplaySystem();
    }
}
