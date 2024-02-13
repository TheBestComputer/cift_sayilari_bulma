
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a, c = 0;
        double b = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayiyi giriniz : ");
        a = scanner.nextInt();
        
        for(int i = 0; i <= a; i+=2){
            if(i % 12 == 0){
                b += i;
                c++;
            }
        }
        b /= c;
        System.out.println("Ortalama : " + b);
        
    }
}
