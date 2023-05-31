class Matrix {
    private int[][] elements;

    public Matrix(int[][] elements) {
        this.elements = elements;
    }
    public void displayMatrix() {
        for (int[] row : elements) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        int[][] elements = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        Matrix matrix = new Matrix(elements);
        matrix.displayMatrix();
    }
}
