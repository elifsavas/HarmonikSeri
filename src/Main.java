import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k ;
        double result = 0 ;

        Scanner input = new Scanner(System.in) ;

        System.out.print("Sayi Giriniz: ");
        k = input.nextInt();

        for (int i=1 ; i<=k ; i++) {

            result += (1.0/i) ; //int ile int bölündüğünde int değer çıkar. double, int'a bölündüğünde double çıkar.
                                // veya i'yi double ile tanımlayabiliriz.

        }

        System.out.println(result);
    }
}
