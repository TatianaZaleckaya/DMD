package task3;

/**В 1696 году индейцы подали Манхэттен за 24$. Написать программу, которая высчитает сумму
 * получившуюся бы в текущем году, если бы индейцы положили эти деньги в банк под 5% годовых
  */
public class Task3 {
    public static void main(String[] args) {
        double value =26;
        int year = 2023;
        sum(value,year);

    }

    public static double sum (double value, int year){
        double result = value;
        for(int i =1695;i<=year;year++){
            double percent = result*0.05;
            result += percent;
            System.out.println(year+":" + result);
        }


        return result;
    }
}
