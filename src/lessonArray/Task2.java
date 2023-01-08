package lessonArray;

/**
 * Написать программу, заносящую в массив первые 100 целых чиселб делящихся на 13 или на 17
 * и печатающего его
 */
public class Task2 {
    public static void main(String[] args) {
        int[] values = new int[100];
        fillArray(values);
        Task1.printArray(values);

    }

    public static void fillArray(int[] values) {
        for (int currentValue = 1, currentIndex = 0; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex++] = currentValue;
            }
        }
    }
}

