import java.io.File;
import java.util.ArrayList;
import java.util.List;

class DirectoryLister {
    public List<String> listDirectoryContents(String directoryPath) {
        File directory = new File(directoryPath);
        String[] contents = directory.list();
        List<String> contentList = new ArrayList<>();
        for (String content : contents) {
            contentList.add(content);
        }
        return contentList;
    }
}