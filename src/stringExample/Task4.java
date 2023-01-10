package stringExample;

/**
 * Подсчитать количество точек, запятых и восклицательных знаков в строке.
 */
public class Task4 {
    public static void main(String[] args) {
        String value = "gk<f. HJK! lgi/ dhii, !!";

    }

    private static int contSymbols(String value) {
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }

}
