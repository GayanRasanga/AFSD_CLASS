import java.lang.invoke.MethodHandles;
import java.util.Scanner;

public class Arrys {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int[] number = new int[7];
        for (int i = 0; i < number.length; i++) {
            number[i] += sca.nextInt();
        }
        getTotal(number);
    }
        public static void getTotal(int[] x){
            int sum = 0;
            for (int num:x){
                sum += num;
            }
            System.out.println(sum);
        }
    }


