package drive;


import yoursFile.YoursFile;

public interface Drive {

    void addFile(YoursFile file);

    YoursFile findFile(String name);

    void listFile();
}

