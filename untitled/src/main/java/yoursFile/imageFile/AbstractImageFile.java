package yoursFile.imageFile;

import yoursFile.AbstractFile;
import yoursFile.FileType;

public class AbstractImageFile extends AbstractFile {


    public AbstractImageFile(String name, int size) {
        super(name, size);
    }


    public FileType getType() {
        return FileType.IMAGE;
    }
}
