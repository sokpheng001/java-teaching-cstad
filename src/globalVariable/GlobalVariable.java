package globalVariable;

public enum GlobalVariable {
    OUT_PUT_FILE_PATH(System.getProperty("user.dir")+"\\src\\javaFileIO\\fileOutPath\\");
    private final String path;
    private GlobalVariable(String path){
        this.path = path;
    }
    public String getPath() {
        return path;
    }
}
