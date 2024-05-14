import java.util.*;

public class squarefillpattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num= in.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        in.close();
    }
    
}
