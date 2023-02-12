import java.util.Arrays;

public class Arrysn {
    public static void main(String[] args) {
        //double[] marks = new double[10];

        double[] marks = {12.5,78.3,56.6,65.4,53.2};

        double[] result = incrementArry(marks);

        System.out.println(Arrays.toString(result)); // [13.5,79.3,57.6,66.4,54.2]
    }
       public static  double[] incrementArry(double[] marks) {
          double [] result = new double [marks.length];
           for (int i = 0; i< 5; i++ ){
               result[i] =++marks[i];

           }
           return result;
       }


}
