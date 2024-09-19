import java.util.*;
public class Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int min = arr[0];
            int max = arr[arr.length - 1];
            int lp=0;
            int rp = max-min;
            int ans = 0;
            while(lp<=rp){
                int mid = lp+(rp-lp)/2;
                int cows=1;
                int last = arr[0];
                for(int j=1;j<n;j++){
                    if(arr[j]-last>=mid){
                        cows++;
                        last=arr[j];
                    }
                    if(cows==c){
                        break;
                    }
                }
                if(cows==c){
                    ans=mid;
                    lp=mid+1;
                }else {
                    rp=mid-1;
                }
            }
            System.out.println(ans);
        }
    }
}
