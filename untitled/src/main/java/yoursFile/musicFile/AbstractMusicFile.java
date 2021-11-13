package yoursFile.musicFile;

import yoursFile.AbstractFile;
import yoursFile.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {
    protected String bandName;
    protected int title;

    public AbstractMusicFile(String name, int size, String bandName, int title) {
        super(name, size);
        this.bandName = bandName;
        this.title = title;
    }


    public String getBandName() {
        return this.bandName;
    }

    public int getTitle() {
        return this.title;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }


}
