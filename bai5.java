import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap mot so n:");
        int number=scanner.nextInt();
        int kq;
        if(number>=1&&number<=9){
            for(int i=1;i<=10;i++){
                kq=number*i;
                System.out.printf("\n bang cuu chuong %d :%d*%d=%d",number,i,number,kq);

            }
        }
    }
}
