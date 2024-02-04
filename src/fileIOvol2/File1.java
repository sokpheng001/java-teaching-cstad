package fileIOvol2;

import globalVariable.GlobalVariable;

import java.nio.file.Path;
import java.nio.file.Paths;

public class File1 {
    public static void main(String[] args) {
        Path targetFile = Paths.get(GlobalVariable.OUT_PUT_FILE_PATH.getPath()).resolve("");
    }
}