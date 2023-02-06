import java.util.Scanner;
         public class Matrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the number of rows of the matrix: ");
    int rows = scanner.nextInt();
    
    System.out.print("Enter the number of columns of the matrix: ");
    int columns = scanner.nextInt();
    
    int[][] matrix = new int[rows][columns];
    
    System.out.println("Enter the elements of the matrix:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }
    
    System.out.println("The original matrix is:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    
    System.out.println("The transposed matrix is:");
    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.print(matrix[j][i] + " ");
      }
      System.out.println();
    }
  }
}
