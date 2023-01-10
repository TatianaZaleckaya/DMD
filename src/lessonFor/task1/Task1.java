package lessonFor.task1;
// Программа высчитывающая факториал целого числа

public class Task1 {
    public static void main(String[] args) {
        int value = 5;
        int result = factorial(value);
        System.out.println(result);

    }

    public static int factorial(int value){
        int result =1;
        for (int i=1;i<=value;i++){
            result*=1;
        }
        return result;
    }
    }

