package com.example.factory.windows;

import com.example.factory.OsDisplaySystem;
import com.example.factory.OsFactory;
import com.example.factory.OsFileSystem;

public class WindowsFactory extends OsFactory {
    @Override
    public OsFileSystem createFileSystem() {
        return new WindowsFileSystem();
    }

    @Override
    public OsDisplaySystem createDisplaySystem() {
        return new WindowsDisplaySystem();
    }
}
