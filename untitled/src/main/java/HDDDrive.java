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

   /*@Override
    public File findFile(String name) {

            File foundFile = hddFiles.stream()
                    .filter(file -> file.getName().equals(name))
                    .findFirst().get();
        System.out.println("Znaleziono plik:");
            return foundFile;
    }*/


    @Override
    public void listFile() {
        for (File file:hddFiles){
            System.out.println(file.getName());
        }

    }


}