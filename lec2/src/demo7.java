import java.util.*;
/* Đề : viết chương trình tính tổng các số chẵn của mảng */
public class demo7 {
    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so phan tu cua mang :");
            n = sc.nextInt();
        } while( n<0 ); 
            int a[] = new int [n];
            System.out.println("Nhap cac phan tu cua mang :");
            for (int i=0;i<n;i++){
                System.out.println("nhap phan tu mang thu "+i +"la:");
                a[i]=sc.nextInt();
            }
            double Sum=0;
            for ( int i =0;i<n;i++){
                if ( a[i] % 2  ==0){
                Sum +=a[i];
                }
             }
             System.out.println("Tong cac so chan trong mang la: " + Sum );
             sc.close();
        } 
        
    }


