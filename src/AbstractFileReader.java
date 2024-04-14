import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

//Allows to place the file reader algorithm in one place
//Other concrete file reader classes can use the algorithm without worrying about the implementation
//AbstractFileReader we can create functionality to read the file content and convert them to lowercase, uppercase or whatever we want
//(All we need to do is create a class and extends AbstractFileReader class and implement the parseLine functionality)
public abstract class AbstractFileReader {
    private final Path filePath;

    protected AbstractFileReader(String filePath) {
        this.filePath = Path.of(filePath);
    }

    public String getPath(){
        return filePath.toString();
    }

    public List<String> readFile() throws IOException{
        return Files.lines(filePath).map(this::parseLine).collect(Collectors.toList());
    }

    protected abstract String parseLine (String line);
}
