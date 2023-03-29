import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListeMot {

    public static void main(String[] args) {
        File file = new File("liste_francais.txt");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé !");
            e.printStackTrace();
        }
    }
}
