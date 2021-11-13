package drive;//import Drive;

import yoursFile.YoursFile;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class HDDDrive implements Drive {
    public HDDDrive(String type) {

    }

    List<YoursFile> hddFiles = new ArrayList<>();

    @Override
    public void addFile(YoursFile file) {
        hddFiles.add(file);
    }

    @Override
    public YoursFile findFile(String name) {

        YoursFile foundFile = hddFiles.stream()
                .filter(file -> file.getName().equals(name))
                .findFirst().get();
        System.out.println("Znaleziono plik:");
        return foundFile;
    }


    @Override
    public void listFile() {
        for (YoursFile file : hddFiles) {
            System.out.println(file.getName());
        }

    }


}
