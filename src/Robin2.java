import java.util.*;
public class Robin2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int sum1 = (n*(n+1))/2;
            n=n-k;
            int sum2 = (n*(n+1))/2;
            if((sum1-sum2)%2==0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
