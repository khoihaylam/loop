import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("**********************PRACTICE**********************");
            System.out.println("1. In dãy số chia hết cho 2 và giảm dần (n >= số >= 2)");
            System.out.println("2. In các số nhỏ hơn n và tính tổng");
            System.out.println("3. In ra các ước số chẵn của n");
            System.out.println("4. In ra các ước số lẻ và số lượng các ước lẻ của n");
            System.out.println("5. In ra ước số lẻ lớn nhất của n");
            System.out.println("6. Thoát");
            System.out.println("moi ban nhap 1 so n:");
            int n=scanner.nextInt();
            System.out.println("moi ban nhap chuc nang menu:");
            int a=scanner.nextInt();
            switch (a){
                case 1:
                    while (n>=2){
                        if(n%2==0){
                            System.out.println("In dãy số chia hết cho 2 và giảm dần (n >= số >= 2):"+n);
                        }
                        n--;
                    }
                    break;
                case 2:
                    int number=1;
                    int s=0;
                    while (number<n){
                        System.out.println("In các số nhỏ hơn n:"+number);
                        s=s+number;
                        number++;
                    }
                    System.out.println("tính tổng nhỏ hơn n:"+s);
                    break;
                case 3:
                    for(int i=1;i<=n;i++){
                        if(i%2==0){
                            if(n%i==0){
                                System.out.println("In ra các ước số chẵn của n:"+i);
                            }
                        }
                    }
                    break;
                case 4:
                    int count=0;
                    for(int i=1;i<=n;i++){
                        if(i%2==1){
                            if(n%i==0){
                                count++;
                                System.out.println("In ra các ước số lẻ của n:"+i);
                            }
                        }
                    }
                    System.out.println("số lượng các ước lẻ của n:"+count);

                    break;
                case 5:
                    int max;
                    max=1;
                    for(int i=1;i<=n;i++){
                        if(i%2==1){
                            if(n%i==0){
                               if(i>max){
                                   max=i;
                               }
                            }
                        }
                    }
                    System.out.println("In ra ước số lẻ lớn nhất của n:"+max);
                    break;

                case 6:
                    System.exit(0);
                default:
                    System.err.println("vui lòng nhập từ 1-6");
            }


        }while (true);

    }
}
