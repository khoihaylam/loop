import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.print(sum);
    }
}
