import java.util.*;
public class Sakurako {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                arr[i]--;
            }
            String s = sc.next();
            int [] dp = new int[n];
            Arrays.fill(dp, -1);
            for (int i = 0; i < n; i++) {
                if (dp[i] != -1) {
                    continue;
                }
                int ans = 0;
                int j = i;
                    if (s.charAt(j) == '0') {
                        ans++;
                    }
                j = arr[j];
                while (j != i){
                    if (s.charAt(j) == '0') {
                        ans++;
                    }
                    j = arr[j];
                }
                dp[j] = ans;
                j = arr[j];
                while (j != i) {
                    dp[j]=ans;
                    j=arr[j];
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(dp[i]+" ");
            }
            System.out.println();
        }
    }
}
