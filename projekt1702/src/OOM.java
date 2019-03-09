import java.util.*;

public class OOM {
    static List<String> list = new ArrayList<String>();

    public static void main(String args[]) throws Exception
    {
        Integer[] array = new Integer[10000 * 10000];
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Arrays.toString(array));
    }
} 