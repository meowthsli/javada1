import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public class Main {
    public static void main(String... args) {
        System.out.print("2 + 3 = ");
        System.out.println(AdaLibrary.INSTANCE.my_add(2, 3));
        System.out.print("7 + 3 = ");
        System.out.println(AdaLibrary.INSTANCE.my_add(7, 3));
    }
}

public interface AdaLibrary extends Library {
    AdaLibrary INSTANCE = (AdaLibrary)Native.load("Add", AdaLibrary.class);

    int my_add(int a, int b);
}
