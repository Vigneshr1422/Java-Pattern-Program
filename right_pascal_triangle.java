package patterns;
import java.util.*;
public class right_pascal_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int num=in.nextInt();
        pattern(num);
    }
    static void pattern (int n){
        System.out.println("Right pascal triangle \n");
        for (int i = 1; i <= 2 * n; i++) {
            //
            int res= i > n ? 2 * n - i  : i;
            for (int j = 1; j <= res; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
