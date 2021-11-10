

import lombok.Data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Data
public class SDDDrive implements Drive{
    Map<String,File> sddFiles=new HashMap<>();
    public SDDDrive(String type) {

    }

    @Override
    public void addFile(File file) {

        sddFiles.put(file.toString(),file);
    }

 /*  @Override
    public File findFile(String name) {
        return sddFiles.get(name);
    }*/

    @Override
    public void listFile() {
        Collection<File> files = sddFiles.values();
        for ( File file:files){
            System.out.println(file.getName());

    }}
}
