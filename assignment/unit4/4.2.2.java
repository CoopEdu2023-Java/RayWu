import java.io.File;

class FileExistenceChecker {
    public boolean fileExists(String pathname) {
        File file = new File(pathname);
        return file.exists();
    }
}