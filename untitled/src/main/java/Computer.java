
public class Computer {
    Monitor monitor = new Monitor();
    Drive drive = new Drive() {
        @Override
        public void addFile(File file) {

        }

        @Override
        public File findFile(String name) {
            return null;
        }

        @Override
        public void listFile() {

        }
    };
}
