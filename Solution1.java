package io.github.jiangdequan;

public class Solution1 {

    public static void main(String[] args) {
        int target = 1 ;
        int[][] a = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean f = Find(target,a);
        System.out.println(f);
    }

    public static boolean Find(int target, int[][] array) {
        for (int i = 0, j = array[0].length - 1; i <= array.length - 1 && (j >= 0 && j <= array[0].length - 1);) {
            if (array[i][j] > target) {
                j--;
                continue;
            }
            if (array[i][j] < target) {
                i++;
                continue;
            }
            if (array[i][j] == target) {
                return true;
            }
        }
        return false;
    }

}