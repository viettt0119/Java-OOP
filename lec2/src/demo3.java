import java.util.*;
// Bài tập : Viết chương trình nhập vào số ngày và hiển thị tương ứng trong 1 tuần lễ 
// hint: sử dụng switch case để kiểm tra số ngày
public class demo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so ngay trong tuan :");
        int day = sc.nextInt();
        switch(day){
            case 0:
            System.out.print("Chu Nhat");
                break;
            case 1:
            System.out.print("Thu Hai");
                break;
            case 2:
            System.out.print("Thu Ba");
                break;
            case 3:
            System.out.print("Thu Tu");
                break;
            case 4:
            System.out.print("Thu Nam");
                break;
            case 5:
            System.out.print("Thu Sau");
                break;
            case 6:
            System.out.print("Thu Bay");
                break;
            default:
            System.out.println("Khong hop le");
        }
        sc.close();
    }
    
}
