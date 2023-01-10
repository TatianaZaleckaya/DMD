package lessonFor.task2;
//Имеется число. Посчитать сумму цифр данного числа
public class Task2 {
    public static void main(String[] args) {
        int value =12345;
        int result = sumNumber(value);
        System.out.println(result);
        int value1 =12345;
        int result1= sumNumberFor(value1);
        System.out.println(result1);
    }
    public static int sumNumber(int value){
        int result =0;
        int currentValue = value;
        while(currentValue!=0){
            result+=currentValue%10;
            currentValue/=10;
        }
        return result;
    }

    public static int sumNumberFor(int value){
        int result =0;
        for(int currentValue = value;currentValue!=0;currentValue/=10){
            result+=currentValue%10;
        }
        return result;
    }
}
