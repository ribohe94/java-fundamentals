package com.company;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    String[] data = {
	            "Line 1",
                "Line 2 2",
                "Line 3 3 3",
                "Line 4 4 4 4",
                "Line 5 5 5 5 5"
        };

	    try(FileSystem zipFs = openZip(Paths.get("myData.zip"))) {


        } catch (Exception e) {
	        System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }

    }

    private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException {
        Map<String, String> providerProps = new HashMap<>();
        providerProps.put("create", "true");

        URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null);
        FileSystem zipFS = FileSystems.newFileSystem(zipUri, providerProps);

        return zipFS;

    }

    private static void copyToZip (FileSystem zipFs) throws IOException {
        Path sourceFile = Paths.get("file.txt");
//      ------> Same thing --->  Path sourceFile = FileSystems.getDefault().getPath("file.txt");

        Path destFile = zipFs.getPath("/file1Copied.txt");

    }


}
