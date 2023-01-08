package lessonFor;

public class ForExample {
    public static void main(String[] args) {

        examleWhileContinue();
    }

    private static void examleWhileContinue() {
        for (int a = 10; a > 0; a--) {

            if (a == 5) {
                continue;
            }
            //break;}
            System.out.println(a);

        }
    }


    private static void forExample() {
        for (int value = 0; value < 10; value++) {
            System.out.println(value);
        }
    }
}

   
