import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. sayı: ");
        n1 = inp.nextInt();
        System.out.print("2. sayı: ");
        n2 = inp.nextInt();
        System.out.print("3. sayı: ");
        n3 = inp.nextInt();

        if (n1 > n2 && n1 > n3 && n2 != n3) {
            if (n2 > n3) {
                System.out.print("n3<n2<n1");
            } else {
                System.out.print("n2<n3<n1");
            }
        } else if (n2 > n1 && n2 > n3 && n1 != n3) {
            if (n1 > n3) {
                System.out.print("n3<n1<n2");
            } else {
                System.out.print("n1<n3<n2");
            }
        } else if (n3 > n1 && n3 > n2 && n1 != n2) {
            if (n1 > n2) {
                System.out.print("n2<n1<n3");
            } else {
                System.out.print("n1<n2<n3");
            }
        } else {
            System.out.println("Sayılardan bazıları birbirine eşittir.");
        }

    }
}
