package ru.job4j.cache;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirFileCache extends AbstractCache<String, String> {

    private final String cachingDir;

    public DirFileCache(String cachingDir) {
        this.cachingDir = cachingDir;
    }

    @Override
    protected String load(String key) {
        Path path = Paths.get(cachingDir.concat(key));
        String result = null;
        try {
            if (Files.exists(path)) {
                result = Files.readString(path);
            } else {
                System.out.println("ERROR - There is no such file or directory!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
