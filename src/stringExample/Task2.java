package stringExample;

/**
 * Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.
 */
public class Task2 {
    public static void main(String[] args) {
        String value = "123 ghhgjkld 123";
        String word = "123";
        System.out.println(isStartAnd(value, word));
    }

    private static boolean isStartAnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}
