package yoursFile.imageFile;

public class JPGImageFile extends AbstractImageFile {

    int compression;

    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }

    public void displayingImage() {
        System.out.println("Showing JPG File");
    }
}
