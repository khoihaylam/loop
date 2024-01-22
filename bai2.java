import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int number=1;
        while (number!=0){
            System.out.println("moi ban nhap so nguyen:");
            number=scanner.nextInt();
            if(number%2!=0){
                sum=sum+number;
            }
        }
        System.out.println(sum);
    }
}
