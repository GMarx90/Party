package drive;//import Drive;

import yoursFile.YoursFile;
import lombok.Data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Data
public class SDDDrive implements Drive {
    Map<String, YoursFile> sddFiles = new HashMap<>();

    public SDDDrive(String type) {

    }

    @Override
    public void addFile(YoursFile file) {

        sddFiles.put(file.toString(), file);
    }

    @Override
    public YoursFile findFile(String name) {
        return sddFiles.get(name);
    }

    @Override
    public void listFile() {
        Collection<YoursFile> files = sddFiles.values();
        for (YoursFile file : files) {
            System.out.println(file.getName());

        }
    }
}
