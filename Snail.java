import java.util.ArrayList;

public class Snail {

    public static int[] snail(int[][] array) {
        ArrayList<Integer> returnMe = new ArrayList<>();
        ArrayList<int[]> snailArray = new ArrayList<>();
        int iStart = 0, iEnd = array.length - 1;
        int jStart = 0, jEnd = array[0].length - 1;

        // Traverse the matrix in a spiral/snail order
        while (iStart <= iEnd && jStart <= jEnd) {
            // Traverse Right
            for (int j = jStart; j <= jEnd; j++) {
                returnMe.add(array[iStart][j]);
            }
            iStart++;

            // Traverse Down
            for (int i = iStart; i <= iEnd; i++) {
                returnMe.add(array[i][jEnd]);
            }
            jEnd--;

            // Traverse Left
            if (iStart <= iEnd) {
                for (int j = jEnd; j >= jStart; j--) {
                    returnMe.add(array[iEnd][j]);
                }
            }
            iEnd--;

            // Traverse Up
            if (jStart <= jEnd) {
                for (int i = iEnd; i >= iStart; i--) {
                    returnMe.add(array[i][jStart]);
                }
            }
            jStart++;
        }

        // Convert ArrayList to int[]
        int[] result = new int[returnMe.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = returnMe.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] snail = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = snail(snail);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
