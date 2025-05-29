import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Tính + - * / của 2 số nhập từ bàn phím
        int choice;
        do {
            System.out.println("-------------------------");
            System.out.println("1. Tính + - * / của 2 số nhập từ bàn phím");
            System.out.println("2. Tính nghiệm của phương trình A + Bx = C");
            System.out.println("3. Tính số chính phương 1 số");
            System.out.println("4. Tính số nguyên tố của 1 số");
            System.out.println("5. Tính S và P hcn");
            System.out.println("6. Tính 2 số nguyên");
            System.out.println("7. Tính lãi xuất");
            System.out.println("8. Thoát");
            System.out.println("-------------------------");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    calculator(scanner);
                    break;
                case 2:
                    ptb1(scanner);
                    break;
                case 3:
                    soChinhPhuong(scanner);
                    break;
                case 4:
                    soNguyenTo(scanner);
                    break;
                case 5:
                    chuViDienTichHCN(scanner);
                    break;
                case 6:
                    calTwoIntegerNumber(scanner);
                    break;
                case 7:
                    laiXuatNganHang(scanner);
                    break;
                default:
                    System.out.println("Nhập lại lựa chọn!");
                    break;
            }
        } while (choice != 8);
    }

    public static void calculator(Scanner scanner){
        float a,b;
        while(true) {
            System.out.print("Nhập a: ");
            a = scanner.nextInt();
            System.out.print("Nhập b: ");
            b = scanner.nextInt();
            if (b == 0){
                System.out.println("Mẫu không được là số 0");
            } else {
                break;
            }
        }
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
        } else {
            System.out.println("Không thể chi cho 0!");
        }
    }

    public static void ptb1(Scanner scanner){
        double a,b,c;
        System.out.print("Nhập a: ");
        a = scanner.nextInt();
        System.out.print("Nhập b: ");
        b = scanner.nextInt();
        System.out.print("Nhập c: ");
        c = scanner.nextInt();
        System.out.println("-------------");
        System.out.printf("Phương trình: %.0fx + %.0f = %.0f\n", a, b, c);
        if (a == 0){
            if (b == c){
                System.out.println("Phương trình vô số nghiệm");
            }
            if (b != c){
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.printf("x = %.2f\n", (c-b/a));
        }
    }

    public static void soChinhPhuong(Scanner scanner){
        int number;
        while(true) {
            System.out.println("Nhập số cần kiểm tra: ");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Số phải lớn hơn 0!");
            } else {
                break;
            }
        }
        int can2 = (int) Math.sqrt(number);
        if (Math.pow(can2,2) == number){
            System.out.println(number + " là số chính phương");
        } else {
            System.out.println(number + " không phải số chính phương");
        }
    }

    public static void soNguyenTo(Scanner scanner){
        int number;
        int count = 0;
        while(true) {
            System.out.println("Nhập số cần kiểm tra: ");
            number = scanner.nextInt();
            if (number == 1) {
                System.out.println("Số phải lớn hơn 1!");
            } else {
                break;
            }
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không phải số nguyên tố");
        }
    }

    public static void chuViDienTichHCN(Scanner scanner){
        System.out.print("Nhập chiều dài: ");
        float chieuDai = scanner.nextFloat();
        System.out.print("Nhập chiều rộng: ");
        float chieuRong = scanner.nextFloat();

        double S = chieuDai*chieuRong;
        double P = (chieuDai+chieuRong)*2;

        System.out.println("Chu vi = " + P);
        System.out.println("Diện tích = " + S);

        if (chieuDai < chieuRong){
            System.out.println("Cạnh nhỏ nhất = " + chieuDai);
        } else {
            System.out.println("Cạnh nhỏ nhất = " + chieuRong);
        }
    }

    public static void calTwoIntegerNumber(Scanner scanner){
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (float)(a+b));
    }

    public static void laiXuatNganHang(Scanner scanner){
        while (true) {
            System.out.print("Nhập số tiền gốc: ");
            int tienGoc = scanner.nextInt();
            System.out.print("Nhập lãi xuất mỗi năm (%): ");
            int phanTram = scanner.nextInt();
            System.out.print("Nhập thời gian (năm): ");
            int thoiGian = scanner.nextInt();
            scanner.nextLine();

            int laiXuat = (tienGoc * phanTram * thoiGian)/100;
            System.out.println("Lãi xuất của bạn là: " + laiXuat);
            System.out.print("Bạn có muốn nhập lại không(Y/N)? :");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("N")){
                break;
            }
        }
    }
}
