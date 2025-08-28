import java.util.*;
/* đề : hiển thị các số chia hết cho 5 từ 0 đến 20
 */
public class demo6 {
    public static void main(String[] args){
        System.out.println("Các số bắt đầu chia hết cho 5 là :");
        for(int i=0;i<20 ;i++){
            if(i%5 !=0){
                continue;}

                System.out.println(i);
            }
        }
    }
