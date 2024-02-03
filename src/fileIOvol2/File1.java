package fileIOvol2;

import globalVariable.GlobalVariable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(STR."\{GlobalVariable.OUT_PUT_FILE_PATH.getPath()}koko.txt");
        Files.delete(path);
    }
}


