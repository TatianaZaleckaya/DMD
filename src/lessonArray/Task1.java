package lessonArray;

/**Написать программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 *
 */
public class Task1 {
    public static void main(String[] args) {
        int[] values = {1, 34, 56, 11, 116};
        printArray(values);
        printArrayForEach(values);
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }

    public static void printArrayForEach(int[] values) {
        for (int value : values) {
            System.out.print(value);
        }

    }

    public static void printArrayReverse(int[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
    }
}


