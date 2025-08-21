import java.util.Scanner;
// Bài tập : Viết chương trình nhập vào một số nguyên dương n và tính tổng các chữ số của n
// hint : lấy số nguyên dương n chia lấy dư cho 10 , sau mỗi lần chia chúng ta lại cộng các số dư đó lại và tiếp tục 
// chia số nguyên đó cho 10 cho đến khi n = 0
public class demo1 {
    public static void main(String[] args){
        int n, soDu ,tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        n = sc.nextInt();
        while(n >0){
            soDu = n%10;
            n = n/10;
            tong += soDu;

        }
        System.out.println("Tong cac chu so cua n la: " + tong);
        sc.close();
    }
    
}
