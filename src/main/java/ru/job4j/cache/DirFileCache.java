package ru.job4j.cache;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DirFileCache extends AbstractCache<String, String> {

    private final String cachingDir;

    public DirFileCache(String cachingDir) {
        this.cachingDir = cachingDir;
    }

    @Override
    protected String load(String key) {
        Path path = Paths.get(cachingDir.concat(key));
        String result = "";
        if (Files.exists(path)) {
            try (Stream<String> lines = Files.lines(path)) {
                result = lines.collect(Collectors.joining());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("ERROR - There is no such file or directory!");
        }
        return result;
    }
}
