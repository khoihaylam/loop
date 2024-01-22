import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=1;
        while (number!=0){
            System.out.println("moi ban nhap so nguyen:");
            number=scanner.nextInt();
            if(number%3==0){
              System.out.println(number);
            }
        }
    }
}
