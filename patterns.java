import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        //pattern4(n);
        //pattern5(n);
        pattern6(n);
    }
    static void pattern1 (int n){
        c
    }
    static void pattern2 (int n){
        System.out.println("Square fill pramid \n");
        for (int i = 1; i <= n; i++) {
            //   row element = column element
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern3 (int n){/////////// it contains n - i + 1
        System.out.println("Reverse right half pramid \n");
        for (int i = 1; i <= n; i++) {
            //   row element = column element
            for (int j = 1; j <= n-i+1; j++) {     /// n - i + 1
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern4 (int n){
        System.out.println("number increasing  pramid \n");
        for (int i = 1; i <= n; i++) {
            //   row element = column element    // j=1
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5 (int n){
        System.out.println("Right pascal triangle \n");
        for (int i = 1; i <= 2 * n; i++) {      //        i  =  2 * n
            //
            int space= i > n ? 2 * n - i  : i;  //      space = i > n ? 2 * n - i : i

            for (int j = 1; j <= space; j++) {   //     j  = 2 * n - 1
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern6 (int n){
        System.out.println("Right pascal triangle \n");
        for (int i = 1; i <= 2 * n - 1 ; i++) {
            int colrow = i > n ? 2 * n - i : i;

            int space= n - colrow;
            for(int s=0;s<space;s++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= colrow; j++) {   //     j  = 2 * n - 1
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
