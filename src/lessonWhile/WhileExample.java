package lessonWhile;

public class WhileExample {
    public static void main(String[] args) {
        whileExample();
        int value =0;
        do{
            System.out.println(value);
            value++;
        }while (value>10);
    }

    private static void whileExample() {
        int value =10;
        while (value>0){
            System.out.println(value);
            value--;
        }
    }
}
