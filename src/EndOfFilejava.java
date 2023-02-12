import javax.swing.*;
import java.util.Scanner;

public class EndOfFilejava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (scan.hasNext()) {
            System.out.printf("%d %s\n",++i,scan.nextLine());
        }
        scan.close();
    }
}
