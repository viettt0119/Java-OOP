import java.util.*;
/* Đề bài : Nhập vào các số nguyên và tính tổng các số đó  nếu tổng > 100 thì kết thúc vòng lặp 
và hiển thị thông báo tổng các số đã nhập 
 */
public class demo4 {
    public static void main(String[] args){
        int number , sum = 0;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Nhap các so nguyen :");
        number =sc.nextInt();
        sum += number; 
        }
        while( sum <100);{
            System.out.print("Tong cac so nguyen la :"+sum);
        }
        sc.close();
    }

}
