package week_1;

public class Financial_Forecasting {


    static double calculateFutureValue(double amount, double growthRate, int years) {


        if(years == 0) {

            return amount;

        }


        return calculateFutureValue(amount * (1 + growthRate), growthRate, years - 1);

    }


    public static void main(String[] args) {


        double currentValue = 10000;

        double growthRate = 0.10;

        int years = 3;


        double futureValue = calculateFutureValue(currentValue, growthRate, years);


        System.out.println("Current Value: " + currentValue);

        System.out.println("Growth Rate: " + (growthRate * 100) + "%");

        System.out.println("Years: " + years);

        System.out.println("Predicted Future Value: " + futureValue);


        System.out.println("Time Complexity: O(n)");

    }

}