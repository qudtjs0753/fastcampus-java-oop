import logic.BubbleSort;

import java.util.Arrays;

/**
 * @Author: kbs
 */
public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();



        System.out.println("result: " + sort.sort(Arrays.asList(args)));
    }
}
