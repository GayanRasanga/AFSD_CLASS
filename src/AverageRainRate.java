import java.util.Scanner;

public class AverageRainRate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] rainData = new double[7];
        for (int i =0;i<7;i++){
            System.out.print("Enter Rain Days:" +(i+1)+":");
            rainData[i]=scan.nextDouble();
        }
        double sum = 0;
        for (int i =0;i<7;i++){
          sum += rainData[i];
        }
        double averageRainRate = sum / 7;
        System.out.println(" 7 days is: " + averageRainRate);

    }
}
