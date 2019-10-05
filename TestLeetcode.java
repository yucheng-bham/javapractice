import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestLeetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        int[][] input = new int[][]{
//                {1,3},
//                {2,1},
//                {1,4},
//                {2,3}
//        };
//        Arrays.sort(input, (i1, i2) -> Integer.compare(i2[0], i1[0]));
//        for (int i = 0; i < input.length; i++) {
//            System.out.println(Arrays.toString(input[i]));
//        }
//        Integer[] arr = new Integer[]{0 ,2, 7, 6, 1, 4};
//        int[] arr = new int[]{ 0, 5, 2, 3, 1};
        String[] arr = new String[]{"Abcd", "1a", "bbc"};
        Arrays.sort(arr, (a,b) -> (a.length() - b.length()));
        System.out.println(Arrays.toString(arr));
//        System.out.print(Integer.compare(2,1));

//        System.out.println(sol.constructMaximumBinaryTree(input));
    }
}
