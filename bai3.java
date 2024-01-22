import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("******************************Breakfast Menu*************************");
            System.out.println("1. Phở tôm hùm");
            System.out.println("2. Phở bò Kobe");
            System.out.println("3. Phở gà Việt Nam");
            System.out.println("4. Xôi trứng thịt");
            System.out.println("5. Bánh mỳ trứng");
            System.out.println("6. Mỳ tôm không người lái");
            System.out.println("7. Thoát");
            System.out.println("moi ban chon chuc nang menu chon mon:");
            int n=scanner.nextInt();
            switch (n){
                case 1:
                    System.out.println(" Bạn vừa chọn món Phở tôm hùm,vui lòng đợi trong giây lát");
                    break;
                case 2:
                    System.out.println(" Bạn vừa chọn món Phở bò Kobe,vui lòng đợi trong giây lát");
                    break;
                case 3:
                    System.out.println(" Bạn vừa chọn món Phở gà Việt Nam,vui lòng đợi trong giây lát");
                    break;
                case 4:
                    System.out.println(" Bạn vừa chọn món Xôi trứng thịt ,vui lòng đợi trong giây lát");
                    break;
                case 5:
                    System.out.println(" Bạn vừa chọn món Bánh mỳ trứng ,vui lòng đợi trong giây lát");
                    break;
                case 6:
                    System.out.println(" Bạn vừa chọn món Mỳ tôm không người lái  ,vui lòng đợi trong giây lát");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1 - 7");
            }


        }while (true);
    }
}
