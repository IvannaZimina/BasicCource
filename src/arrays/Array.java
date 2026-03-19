package arrays;

// массив int по умолчанию инициализируется нулями
// массив String по умолчанию инициализируется null

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];         // объявление массива и выделение памяти для 5 элементов

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i; // инициализация элементов массива значениями от 0 до 4
            System.out.println(arr[i]); // 0, 1, 2, 3, 4
        }

        int[] numbers = new int[]{1, 2, 3, 4, 5}; // инициализация массива с помощью литерала массива
        for (int number : numbers) {
            System.out.println(number); // 1, 2, 3, 4, 5
        }
        
        String[] months = {"January", "February", "March"}; // объявление и инициализация массива строк
        for (String month : months) {
            System.out.println(month);  // January, February, March - так как массив String по умолчанию инициализируется null, но мы его инициализировали явно
        }

        months[0] = "December"; // присваиваем новое значение первому элементу массива
        System.out.println(months[0]); // December
    }
}
