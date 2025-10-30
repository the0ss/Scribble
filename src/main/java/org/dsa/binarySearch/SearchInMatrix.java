package org.dsa.binarySearch;

public class SearchInMatrix {
  public static void main(String[] args) {
    int[][] matrix = new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
    System.out.println(searchMatrix(matrix, 6));
  }

  private static boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length, m = matrix[0].length;
    int i = 0, j = m - 1;

    while (i < n && j >= 0) {
      if (target == matrix[i][j]) {
        return true;
      } else if (target > matrix[i][j]) {
        i++;
      } else {
        j--;
      }
    }
    return false;
  }
}
