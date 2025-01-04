import java.io.File;

class DirectoryDeleter {
    public void deleteDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        deleteDirectoryRecursive(directory);
    }

    private void deleteDirectoryRecursive(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    deleteDirectoryRecursive(f);
                }
            }
        }
        file.delete();
    }
}