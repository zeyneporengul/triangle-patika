import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int a, b;
        double x;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk kenar: ");
        a = input.nextInt();
        System.out.print("İkinci kenar: ");
        b = input.nextInt();

        x = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs uzunluğu: " + x);

        int alan = (a*b)/2;
        System.out.println("Üçgenin alanı: " + alan);
    }


}
