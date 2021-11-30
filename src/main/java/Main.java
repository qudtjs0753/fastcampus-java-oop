import logic.BubbleSort;
import logic.JavaSort;
import logic.Sort;

import java.util.Arrays;

/**
 * @Author: kbs
 */
public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
        System.out.println("result: " + sort.sort(Arrays.asList(args)));
    }
}
