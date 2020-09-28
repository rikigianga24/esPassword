import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class LetturaPassword {


    private File file;
    private String password;


    public LetturaPassword(File file, String password) {
        this.file = file;
        this.password = password;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    //Lettura da file con lista

    public List<String> letturaFile(String filename) {
        List<String> lines = Collections.emptyList();
        try{
            lines= Files.readAllLines(Paths.get(filename));

        }catch(IOException e){
            e.printStackTrace();
        }
        return lines;
    }

    public String finder(){

    }

}
