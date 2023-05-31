class Matrix {
    private int[][] elements;
    private int rows;
    private int columns;
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }
    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }
    public void setElement(int i, int j, int value) {
        elements[i][j] = value;
    }
    public Matrix add(Matrix matrix) {
        if (this.rows != matrix.getRows() || this.columns != matrix.getColumns()) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Matrix resultMatrix = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix.setElement(i, j, this.elements[i][j] + matrix.elements[i][j]);
            }
        }

        return resultMatrix;
    }
    public Matrix multiply(Matrix matrix) {
        if (this.columns != matrix.getRows()) {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }

        int resultRows = this.rows;
        int resultColumns = matrix.getColumns();
        Matrix resultMatrix = new Matrix(resultRows, resultColumns);

        for (int i = 0; i < resultRows; i++) {
            for (int j = 0; j < resultColumns; j++) {
                int sum = 0;
                for (int k = 0; k < this.columns; k++) {
                    sum += this.elements[i][k] * matrix.elements[k][j];
                }
                resultMatrix.setElement(i, j, sum);
            }
        }

        return resultMatrix;
    }

    public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(0, 2, 3);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 5);
        matrix1.setElement(1, 2, 6);

        Matrix matrix2 = new Matrix(3, 2);
        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(1, 0, 9);
        matrix2.setElement(1, 1, 10);
        matrix2.setElement(2, 0, 11);
        matrix2.setElement(2, 1, 12);

        System.out.println("Matrix 1:");
        matrix1.displayMatrix();
        System.out.println();

        System.out.println("Matrix 2:");
        matrix2.displayMatrix();
        System.out.println();

        Matrix sumMatrix = matrix1.add(matrix2);
        if (sumMatrix != null) {
            System.out.println("Sum of Matrix 1 and Matrix 2:");
            sumMatrix.displayMatrix();
            System.out.println();
        }

        Matrix productMatrix = matrix1.multiply(matrix2);
        if (productMatrix != null) {
            System.out.println("Product of Matrix 1 and Matrix 2:");
            productMatrix.displayMatrix();
            System.out.println();
        }
    }
}
