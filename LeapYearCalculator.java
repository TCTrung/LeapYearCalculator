import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Kiem tra nam---");
        System.out.println("Nhap nam : ");
        int year = scanner.nextInt();

//        if ((year%4 == 0 && year%100 != 0) || (year%100 == 0 && year %400 == 0)) {
//            System.out.println(year + " la nam nhuan");
//        }else {
//            System.out.println(year + " khong phai la nam nhuan");
//        }

        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d la nam nhuan", year);
        } else {
            System.out.printf("%d khong phai la nam nhuan", year);
        }
    }

}
