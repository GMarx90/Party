package yoursFile.musicFile;

import lombok.Getter;

@Getter
public class MP3MusicFile extends AbstractMusicFile {

    int quality;

    public MP3MusicFile(String name, int size, String bandName, int title, int quality) {
        super(name, size, bandName, title);
        this.quality = quality;

    }

    @Override
    public void playMusic() {
        System.out.println("Mp3 music is playing");
    }
}
