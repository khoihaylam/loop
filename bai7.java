import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("**********************CACULATOR**********************");
            System.out.println("1. Tổng 3 số nguyên");
            System.out.println("2. Trung bình cộng của 3 số nguyên");
            System.out.println("3. Số lớn nhất, nhỏ nhất trong 3 số");
            System.out.println("4. Thoát");
            System.out.println("moi ban nhap a:");
            int a=scanner.nextInt();
            System.out.println("moi ban nhap b:");
            int b=scanner.nextInt();
            System.out.println("moi ban nhap c:");
            int c=scanner.nextInt();
            System.out.println("moi ban nhap chuc nang menu:");
            int n=scanner.nextInt();
            switch (n){

                case 1:
                    int sum=a+b+c;
                    System.out.println("tong 3 so:"+sum);
                    break;
                case 2:
                    int avg=(a+b+c)/3;
                    System.out.println("Trung bình cộng của 3 số nguyên:"+avg);
                    break;
                case 3:
                    int max=a;
                    int min=a;
                    if(b>max){
                        max=b;
                    }
                    if(c>max){
                        max=c;
                    }
                    if(b<min){
                        min=b;
                    }
                    if(c<min){
                        min=c;
                    }
                    System.out.println("gia tri lon nhat:"+max);
                    System.out.println("gia tri nho nhat:"+min);
                    break;

                case 4:
                    System.exit(0);
                default:
                    System.err.println("CHI NHAP 1-4");
            }
        }while (true);

    }
}
