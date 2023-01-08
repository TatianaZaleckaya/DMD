package lessonArray;

public class Task4 {

    /**
     * Определить сумму элементов целочисленного массива, расположенного между минимальным и максимальным значениями
     */
    public static void main(String[] args) {
        int[] values = {1, 2, 9, 0, 6, 4, 10, 3};

        System.out.println(sumElementArray(values));
    }

    public static int findMinIndex(int[] values) {
        int minValue = values[0];
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] values) {
        int maxValue = values[0];
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int sumElementArray(int[] values) {
        int minIndex = findMinIndex(values);
        int maxIndex = findMaxIndex(values);
// для определения если индех макс впереди минимального
        if (minIndex> maxIndex){
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex= temp;
        }
        int result = 0;
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += values[i];
        }
        return result;
    }
}
