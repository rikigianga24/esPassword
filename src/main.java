import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String path = "C:\\Users\\utente\\IdeaProjects\\esPassword\\src\\password.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Inserisci password\n");
        String password = scanner.next();
        LetturaPassword lettura = new LetturaPassword(file, password);
        List l= lettura.letturaFile(path);
        Iterator<String> itr = l.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }


}
