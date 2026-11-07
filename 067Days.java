import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran panjang :");
        int p = hi.nextInt();
        
        System.out.print("Masukkan ukuran lebar :");
        int l = hi.nextInt();
        
        int i = 1;
        
        while (i <= p) {
            
            int j = 1;
            while ( j <= l ) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
