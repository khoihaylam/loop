import java.util.Scanner;
public class bai6 {
    public static int gcd(int number1,int number2){
        if(number2==0){
            return number1;
        }
        else{
            return gcd(number2,number1%number2);
        }
    }
    public static int lcm(int number1,int number2){
        return (number1*number2)/gcd(number1,number2);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("**********************CACULATOR**********************");
            System.out.println("1. Tổng 2 số");
            System.out.println("2. Hiệu 2 số");
            System.out.println("3. Tích 2 số");
            System.out.println("4. Thương 2 số");
            System.out.println("5. Số dư trong phép chia 2 số");
            System.out.println("6. Ước chung lớn nhất");
            System.out.println("7. Bội chung nhỏ nhất");
            System.out.println("8. Thoát");
            System.out.println("moi nhap so thu 1:");
            int number1=scanner.nextInt();
            System.out.println("moi nhap so thu 2:");
            int number2=scanner.nextInt();
            System.out.println("moi ban nhap chuc nang menu:");
            int n=scanner.nextInt();
            switch (n){
                case 1:
                    int sum=number1+number2;
                    System.out.println("Tổng 2 số:"+sum);
                    break;
                case 2:
                    int difference =number1-number2;
                    System.out.println("Hiệu 2 số:"+difference);
                    break;
                case 3:
                    int mul=number1*number2;
                    System.out.println("Tích 2 số:"+mul);
                    break;
                case 4:
                    int div=number1/number2;
                    System.out.println("Thương 2 số:"+div);
                    break;
                case 5:
                    int tail=number1%number2;
                    System.out.println("Số dư trong phép chia 2 số:"+tail);
                    break;
                case 6:
                    int gcd=gcd(number1,number2);
                    System.out.println("Ước chung lớn nhất:"+gcd);
                    break;
                case 7:
                    int lcm=lcm(number1,number2);
                    System.out.println("Bội chung nhỏ nhất:"+lcm);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.err.println("chi nhap tu 1-8");

            }




        }while (true);
    }
}
