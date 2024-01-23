package arrayPreparing;

import java.util.Arrays;

public class LearnArray {
    public static void main(String[] args) {
        int [][] twoDimensionalArray = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int [][] copiedOne = twoDimensionalArray.clone();
        System.out.println(Arrays.deepToString(copiedOne));
    }
}
