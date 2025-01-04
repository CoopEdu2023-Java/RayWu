import java.io.File;
import java.util.ArrayList;
import java.util.List;

class JavaFileFinder {
    public List<String> findJavaFiles(String directoryPath) {
        List<String> javaFiles = new ArrayList<>();
        File directory = new File(directoryPath);
        findJavaFilesRecursive(directory, javaFiles);
        return javaFiles;
    }

    private void findJavaFilesRecursive(File file, List<String> javaFiles) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    findJavaFilesRecursive(f, javaFiles);
                }
            }
        } else if (file.getName().endsWith(".java")) {
            javaFiles.add(file.getAbsolutePath());
        }
    }
}