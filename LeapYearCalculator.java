import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Kiem tra nam---");
        System.out.println("Nhap nam : ");
        int year = scanner.nextInt();

        if ((year%4 == 0 && year%100 != 0) || (year%100 == 0 && year %400 == 0)) {
            System.out.println(year + " la nam nhuan");
        }else {
            System.out.println(year + " khong phai la nam nhuan");
        }

    }
}
