import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran persegi: ");
        int p = hi.nextInt();
        
        int i = 1;
        
        while (i <= p) {
            
            int j = 1;
            while ( j <= p ) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
