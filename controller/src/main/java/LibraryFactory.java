import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

public class LibraryFactory  extends Library{
    public LibraryFactory() throws  FileNotFoundException{
        Gson gson = new Gson();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("authors4.json");
        Type listType = new TypeToken<List<Bookk>>(){}.getType();
        Scanner s = new Scanner(is).useDelimiter("\\A");
        String result = s.next();
        List<Bookk> posts = gson.fromJson(result, listType);
        this.bookks = posts;


    }
}
