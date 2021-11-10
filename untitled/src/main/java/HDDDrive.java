import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public class HDDDrive implements Drive {
    public HDDDrive(String type) {

    }
    List<File> hddFiles=new ArrayList<>();

    @Override
    public void addFile(File file) {
        hddFiles.add(file);
    }

    @Override
    public File findFile(String name) {
        Optional<File> foundFile = hddFiles.stream()
                .filter(file -> file.getName().equals(name))
                .findFirst();
        return foundFile.orElseThrow();
    }


    @Override
    public void listFile() {
        hddFiles.forEach(System.out::println);

    }


}