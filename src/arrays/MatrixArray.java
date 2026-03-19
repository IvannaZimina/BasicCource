package arrays;

public class MatrixArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4]; // объявление двумерного массива 3x4

        // Инициализация элементов массива
        for (int i = 0; i < matrix.length; i++) { // внешний цикл по строкам
            for (int j = 0; j < matrix[i].length; j++) { // внутренний цикл по столбцам
                matrix[i][j] = i + j; // присваиваем значение, например, сумму индексов
                // matrix[0][0] = 0
                // matrix[0][1] = 1
                // matrix[0][2] = 2
                // matrix[0][3] = 3
                // matrix[1][0] = 1
                // matrix[1][1] = 2
                // matrix[1][2] = 3
                // matrix[1][3] = 4
                // matrix[2][0] = 2
                // matrix[2][1] = 3
                // matrix[2][2] = 4
                // matrix[2][3] = 5
                System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]); // вывод текущего элемента
            }
        }

        // Вывод элементов массива
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // 0 1 2 3
                // 1 2 3 4
                // 2 3 4 5
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // переход на новую строку после каждой строки массива
        }
    }
}
