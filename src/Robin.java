import java.util.*;
public class Robin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
           int n = sc.nextInt();
           int k = sc.nextInt();
           int[] arr = new int[n];
           for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
           }
           int gold=0;

           int count=0;
           for (int i = 0; i < n; i++) {
               if(arr[i]>=k){
                   gold+=arr[i];
               }
               if(arr[i]==0){
                   if(gold>0){
                       count++;
                       gold--;
                   }
               }
           }
           System.out.println(count);
        }
    }
}
