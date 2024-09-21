import java.util.*;
public class Robin3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            long sum=0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum+=arr[i];
            }
            Arrays.sort(arr);
            long middle = arr[n/2];
            if(n<=2){
                System.out.println(-1);
            }else{
                System.out.println(Math.max((middle * 2 * n) - sum + 1, 0));
            }


        }
    }
}
