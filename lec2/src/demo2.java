import java.util.*;
//Bài tập : Viết chương trình nhập vào hai số và in ra số nhỏ nhất trong hai số 
// hint : chả có gì cả, chỉ cần dùng if else là được
public class demo2 {
    public static void main(String[] args){
        int a ,b ;
        System.out.print("Nhap so a: ");
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        System.out.print("Nhap so b: ");
        b= sc.nextInt();
        if(a<b){
            System.out.println("So nho nhat la: " + a);
        }else{
            System.out.println("So nho nhat la: " + b);
        }
        sc.close();
    }
}

