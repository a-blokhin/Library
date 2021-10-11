import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        Library lib = new LibraryFactory();
        System.out.println("Введите автора по русски в формате Nмя Фамилия:");
        System.out.println("Например: Александр Пушкин, Николай Гоголь, Сергей Есенин,Александр Островский, Александр Дугин, Дмитрий Пучков))");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(Bookk b :lib.bookks){
            if (b.getAuthor().equals(input)){
                Gson gson = new Gson();
                String ans = gson.toJson(b);
                System.out.println(ans);
            }
        }
    }
}
