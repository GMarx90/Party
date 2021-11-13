package yoursFile;

import java.io.File;

public abstract class AbstractFile implements YoursFile {
    protected String name;
    protected int size;

    public AbstractFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return null;
    }


    public int getSize() {
        return 0;
    }
}
